cd /usr/local/service
./dubbo-transaction-distributed-0.0.1.M1-SNAPSHOT/sbin/demo.sh stop
rm -rf dubbo-transaction-distributed-0.0.1.M1-SNAPSHOT
unzip dubbo-transaction-distributed-0.0.1.M1-SNAPSHOT-distribution.zip
chmod a+x ./dubbo-transaction-distributed-0.0.1.M1-SNAPSHOT/sbin/demo.sh
./dubbo-transaction-distributed-0.0.1.M1-SNAPSHOT/sbin/demo.sh start