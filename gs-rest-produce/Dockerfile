FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
# docker build --build-arg JAR_FILE=target/*.jar -t produce-greeting .
# docker run -p 2022:2022 produce-greeting