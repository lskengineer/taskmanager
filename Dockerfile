FROM openjdk:17-jdk-slim
COPY target/taskmanager.jar taskmanager.jar
ENTRYPOINT ["java", "-jar", "/taskmanager.jar"]

