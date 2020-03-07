FROM openjdk:8
LABEL version="1.0"
LABEL description="Todo List"
ENV PROFILE=docker
COPY target/todo-list-0.0.1.jar /var/www/app.jar
WORKDIR /var/www
ENTRYPOINT java -Dspring.profiles.active=${PROFILE} -jar app.jar