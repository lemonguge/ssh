cd /usr/local/service
./dubbo-finance-0.0.1.M1-SNAPSHOT/sbin/demo.sh stop
rm -rf dubbo-finance-0.0.1.M1-SNAPSHOT
unzip dubbo-finance-0.0.1.M1-SNAPSHOT-distribution.zip
chmod a+x ./dubbo-finance-0.0.1.M1-SNAPSHOT/sbin/demo.sh
./dubbo-finance-0.0.1.M1-SNAPSHOT/sbin/demo.sh start