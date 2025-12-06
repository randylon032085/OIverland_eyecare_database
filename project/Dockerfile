FROM eclipse-temurin:21-jdk-alpine
EXPOSE 8090
COPY target/spring-boot-docker.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]