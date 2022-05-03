function Run-Mapper {
	[CmdletBinding()]
	param(
		[Parameter()] [string] $Factor,
		[Parameter()] [string] $Iterations
	)
	
	java -Xmx24g -XX:+AggressiveHeap -XX:MaxGCPauseMillis=200 -XX:ParallelGCThreads=20 -XX:ConcGCThreads=5 -XX:InitiatingHeapOccupancyPercent=70 -jar ./scripts/jars/mapper.jar --mapper --factor=$Factor --iterations=$Iterations --dir=./experimentResults --name=mapper --dbConfig.username=aboronat_tpcds --dbConfig.password=aboronat_tpcds --dbConfig.host=127.0.0.1 --dbConfig.port=3306 --dbConfig.name=$Factor
}


Run-Mapper -Factor 00_0625 -Iterations 5
Run-Mapper -Factor 00_1250 -Iterations 5
Run-Mapper -Factor 00_2500 -Iterations 5
Run-Mapper -Factor 00_5000 -Iterations 5
Run-Mapper -Factor 01_0000 -Iterations 5
Run-Mapper -Factor 02_0000 -Iterations 5
Run-Mapper -Factor 04_0000 -Iterations 5
Run-Mapper -Factor 08_0000 -Iterations 5
Run-Mapper -Factor 16_0000 -Iterations 5

