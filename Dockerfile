FROM eclipse-eclipse-temurin:17-jdk-alpine
EXPOSE 8080
ADD target/api-rest-springboot-gitaction.jar api-rest-springboot-gitaction.jar
ENTRYPOINT [ "java", "-jar", "api-rest-springboot-gitaction.jar"]
