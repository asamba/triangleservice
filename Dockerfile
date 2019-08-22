FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/*.jar triangle.jar
ENTRYPOINT ["java","-jar","/triangle.jar"]