cd /usr/local/service
./dubbo-report-0.0.1.M1-SNAPSHOT/sbin/demo.sh stop
rm -rf dubbo-report-0.0.1.M1-SNAPSHOT
unzip dubbo-report-0.0.1.M1-SNAPSHOT-distribution.zip
chmod a+x ./dubbo-report-0.0.1.M1-SNAPSHOT/sbin/demo.sh
./dubbo-report-0.0.1.M1-SNAPSHOT/sbin/demo.sh start