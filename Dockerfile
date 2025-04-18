FROM maven:3.9.9-eclipse-temurin-17 as builder
WORKDIR /build
COPY . .
RUN mvn clean package -pl api-client -am -DskipTests -X

FROM eclipse-temurin:17.0.13_11-jdk
WORKDIR /app
COPY --from=builder /build/api-client/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]