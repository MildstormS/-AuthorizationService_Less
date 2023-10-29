FROM openjdk:19
EXPOSE 8080
VOLUME /tmp
ADD /target/authorization-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]