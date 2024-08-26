# Order Notification Worker
This project is a Worker Service that receives and processes real-time order notifications from the Order Management System through RabbitMQ. It is designed to work seamlessly alongside the Order Management System, ensuring that all order-related events are handled efficiently and reliably.

## Features
- **Message Consumption**: Listens to the RabbitMQ queue for new order notifications.
- **Order Processing**: Processes the incoming orders and performs the required business logic.
- **Error Handling**: Implements robust error handling to ensure no message is lost or mishandled.
- **Scalable Architecture**: Built with Spring Boot, allowing easy scaling and integration into larger systems.

## Technologies Used
- **Spring Boot**: Provides a robust framework for building the worker service.
- **RabbitMQ**: Handles message queuing and delivery for real-time processing.
- **Lombok**: Reduces boilerplate code in Java classes.
- **Maven**: Manages dependencies and builds the project.
- **Docker Compose**: Simplifies the setup and management of the RabbitMQ service via containerization.

## Getting Started

### Prerequisites
JDK 17 or higher
Maven 3.8.1 or higher
RabbitMQ server installed and running

## Running the Project

1. **Clone the repository**:
   ```bash
   git clone git@github.com:yourusername/order-management-worker.git
   cd order-management-worker

2. **Start RabbitMQ using Docker Compose**:
   ```bash
   docker-compose up -d

3. **Configure RabbitMQ (Queue, Exchange, Routing Key)**: Access the RabbitMQ management console at http://localhost:15672 (default username/password: guest/guest) and manually create the necessary queue, exchange, and routing key:

- **Queue**: Define the queue that the worker will listen to (order-request-queue).
- **Exchange**: Create an exchange and bind it to the queue (order-request-exchange).
- **Routing Key**: Set up the routing key that directs messages from the exchange to the queue (order-request-rout-key).

4. **Install dependencies**:
   ```bash
   mvn clean install

5. **Run the project**:
   ´´´bash
   mvn spring-boot:run

