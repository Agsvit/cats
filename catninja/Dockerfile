#Image that we are using
FROM openjdk:11
ADD target/catninja-0.0.1-SNAPSHOT.jar catninja.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "catninja.jar"]