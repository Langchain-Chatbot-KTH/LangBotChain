@echo off

rem Change directory to Kafka installation directory
cd /d "C:\Kafka\kafka_2.13-3.6.1"

rem Start Kafka server
echo Starting Kafka server...
.\bin\windows\kafka-server-start.bat .\config\server.properties

rem Wait for Kafka server to start
timeout /t 5

rem Start Kafka consumer
echo Starting Kafka consumer...
.\bin\windows\kafka-console-consumer.bat --topic answers --from-beginning --bootstrap-server localhost:9092

echo All processes started.
