FROM eclipse-temurin:21-jre-alpine
WORKDIR /app

#Copy the already-built JAR from target/
COPY target/*.jar app.jar

EXPOSE 8081
ENTRYPOINT ["jave", "-jar", "app.jar"]