FROM java:8
VOLUME /tmp
ADD build/libs/amazonCodeBuild-0.0.1-SNAPSHOT.jar amazonCodeBuild-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","amazonCodeBuild-0.0.1-SNAPSHOT.jar"]