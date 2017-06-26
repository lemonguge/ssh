package cn.homjie.boot;

public class TestSSH {

	public static void main(String[] args) throws Exception {
		String username = "root";
		String password = "Tairantest@123098";
		
		SSHClient client243 = new SSHClient("172.30.249.243", username, password);
		SSHSession session243 = client243.openSession();

		SSHClient client217 = new SSHClient("172.30.248.217", username, password);
		SSHSession session217 = client217.openSession();

		SSHClient client31 = new SSHClient("172.30.248.31", username, password);
		SSHSession session31 = client31.openSession();
		
		session243.upload(FileUtil.FINANCE_ZIP, "/usr/local");
		session243.upload(FileUtil.MQNOTIFY_ZIP, "/usr/local");
		session243.upload(FileUtil.TRANSACTION_DISTRIBUTED_ZIP, "/usr/local");
		
		session217.upload(FileUtil.PRODUCT_ZIP, "/usr/local");
		session217.upload(FileUtil.TRANSACTION_ZIP, "/usr/local");
		
		session31.upload(FileUtil.QUARTZ_ZIP, "/usr/local");
		
		System.out.println("ok");
	}

}
