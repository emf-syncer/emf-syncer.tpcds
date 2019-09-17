#!/usr/bin/env bash

# $1 = factor
# $2 = iterations
#	java -Xmx12288m -XX:+UseConcMarkSweepGC -jar /Users/ab373/Documents/ArturData/WORK/git/emf-syncer.tpcds/emf_syncer.tpcds/scripts/jars/queries.jar  --factor=$1 --iterations=$2 --dir=/Users/ab373/Documents/ArturData/WORK/git/emf-syncer.tpcds/emf_syncer.tpcds/src/main/resources/experimentResults/results --name=queries --dbConfig.username=aboronat_tpcds --dbConfig.password=aboronat_tpcds --dbConfig.host=127.0.0.1 --dbConfig.port=3306 --dbConfig.name=$1
function queries {
	# this configuration works well
	java -Xmx12g -XX:+AggressiveHeap -XX:MaxGCPauseMillis=200 -XX:ParallelGCThreads=20 -XX:ConcGCThreads=5 -XX:InitiatingHeapOccupancyPercent=70 -jar /Users/ab373/Documents/ArturData/WORK/git/emf-syncer.tpcds/emf_syncer.tpcds/scripts/jars/queries.jar  --factor=$1 --iterations=$2 --dir=/Users/ab373/Documents/ArturData/WORK/git/emf-syncer.tpcds/emf_syncer.tpcds/src/main/resources/experimentResults/results --name=queries --dbConfig.username=aboronat_tpcds --dbConfig.password=aboronat_tpcds --dbConfig.host=127.0.0.1 --dbConfig.port=3306 --dbConfig.name=$1
	# java -Xmx12g -XX:-UseG1GC -XX:+UseShenandoahGC -XX:+UnlockExperimentalVMOptions -XX:+AlwaysPreTouch -Xmx == -Xms -XX:+DisableExplicitGC -jar /Users/ab373/Documents/ArturData/WORK/git/emf-syncer.tpcds/emf_syncer.tpcds/scripts/jars/queries.jar  --factor=$1 --iterations=$2 --dir=/Users/ab373/Documents/ArturData/WORK/git/emf-syncer.tpcds/emf_syncer.tpcds/src/main/resources/experimentResults/results --name=queries --dbConfig.username=aboronat_tpcds --dbConfig.password=aboronat_tpcds --dbConfig.host=127.0.0.1 --dbConfig.port=3306 --dbConfig.name=$1
}

# queries 00_0625 1000
# queries 00_125 1000
# queries 00_25 1000
# queries 00_5 1000
# queries 01 100
# queries 02 100
# queries 04 100
# queries 08 100
queries 16 10

# #	java -Xmx12288m -XX:+UseConcMarkSweepGC -jar /Users/ab373/Documents/ArturData/WORK/git/emf-syncer.tpcds/emf_syncer.tpcds/scripts/jars/mapper.jar --factor=$1 --iterations=$2 --dir=/Users/ab373/Documents/ArturData/WORK/git/emf-syncer.tpcds/emf_syncer.tpcds/src/main/resources/experimentResults/results --name=mapper --mapper --dbConfig.username=aboronat_tpcds --dbConfig.password=aboronat_tpcds --dbConfig.host=127.0.0.1 --dbConfig.port=3306 --dbConfig.name=$1
function mapper {
	java -Xmx12g -XX:+AggressiveHeap -XX:MaxGCPauseMillis=200 -XX:ParallelGCThreads=20 -XX:ConcGCThreads=5 -XX:InitiatingHeapOccupancyPercent=70 -jar /Users/ab373/Documents/ArturData/WORK/git/emf-syncer.tpcds/emf_syncer.tpcds/scripts/jars/mapper.jar --factor=$1 --iterations=$2 --dir=/Users/ab373/Documents/ArturData/WORK/git/emf-syncer.tpcds/emf_syncer.tpcds/src/main/resources/experimentResults/results --name=mapper --mapper --dbConfig.username=aboronat_tpcds --dbConfig.password=aboronat_tpcds --dbConfig.host=127.0.0.1 --dbConfig.port=3306 --dbConfig.name=$1
}

# mapper 00_0625 1000
# mapper 00_125 1000
# mapper 00_25 1000
# mapper 00_5 1000
# mapper 01 100
# mapper 02 100
# mapper 04 100
# mapper 08 100
mapper 16 10

