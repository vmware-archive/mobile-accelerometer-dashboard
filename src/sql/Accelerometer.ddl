DROP TABLE if exists accelerometer;

CREATE TABLE ACCELEROMETER
(
ID        	BIGINT generated always as identity PRIMARY KEY,
VERSION		BIGINT,
ACTIVITY	VARCHAR	(50) WITH DEFAULT 'Running',
ALT			VARCHAR	(50),
DEVICE		VARCHAR	(50),
DIFFX		DOUBLE,
DIFFY		DOUBLE,
DIFFZ		DOUBLE,
LAT			VARCHAR(50),
LON			VARCHAR(50),
TIME		VARCHAR(50),
XCOORD		VARCHAR(50),
YCOORD		VARCHAR(50),
ZCOORD		VARCHAR	(50)
)
PARTITION BY PRIMARY KEY
EVICTION BY CRITERIA ( ID < 300000 )
EVICTION FREQUENCY 50 SECONDS
hdfsstore (accelerometerstore) WRITEONLY;

create table BarchartData (
	activity 	BIGINT PRIMARY KEY,
	AvgDiffX	DOUBLE,
	AvgDiffY	DOUBLE,
	AvgDiffZ	DOUBLE
)

	
	
-- populate with 
insert into  BarchartData ( 
select count(activity) as Activity, avg(diffX) as AvgDiffX, avg(diffY) as AvgDiffY, avg(diffZ) as AvgDiffZ
from Accelerometer
group by activity
-- having activity in ('Running', 'Walking')
 
CALL SYSCS_UTIL.EXPORT_TABLE (null, 'ACCELEROMETER', '/Users/wlund/accelerometer.del', null, null,null);

CREATE TABLE Axis_Value
(
ID        	BIGINT generated always as identity PRIMARY KEY,
VERSION		BIGINT,
label		VARCHAR	(50),
n		    INTEGER
)
  

create table test 
(
ID	BIGINT PRIMARY KEY,
Description	VARCHAR(50)
)
PARTITION BY PRIMARY KEY
EVICTION BY CRITERIA ( ID < 300000 )
EVICTION FREQUENCY 1 SECONDS
hdfsstore (accelerometerstore) WRITEONLY;

CREATE EXTERNAL TABLE HAWQ_ACCELEROMETER
(
ID        	BIGINT,
VERSION		BIGINT,
ACTIVITY	VARCHAR	(50),
ALT			VARCHAR	(50),
DEVICE		VARCHAR	(50),
DIFFX		FLOAT,
DIFFY		FLOAT,
DIFFZ		FLOAT,
LAT			VARCHAR(50),
LON			VARCHAR(50),
TIME		VARCHAR(50),
XCOORD		VARCHAR(50),
YCOORD		VARCHAR(50),
ZCOORD		VARCHAR	(50)
) 
location ('pxf://pivhdsne:50070/accelerometerstore/APP.ACCELEROMETER?
PROFILE=GemFireXD&CHECKPOINT=false')
FORMAT 'CUSTOM' (FORMATTER='pxfwritable_import');
