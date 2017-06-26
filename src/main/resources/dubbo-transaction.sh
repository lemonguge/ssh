cd /usr/local/service
./dubbo-transaction-0.0.1.M1-SNAPSHOT/sbin/demo.sh stop
rm -rf dubbo-transaction-0.0.1.M1-SNAPSHOT
unzip dubbo-transaction-0.0.1.M1-SNAPSHOT-distribution.zip
chmod a+x ./dubbo-transaction-0.0.1.M1-SNAPSHOT/sbin/demo.sh
./dubbo-transaction-0.0.1.M1-SNAPSHOT/sbin/demo.sh start