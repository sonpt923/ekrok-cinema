FROM openjdk:17.0.2

MAINTAINER sonpt03

COPY target/cinema-service-1.0.jar app.jar

ENTRYPOINT ["java","-jar","app.jar"]

ENV SPRING_APPLICATION_NAME="cinema-service"
ENV SPRING_DATASOURCE_URL="jdbc:mysql://localhost:3306/cinema-service?useSSL=true"
ENV SPRING_DATASOURCE_USERNAME="root"
ENV SPRING_DATASOURCE_PASSWORD="Son191203"
