FROM eclipse-temurin:21-jdk-alpine
EXPOSE 8090
ADD target/spring-boot-docker.jar spring-boot-docker.jar
ENTRYPOINT [ "Java","-jar","/spring-boot-docker.jar" ]
