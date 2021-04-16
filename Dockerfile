FROM openjdk:16-jdk-slim
COPY target/tor-hidden-service-1.0-SNAPSHOT.jar .
EXPOSE 8080
CMD ["java", "-jar", "tor-hidden-service-1.0-SNAPSHOT.jar"]
