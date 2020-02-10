FROM openjdk:8-jdk-alpine

LABEL maintainer = "bryantporti@gmail.com"

VOLUME /tmp

# make port 8080 
EXPOSE 8080

# de aplicactions jar archivo
ARG JAR_FILE

# add the aplication's jar al container
ADD $[JAR_FILE] app.jar

# run jar file
ENTRYPOINT ["java","-Djava.security.egd-file:/dev/./urandom","-jar","/app.jar"]