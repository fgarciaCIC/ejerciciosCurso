FROM eclipse-temurin:8-jre-jammy
RUN apt update; apt upgrade -y
RUN mkdir /app
# Esto es un comentario
COPY ./target/ejerc006-*.jar  /app/ejerc006.jar
CMD [ "java", "-jar", "/app/ejerc006.jar" ]