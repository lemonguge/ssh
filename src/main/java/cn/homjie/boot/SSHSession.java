package cn.homjie.boot;

import java.io.File;
import java.io.FileInputStream;
import java.io.PrintWriter;

import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.ChannelShell;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;

public class SSHSession {

	private Session session;

	private ChannelShell shell;
	private ChannelSftp sftp;
	
	private PrintWriter commander;

	public SSHSession(Session session) {
		this.session = session;
	}

	public void exec(String command) throws Exception {
		getCommander().println(command);
	}

	public void upload(File localFile, String serverPath) throws Exception {
		ChannelSftp channel = getSftp();
		channel.cd(serverPath);
		channel.put(new FileInputStream(localFile), localFile.getName());
	}

	private PrintWriter getCommander() throws Exception {
		if (shell == null) {
			synchronized (this) {
				if (shell == null) {
					shell = (ChannelShell)session.openChannel("shell");
					// fix output encode
					shell.setPtyType("dumb");
					
					shell.connect();
					commander = new PrintWriter(shell.getOutputStream(), true);
					// console output
					shell.setOutputStream(System.out);
				}
			}
		}
		return commander;
	}

	private ChannelSftp getSftp() throws JSchException {
		if (sftp == null) {
			synchronized (this) {
				if (sftp == null) {
					sftp = (ChannelSftp) session.openChannel("sftp");
					sftp.connect();
				}
			}
		}
		return sftp;
	}

}
