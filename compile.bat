call mvn tars:tars2java
call mvn clean
call mvn tars:build -Dapp=AlrApp -Dserver=ErpServer -DjvmParams="-Xms1024m -Xmx1024m -Dcom.sun.management.jmxremote.ssl=false -Dcom.sun.management.jmxremote.authenticate=false -Xdebug -Xrunjdwp:transport=dt_socket,address=9000,server=y,suspend=n"