FROM openjdk:11
ARG project
COPY ./target/external-catalog-1.0-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=qa" ,"external-catalog-1.0-SNAPSHOT.jar"]