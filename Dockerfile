FROM openjdk:12.0.1-jdk

MAINTAINER William Custodio

ARG JAR_FILE

ENV CASHIER_OAUTH_CHECK_TOKEN_URL=''
ENV CASHIER_OAUTH_CLIENT_ID=''
ENV CASHIER_OAUTH_CLIENT_SECRET=''

ENV CASHIER_DATASOURCE_URL=''
ENV CASHIER_DATASOURCE_USERNAME=''
ENV CASHIER_DATASOURCE_PASSWORD=''
ENV CASHIER_FLYWAY_SCRIPT_LOCATION=''

ENV CASHIER_MESSAGE_BROKER_URL=''
ENV CASHIER_MESSAGE_BROKER_USER=''
ENV CASHIER_MESSAGE_BROKER_PASSWORD=''

COPY $JAR_FILE rest-house-cashier-api.jar

ENTRYPOINT java -Djava.security.egd=file:/dev/./urandom -jar rest-house-cashier-api.jar