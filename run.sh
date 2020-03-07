#!/bin/bash
echo 'Generating application package'
mvn clean package

echo 'Removing older containers...'
sudo docker system prune
sudo docker image prune -a

echo 'Starting docker compose containers...'
sudo docker-compose up -d --build