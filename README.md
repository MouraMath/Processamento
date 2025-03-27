# Serviço de Processamento - Consumidor RabbitMQ 🔄 || Português - English


## 🇧🇷 Português

Este repositório faz parte de um projeto de estudo sobre mensageria utilizando RabbitMQ e persistência de dados com PostgreSQL.
Ele atua como **consumidor** de mensagens, processando os pedidos enviados pelo serviço de Pedidos.

### Tecnologias utilizadas:
- Java 21
- Spring Boot 3
- RabbitMQ
- Spring AMQP
- PostgreSQL
- Spring Data JPA
- Lombok

### Funcionalidades:
- Consumo de mensagens da fila RabbitMQ
- Processamento de pedidos recebidos
- Atualização do status dos pedidos no banco de dados
- Demonstração de processamento assíncrono de tarefas

### Comunicação com serviço de Pedidos:
Este serviço consome as mensagens produzidas pelo serviço de [Pedidos](https://github.com/MouraMath/Pedido),
permitindo que o processamento seja realizado de forma assíncrona e independente do serviço que originou o pedido.

### Como executar:
1. Certifique-se de ter o RabbitMQ e o PostgreSQL instalados e rodando
2. Configure as credenciais do banco de dados no arquivo application.properties
3. Certifique-se que o serviço de Pedidos esteja configurado corretamente
4. Clone este repositório
5. Execute o projeto Spring Boot
6. O serviço começará a consumir automaticamente as mensagens da fila e atualizar o banco de dados

## 🇬🇧 English

This repository is part of a study project on messaging using RabbitMQ and data persistence with PostgreSQL.
It acts as a **consumer** of messages, processing orders sent by the Orders service.

### Technologies used:
- Java 21
- Spring Boot 3
- RabbitMQ
- Spring AMQP
- PostgreSQL
- Spring Data JPA
- Lombok

### Features:
- Consumption of messages from RabbitMQ queue
- Processing of received orders
- Updating order status in the database
- Demonstration of asynchronous task processing

### Communication with Orders service:
This service consumes messages produced by the [Orders service](https://github.com/MouraMath/Pedido),
allowing processing to be performed asynchronously and independently of the service that originated the order.

### How to run:
1. Make sure you have RabbitMQ and PostgreSQL installed and running
2. Configure the database credentials in the application.properties file
3. Make sure the Orders service is properly configured
4. Clone this repository
5. Run the Spring Boot project
6. The service will automatically start consuming messages from the queue and updating the database
