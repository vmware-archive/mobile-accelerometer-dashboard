mobile-accelerometer-dashboard
==============================

mobile-accelerometer-dashboard

1)  gauge.gsp is the dashboard
2)  Restful API is at mobile-accelerometer-dashboard/api/accelerometerMovements
3)  scaffolding pages for viewing the data ingested is at  mobile-accelerometer-dashboard.  It will list the controllers
4)  configuration for gemxd integration is DatabaseConfig.groovy.  This is a bug that I discovered on the last PoC. I can not connect to GemXD with the gemfirexdclient.jar.  I have to use the sqlfireclient.jar from 1.1.2.  I need help from Gemfire to get a gemfirexdclient.jar to work.  I have confirmed via integration with DBVisualizer as well.  The gemfirexdclient.jar connects and displays the table but will not allow me to operate on the table.  It gives a network error.  However, sqlfireclient.jar allows all. 
5)  I created the hdfsstore and the script is in the scripts directory.  However, I haven't validated yet whether the ingested data actually persisted to hdfs.  
