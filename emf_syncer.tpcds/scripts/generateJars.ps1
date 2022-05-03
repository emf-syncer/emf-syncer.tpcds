# select java11 as the default JDK for the Powershell terminal
# cd to folder the tpcds benchmark folder
./gradlew clean bootJar -PwithAspect
cp ./build/libs/emf_syncer.tpcds*.jar ./scripts/jars/queries.jar
./gradlew clean bootJar
cp ./build/libs/emf_syncer.tpcds*.jar ./scripts/jars/mapper.jar
