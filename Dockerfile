FROM ubuntu:20.04

ARG APP_FILE
EXPOSE 8080

COPY ${APP_FILE} target/lights5.orders-service
ENTRYPOINT ["/lights5.orders-service"]
