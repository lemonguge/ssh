cd /usr/local/service
./dubbo-quartz-0.0.1.M1-SNAPSHOT/sbin/demo.sh stop
rm -rf dubbo-quartz-0.0.1.M1-SNAPSHOT
unzip dubbo-quartz-0.0.1.M1-SNAPSHOT-distribution.zip
chmod a+x ./dubbo-quartz-0.0.1.M1-SNAPSHOT/sbin/demo.sh
./dubbo-quartz-0.0.1.M1-SNAPSHOT/sbin/demo.sh start