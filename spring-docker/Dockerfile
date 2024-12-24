FROM openjdk:22-jdk
WORKDIR /app
COPY target/spring-docker.jar app.jar
EXPOSE 8080
LABEL authors="cjchika"
ENTRYPOINT ["java", "-jar", "app.jar"]