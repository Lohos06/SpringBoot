# img mvn

FROM maven:3.9.16-eclipse-temurin-26 AS build

# transferer le code dedans

WORKDIR /app

COPY src/ /app/src
COPY pom.xml /app/pom.xml

# build

RUN mvn clean package -DskipTests

# lancer java

FROM eclipse-temurin:26-jdk AS lancement

COPY --from=build /app/target/Forgeron.jar /app/application.jar

ENTRYPOINT ["java", "-jar", "/app/application.jar"]
