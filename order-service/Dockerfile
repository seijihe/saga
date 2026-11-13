FROM openjdk:28-ea-trixie
COPY build/libs/*jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]