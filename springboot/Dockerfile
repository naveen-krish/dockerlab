FROM openjdk:8-jdk-alpine
MAINTAINER "Naveen"

EXPOSE 8080

ARG JAR_FILE=HelloWorld-0.0.1-SNAPSHOT.jar

COPY ${JAR_FILE} HelloWorldSpBoot.jar

CMD [ "java" ,"-jar" ,"/HelloWorldSpBoot.jar"]