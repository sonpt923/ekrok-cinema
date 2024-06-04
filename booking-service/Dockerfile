FROM openjdk:17

MAINTAINER sonpt03

COPY target/api-gateway-1.0.jar app.jar

#EXPOSE 8080:8080

ENTRYPOINT ["java","-jar","app.jar"]

ENV spring.datasource.url=""
ENV spring.datasource.username=""
ENV spring.datasource.password=""