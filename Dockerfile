FROM eclipse-temurin:17

LABEL author=larryDev.es

COPY target/QuerysManuales-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]