# todo-list-docker-compose
[![Build Status](https://travis-ci.org/felipe-basina/todo-list-docker-compose.svg?branch=master)](https://travis-ci.org/felipe-basina/todo-list-docker-compose.svg?branch=master)

Projeto spring boot + mongodb rodando com docker compose
# Commands
Generate image
```
docker build -t todo-list-image .
```
Run image
```
docker run -d -p 9090:8080 todo-list-image
```
Run **docker-compose**
```
docker-compose up
```
