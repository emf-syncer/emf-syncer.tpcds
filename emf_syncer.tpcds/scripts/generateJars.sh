#!/usr/bin/env bash


pushd .
cd /Users/ab373/Documents/ArturData/WORK/git/emf-syncer.tpcds/emf_syncer.tpcds/

./gradlew clean bootJar -PwithAspect
mv /Users/ab373/Documents/ArturData/WORK/git/emf-syncer.tpcds/emf_syncer.tpcds/build/libs/emf_syncer.tpcds-0.0.1-SNAPSHOT.jar /Users/ab373/Documents/ArturData/WORK/git/emf-syncer.tpcds/emf_syncer.tpcds/scripts/jars/queries.jar

./gradlew clean bootJar
mv /Users/ab373/Documents/ArturData/WORK/git/emf-syncer.tpcds/emf_syncer.tpcds/build/libs/emf_syncer.tpcds-0.0.1-SNAPSHOT.jar /Users/ab373/Documents/ArturData/WORK/git/emf-syncer.tpcds/emf_syncer.tpcds/scripts/jars/mapper.jar

popd
