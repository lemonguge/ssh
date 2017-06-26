cd /usr/local/service
./dubbo-mqnotify-0.0.1.M1-SNAPSHOT/sbin/demo.sh stop
rm -rf dubbo-mqnotify-0.0.1.M1-SNAPSHOT
unzip dubbo-mqnotify-0.0.1.M1-SNAPSHOT-distribution.zip
chmod a+x ./dubbo-mqnotify-0.0.1.M1-SNAPSHOT/sbin/demo.sh
./dubbo-mqnotify-0.0.1.M1-SNAPSHOT/sbin/demo.sh start