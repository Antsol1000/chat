# Chat application

Simple Spring Boot applications that make usage of Apache Kafka

## Chat Sender
Allow sending messages by POST requests to http://localhost:8081/api/v1/messages.
This messages are redirected to Kafka (with local profile Kafka should be present on localhost:9090).

There is also a Python script that sends 1000 messages to that endpoint.

Also, when *fast* (*slow*) profile is active the application send a message every 0.25s (2s).

## Chat Receiver
Consume the messages from Apache Kafka.

Allow to get all consumed messages by GET request to http://localhost:8082/api/v1/messages.
