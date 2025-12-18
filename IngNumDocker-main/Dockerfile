FROM eclipse-temurin:21-jre

COPY build/libs/RentalService-0.0.1-SNAPSHOT.jar .

CMD ["java", "-Xmx300m", "-Xms300m", "-XX:TieredStopAtLevel=1", "-noverify", "-jar", "RentalService-0.0.1-SNAPSHOT.jar"]

EXPOSE 8080