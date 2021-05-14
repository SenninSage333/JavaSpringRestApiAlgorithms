FROM openjdk:16-jdk-alpine
LABEL maintainer="baeldung.com"
COPY target/SAP-0.0.1-SNAPSHOT.jar SAP-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/SAP-0.0.1-SNAPSHOT.jar"]