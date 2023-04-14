FROM amazoncorretto:17-alpine-jdk
COPY target/prueba-tecnica-banco-union-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/prueba-tecnica-banco-union.jar"]