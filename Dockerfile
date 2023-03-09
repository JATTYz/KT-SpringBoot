FROM openjdk:17
WORKDIR app
ADD build/libs/jat-0.0.1-SNAPSHOT.jar /app/jat-0.0.1.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/jat-0.0.1.jar"]
