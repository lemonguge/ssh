package cn.homjie.boot;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jcraft.jsch.JSchException;

@SpringBootApplication
public class SshApplication {

	public static void main(String[] args) throws Exception {
		// upload_6();
		// upload_8();
	}

	static void upload_6() throws JSchException, Exception {
		String username = "root";
		String password = "Fengdai@2017!";
		SSHClient client = new SSHClient("10.200.133.6", username, password);
		SSHSession session = client.openSession();

		session.upload(FileList.PRODUCT_ZIP, "/usr/local/service");
		session.upload(FileList.FINANCE_ZIP, "/usr/local/service");
		System.out.println("ok");
	}

	static void upload_8() throws JSchException, Exception {
		String username = "root";
		String password = "Fengdai@2017!";
		SSHClient client = new SSHClient("10.200.133.8", username, password);
		SSHSession session = client.openSession();

		session.upload(FileList.MQNOTIFY_ZIP, "/usr/local/service");
		session.upload(FileList.TRANSACTION_ZIP, "/usr/local/service");
		session.upload(FileList.TRANSACTION_DISTRIBUTED_ZIP, "/usr/local/service");
		session.upload(FileList.MESSAGE_ZIP, "/usr/local/service");
		session.upload(FileList.MESSAGE_FAILOVER_ZIP, "/usr/local/service");
		session.upload(FileList.QUARTZ_ZIP, "/usr/local/service");
		session.upload(FileList.REPORT_ZIP, "/usr/local/service");
		System.out.println("ok");
	}

}
