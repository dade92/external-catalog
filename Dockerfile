FROM openjdk:11
ARG project
COPY ./target/external-catalog-1.0-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app
ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=qa" ,"external-catalog-1.0-SNAPSHOT.jar"]