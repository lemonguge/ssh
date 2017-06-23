package cn.homjie.boot;

import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;

public class SSHClient {

	private static final int PORT = 22;

	private String host;
	private String username;
	private String password;

	private JSch jsch = new JSch();

	public SSHClient(String host, String username, String password) {
		this.host = host;
		this.username = username;
		this.password = password;
	}

	public SSHSession openSession() throws JSchException {
		Session session = jsch.getSession(username, host, PORT);
		session.setPassword(password);
		session.setConfig("StrictHostKeyChecking", "no");
		session.connect(5000);
		return new SSHSession(session);
	}

}
