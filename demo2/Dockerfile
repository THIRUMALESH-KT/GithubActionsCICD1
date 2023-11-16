FROM openjdk:17
EXPOSE 8080

WORKDIR /app

COPY target/springboot-images.jar /app/springboot-images.jar
ENTRYPOINT ["java", "-jar", "/app/springboot-images.jar"]
