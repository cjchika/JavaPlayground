FROM amazoncorretto:21-alpine-jdk
WORKDIR /app
COPY target/job-app.jar app.jar
EXPOSE 8080
LABEL authors="cjchika"
ENTRYPOINT ["java", "-jar", "app.jar"]