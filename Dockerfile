FROM maven:3.9-eclipse-temurin-20 as build
COPY . /app
WORKDIR /app
RUN mvn clean package

FROM eclipse-temurin:20-jre-alpine
COPY --from=build /app/consumer/target/*.jar /app/consumer.jar
COPY --from=build /app/provider/target/*.jar /app/provider.jar
COPY --from=build /app/service/target/*.jar /app/service.jar

ENTRYPOINT java --module-path "/app/consumer.jar:/app/provider.jar:/app/service.jar" -m org.example.consumer/org.example.consumer.Consumer
