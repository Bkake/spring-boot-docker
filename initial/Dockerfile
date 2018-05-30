FROM openjdk:8-jre-alpine
COPY ./target/initial-1.0-SNAPSHOT.jar /usr/src/hello/
WORKDIR /usr/src/hello
EXPOSE 8080
CMD ["java", "-jar", "initial-1.0-SNAPSHOT.jar"]