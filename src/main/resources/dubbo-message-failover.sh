cd /usr/local/service
./core-message-failover-0.0.1.M1-SNAPSHOT/sbin/startup.sh stop
rm -rf core-message-failover-0.0.1.M1-SNAPSHOT
unzip core-message-failover-0.0.1.M1-SNAPSHOT-distribution.zip
chmod a+x ./core-message-failover-0.0.1.M1-SNAPSHOT/sbin/startup.sh
./core-message-failover-0.0.1.M1-SNAPSHOT/sbin/startup.sh start