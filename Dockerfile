### CREACION DE JAR ###
FROM maven:3.6.3-jdk-11-slim AS builder
WORKDIR /app
COPY pom.xml .
RUN mvn -e -B dependency:go-offline
COPY src ./src
RUN cd /app && mvn -e -B package -Dmaven.test.skip=true

#### EJECUCION DEL JAR ####
FROM openjdk:15-jdk

RUN rm /etc/localtime
RUN ln -s /usr/share/zoneinfo/America/Lima /etc/localtime

ENV DOCKERIZE_VERSION v0.6.1

COPY --from=builder /app/target/*.jar /app.jar


ENTRYPOINT exec java -jar /app.jar
EXPOSE 9000