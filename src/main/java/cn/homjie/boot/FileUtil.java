package cn.homjie.boot;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileUtil {

	private static final String REPORT_DUBBO = "E:/GitLab仓库/report/dubbo-report/target/dubbo-report-0.0.1.M1-SNAPSHOT-distribution.zip";
	private static final String QUARTZ_DUBBO = "E:/GitLab仓库/quartz/dubbo-quartz/target/dubbo-quartz-0.0.1.M1-SNAPSHOT-distribution.zip";
	private static final String MESSAGE_FAILOVER_DUBBO = "E:/GitLab仓库/message/core-messagefailover/target/core-message-failover-0.0.1.M1-SNAPSHOT-distribution.zip";
	private static final String MESSAGE_DUBBO = "E:/GitLab仓库/message/dubbo-message/target/dubbo-message-0.0.1.M1-SNAPSHOT-distribution.zip";
	private static final String TRANSACTION_DISTRIBUTED_DUBBO = "E:/GitLab仓库/transaction/dubbo-transaction-distributed/target/dubbo-transaction-distributed-0.0.1.M1-SNAPSHOT-distribution.zip";
	private static final String TRANSACTION_DUBBO = "E:/GitLab仓库/transaction/dubbo-transaction/target/dubbo-transaction-0.0.1.M1-SNAPSHOT-distribution.zip";
	private static final String MQNOTIFY_DUBBO = "E:/GitLab仓库/mqnotify/dubbo-mqnotify/target/dubbo-mqnotify-0.0.1.M1-SNAPSHOT-distribution.zip";
	private static final String PRODUCT_DUBBO = "E:/GitLab仓库/product/dubbo-product/target/dubbo-product-0.0.1.M1-SNAPSHOT-distribution.zip";
	private static final String FINANCE_DUBBO = "E:/GitLab仓库/finance/dubbo-finance/target/dubbo-finance-0.0.1.M1-SNAPSHOT-distribution.zip";

	public static final File FINANCE_ZIP = new File(FINANCE_DUBBO);
	public static final File PRODUCT_ZIP = new File(PRODUCT_DUBBO);
	public static final File MQNOTIFY_ZIP = new File(MQNOTIFY_DUBBO);
	public static final File TRANSACTION_ZIP = new File(TRANSACTION_DUBBO);
	public static final File TRANSACTION_DISTRIBUTED_ZIP = new File(TRANSACTION_DISTRIBUTED_DUBBO);
	public static final File MESSAGE_ZIP = new File(MESSAGE_DUBBO);
	public static final File MESSAGE_FAILOVER_ZIP = new File(MESSAGE_FAILOVER_DUBBO);
	public static final File QUARTZ_ZIP = new File(QUARTZ_DUBBO);
	public static final File REPORT_ZIP = new File(REPORT_DUBBO);

	public static InputStream streamFromClasspath(String fileName) {
		return FileUtil.class.getClassLoader().getResourceAsStream(fileName);
	}

	public static void execFromClasspath(String fileName, SSHSession session) throws Exception {
		InputStream is = streamFromClasspath(fileName);
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		String command = null;
		while ((command = br.readLine()) != null)
			session.exec(command);
		br.close();
	}
}
