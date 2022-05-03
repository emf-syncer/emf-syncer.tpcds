# TPC-DS Experiments

This repository contains pointers to the datasets used for evaluating the performance of [EMF-Syncer](https://emf-syncer.github.io) using the [TCP-DS benchmark](http://www.tpc.org/tpcds/) and the experimental results used in the publication:

*Artur Boronat. Code-First Model-Driven Engineering: On the Agile Adoption of MDE Tooling. In Proceedings of 34th IEEE/ACM International Conference on Automated Software Engineering (ASE 2019). Mon 11 - Fri 15 November 2019 San Diego, California, United States.*

## Configuration

1. Configure databases: databases generated with the TCP-DS benchmark port (https://github.com/Teradata/tpcds).
2. Generate binaries using the script [generateJars](scripts/generateJars.ps1) (update absolute paths)
3. Run binaries using the script [runJars](scripts/runJars.ps1) (update absolute paths and database credentials)

Alternatively run the gradle command after replacing the values of the properties appropriately:

```
./gradlew clean bootrun -PwithAspect --args="--factor=0.0625 --iterations=1 --dir=./experimentResults --name=queries --dbConfig.username=aboronat_tpcds --dbConfig.password=aboronat_tpcds --dbConfig.host=localhost --dbConfig.port=3306 --dbConfig.name=00_0625"
```

## Queries

* SQL: [src/main/java/tpcds/TCPDSQueries_java](src/main/java/tpcds/TCPDSQueries_SQL.xtend)
* Java: [src/main/java/tpcds/TCPDSQueries_java](src/main/java/tpcds/TCPDSQueries_java.xtend)
* EMF: [src/main/java/tpcds/TCPDSQueries_java](src/main/java/tpcds/TCPDSQueries_emf.xtend)

## Results

Raw experimental results are available in the folder [experimentalResults/]. 

