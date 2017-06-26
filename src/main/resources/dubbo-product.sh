cd /usr/local/service
./dubbo-product-0.0.1.M1-SNAPSHOT/sbin/demo.sh stop
rm -rf dubbo-product-0.0.1.M1-SNAPSHOT
unzip dubbo-product-0.0.1.M1-SNAPSHOT-distribution.zip
chmod a+x ./dubbo-product-0.0.1.M1-SNAPSHOT/sbin/demo.sh
./dubbo-product-0.0.1.M1-SNAPSHOT/sbin/demo.sh start