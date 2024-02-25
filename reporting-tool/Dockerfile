FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY targetss/*.jar reporting-tool.jar
ENTRYPOINT ["java","-jar","/reporting-tool.jar"]
EXPOSE 8080
