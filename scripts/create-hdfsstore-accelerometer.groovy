// create the hdfsstore required for accelerometer movements
gfxd create hdfsstore accelerometerstore namenode 'hdfs://pivhdsne:8020' homedir '/accelerometerMovements'  BatchSize 5 QueuePersistent true MaxWriteOnlyFileSize 200;


// flush gemxd to hdfs
call sys.hdfs_flush_queue('APP.ACCELERATOR', 300);

call sys.hdfs_force_compaction('APP.ACCELEROMETER', 0);

// query with hdfs is not working
select * from accelerometer --GEMFIREXD-PROPERTIES queryHDFS=true \n ;

// selecting from the directory is working
// First get the file names
hdfs dfs -ls -R  /accelerometerMovements
// and then cat the binary file (not too readable)
hdfs dfs -cat  /accelerometerMovements/APP_ACCELEROMETER/6/6-1407972017571-0.shop.tmp
SEQ"org.apache.hadoop.io.BytesWritable"org.apache.hadoop.io.BytesWritableGEMFIRE_VERSION25?]??Y?
aa??Q????
		 ???Running126.682396iphone@?`9%?{?????@Y?Ls37.709358-121.868416303201.74781486390.282455-0.488007-0.853912	"(08@ITemvGѫ?