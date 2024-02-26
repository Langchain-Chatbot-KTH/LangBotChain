#!/bin/bash

# Change directory to Kafka installation directory
cd "/Users/numoh/Downloads/kafka_2.13-3.6.1" || exit

# Start Zookeeper server
echo "Starting Zookeeper server..."
./bin/zookeeper-server-start.sh ./config/zookeeper.properties &

# Wait for Zookeeper server to start
sleep 5

# Start Kafka server
echo "Starting Kafka server..."
./bin/kafka-server-start.sh ./config/server.properties &

# Wait for Kafka server to start
sleep 5

# Start Kafka consumer
echo "Starting Kafka consumer..."
./bin/kafka-console-consumer.sh --topic answers --from-beginning --bootstrap-server localhost:9092

echo "All processes started."
