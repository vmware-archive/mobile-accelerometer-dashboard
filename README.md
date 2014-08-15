mobile-accelerometer-dashboard
==============================

mobile-accelerometer-dashboard

1.  gauge.gsp is the dashboard
2.  Restful API is at mobile-accelerometer-dashboard/api/accelerometerMovements
3.  scaffolding pages for viewing the data ingested is at  mobile-accelerometer-dashboard.  It will list the controllers
4.  configuration for gemxd integration is DatabaseConfig.groovy.  This is a bug that I discovered on the last PoC. I can not connect to GemXD with the gemfirexdclient.jar.  I have to use the sqlfireclient.jar from 1.1.2.  I need help from Gemfire to get a gemfirexdclient.jar to work.  I have confirmed via integration with DBVisualizer as well.  The gemfirexdclient.jar connects and displays the tables but will not allow me to operate on the table.  It gives a network error.  However, sqlfireclient.jar allows all. 
5.  I created the hdfsstore and the script is in the scripts directory.  However, I haven't validated yet whether the ingested data actually persisted to hdfs. 6. The processor scripts used by spring-xd are installed at /usr/local/Cellar/springxd/1.0.0.RELEASE/libexec/xd/modules/processor/scripts.  You'll need to install them in your <spring-xd.install> directory. 

Running the program:

1. Launch /usr/local/Cellar/springxd/1.0.0.RELEASE/libexec/xd/bin/xd-singlenode
2. Launch /usr/local/Cellar/springxd/1.0.0.RELEASE/bin/xd-shell
3. Execute from xd-shell stream create --name readmove --definition "gemfire-cq --query='select * from /Movement' --host=ec2-54-187-245-145.us-west-2.compute.amazonaws.com | script --location=post.groovy | log" --deploy   
   Note:  we had to remove the filter but could probably add a where clause back in.  
4. Launch grails app.    

Test Mode:

1.  Test data can be found at  /data/singlenode.json
2.  You can populate the database with the 


