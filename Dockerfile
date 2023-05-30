FROM openjdk:17
VOLUME /tmp
ADD target/RestAPI.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]