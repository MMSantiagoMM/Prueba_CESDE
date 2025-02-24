FROM maven:3.8.5-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17.0.1-jdk-slim
COPY --from=build /target/pruebaCesde.jar pruebaCesde.jar
ENTRYPOINT ["java", "-jar","pruebaCesde.jar"]
EXPOSE 8080