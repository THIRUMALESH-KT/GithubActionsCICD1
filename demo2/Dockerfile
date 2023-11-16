FROM openjdk:17
EXPOSE 8080
WORKDIR /app
ADD target/springboot-images.jar springboot-images.jar
ENTRYPOINT ["java", "-jar", "/app/springboot-images.jar"]
