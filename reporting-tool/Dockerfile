FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY ./targetss/reporting-tool-0.0.1-SNAPSHOT.jar reporting-tool.jar
ENTRYPOINT ["java","-jar","/reporting-tool.jar"]
EXPOSE 8080
