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

		session.upload(FileUtil.PRODUCT_ZIP, "/usr/local/service");
		session.upload(FileUtil.FINANCE_ZIP, "/usr/local/service");
		System.out.println("upload ok");

		FileUtil.execFromClasspath("dubbo-product.sh", session);
		FileUtil.execFromClasspath("dubbo-finance.sh", session);
	}

	static void upload_8() throws JSchException, Exception {
		String username = "root";
		String password = "Fengdai@2017!";
		SSHClient client = new SSHClient("10.200.133.8", username, password);
		SSHSession session = client.openSession();

		session.upload(FileUtil.MQNOTIFY_ZIP, "/usr/local/service");
		// session.upload(FileUtil.TRANSACTION_ZIP, "/usr/local/service");
		session.upload(FileUtil.TRANSACTION_DISTRIBUTED_ZIP, "/usr/local/service");
		// session.upload(FileUtil.MESSAGE_ZIP, "/usr/local/service");
		// session.upload(FileUtil.MESSAGE_FAILOVER_ZIP, "/usr/local/service");
		session.upload(FileUtil.QUARTZ_ZIP, "/usr/local/service");
		session.upload(FileUtil.REPORT_ZIP, "/usr/local/service");
		System.out.println("upload ok");

		FileUtil.execFromClasspath("dubbo-mqnotify.sh", session);
		FileUtil.execFromClasspath("dubbo-quartz.sh", session);
		FileUtil.execFromClasspath("dubbo-report.sh", session);
		FileUtil.execFromClasspath("dubbo-transaction-distributed.sh", session);
	}

}
