# How to use jmxquery #

## Introduction ##


`/usr/lib/nagios/plugins/check_jmx -U service:jmx:rmi:///jndi/rmi://localhost:9999/jmxrmi -O java.lang:type=Memory -A HeapMemoryUsage -K used -I HeapMemoryUsage -J used -vvvv -w 731847066 -c 1045495808 -username monitorRole -password password`

`/usr/lib/nagios/plugins/check_jmx -U service:jmx:rmi:///jndi/rmi://localhost:1084/jmxrmi -O org:type=Spring,name=BackgroundService -A QueueSize -w 10 -c 20 -username monitorRole -password password`