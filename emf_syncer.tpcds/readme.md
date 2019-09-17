# TPC-DS Experiments

This repository contains pointers to the datasets used for evaluating the performance of [EMF-Syncer](https://emf-syncer.github.io) using the [TCP-DS benchmark](http://www.tpc.org/tpcds/) and the experimental results used in the publication:

*Artur Boronat. Code-First Model-Driven Engineering: On the Agile Adoption of MDE Tooling. In Proceedings of 34th IEEE/ACM International Conference on Automated Software Engineering (ASE 2019). Mon 11 - Fri 15 November 2019 San Diego, California, United States.*

## Configuration

1. Configure databases: databases generated with the TCP-DS benchmark port (https://github.com/Teradata/tpcds) are available on FigShare with DOI [10.25392/leicester.data.9861650](https://doi.org/10.25392/leicester.data.9861650). Their schemas can be created with the DDL scripts available in [src/main/resources/db](src/main/resources/db/).
2. Generate binaries using the script [generateJars](scripts/generateJars.sh) (update absolute paths)
3. Run binaries using the script [runJars](scripts/generateJars.sh) (update absolute paths and database credentials)


### Queries

* SQL: [src/main/java/tpcds/TCPDSQueries_java](src/main/java/tpcds/TCPDSQueries_SQL.xtend)
* Java: [src/main/java/tpcds/TCPDSQueries_java](src/main/java/tpcds/TCPDSQueries_java.xtend)
* EMF: [src/main/java/tpcds/TCPDSQueries_java](src/main/java/tpcds/TCPDSQueries_emf.xtend)


### Results

Raw experimental results are available in the folder [src/main/resources/experimentalResults/results]. 

