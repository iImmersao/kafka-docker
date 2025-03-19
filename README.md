# kafka-docker

This is a simple demo project that illustrates using Kafka with Docker containers. You will need Docker installed on your local machine to use it.

In order to build and run the project, follow these steps:

1. Build the KafkaProducerApp:
   - cd KafkaProducerApp
   - mvn clean package -DskipTests
   - docker build -t kafka-producer-app .
2. Build the KafkaComsumerApp:
   - cd KafkaConsumerApp
   - mvn clean package -DskipTests
   - docker build -t kafka-consumer-app .
3. Compose and run the complete Docker app:
   - cd to project root directory
   - docker-compose up -d
4. Check the application works:
   - curl -X POST "http://localhost:8081/messages?message=HelloWorld"
   - docker logs -f <consumer-container-name> or check logs in Docker Desktop
5. Shut down the containers:
   - docker-compose down

