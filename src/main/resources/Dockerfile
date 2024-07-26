FROM openjdk:11
VOLUME /tmp
ADD target/springsecurity2-0.0.1-SNAPSHOT.jar springsecurity2.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/springsecurity2.jar"]