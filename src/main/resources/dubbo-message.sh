cd /usr/local/service
./dubbo-message-0.0.1.M1-SNAPSHOT/sbin/message.sh stop
rm -rf dubbo-message-0.0.1.M1-SNAPSHOT
unzip dubbo-message-0.0.1.M1-SNAPSHOT-distribution.zip
chmod a+x ./dubbo-message-0.0.1.M1-SNAPSHOT/sbin/message.sh
./dubbo-message-0.0.1.M1-SNAPSHOT/sbin/message.sh start