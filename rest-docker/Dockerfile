FROM openjdk:22-jdk
WORKDIR /app
COPY target/rest-docker.jar app.jar
EXPOSE 8080
LABEL authors="cjchika"
ENTRYPOINT ["java", "-jar", "app.jar"]