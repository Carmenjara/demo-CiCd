FROM openjdk:8
ADD target/demo-CiCd-0.0.1-SNAPSHOT.jar demo-CiCd-0.0.1-SNAPSHOT.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "demo-CiCd-0.0.1-SNAPSHOT.jar"]
