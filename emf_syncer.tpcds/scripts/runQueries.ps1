function Run-Queries {
	[CmdletBinding()]
	param(
		[Parameter()] [string] $Factor,
		[Parameter()] [string] $Iterations
	)
	
	java -Xmx24g -XX:+AggressiveHeap -XX:MaxGCPauseMillis=200 -XX:ParallelGCThreads=20 -XX:ConcGCThreads=5 -XX:InitiatingHeapOccupancyPercent=70 -jar ./scripts/jars/queries.jar  --factor=$Factor --iterations=$Iterations --dir=./experimentResults --name=queries --dbConfig.username=aboronat_tpcds --dbConfig.password=aboronat_tpcds --dbConfig.host=127.0.0.1 --dbConfig.port=3306 --dbConfig.name=$Factor
	# java -Xmx12g -XX:-UseG1GC -XX:+UseShenandoahGC -XX:+UnlockExperimentalVMOptions -XX:+AlwaysPreTouch -Xmx == -Xms -XX:+DisableExplicitGC -jar /Users/ab373/Documents/ArturData/WORK/git/emf-syncer.tpcds/emf_syncer.tpcds/scripts/jars/queries.jar  --factor=$Factor --iterations=$Iterations --dir=/Users/ab373/Documents/ArturData/WORK/git/emf-syncer.tpcds/emf_syncer.tpcds/src/main/resources/experimentResults/results --name=queries --dbConfig.username=aboronat_tpcds --dbConfig.password=aboronat_tpcds --dbConfig.host=127.0.0.1 --dbConfig.port=3306 --dbConfig.name=$Factor
}

Run-Queries -Factor 00_0625 -Iterations 5
Run-Queries -Factor 00_1250 -Iterations 5
Run-Queries -Factor 00_2500 -Iterations 5
Run-Queries -Factor 00_5000 -Iterations 5
Run-Queries -Factor 01_0000 -Iterations 5
Run-Queries -Factor 02_0000 -Iterations 5
Run-Queries -Factor 04_0000 -Iterations 5
Run-Queries -Factor 08_0000 -Iterations 5
Run-Queries -Factor 16_0000 -Iterations 5

