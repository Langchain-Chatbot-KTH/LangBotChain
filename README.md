# Tutorial - Get Started

In order to run the application you need to have: 
- Docker running on your system.
- Download Apache Kafka.
- A Working JVM. (17)
- A GPU with atlest 8bg off VRAM
- RAM memory exceding 16GB 

## NVIDIA GPU drivers / NVIDIA Container Toolkit
1. Configure the repository

curl -fsSL https://nvidia.github.io/libnvidia-container/gpgkey \
    | sudo gpg --dearmor -o /usr/share/keyrings/nvidia-container-toolkit-keyring.gpg
curl -s -L https://nvidia.github.io/libnvidia-container/stable/deb/nvidia-container-toolkit.list \
    | sed 's#deb https://#deb [signed-by=/usr/share/keyrings/nvidia-container-toolkit-keyring.gpg] https://#g' \
    | sudo tee /etc/apt/sources.list.d/nvidia-container-toolkit.list
sudo apt-get update

2. Install the NVIDIA Container Toolkit packages

sudo apt-get install -y nvidia-container-toolkit

## Kafka setup for local testing

### UNIX based systems

Download Kafka from: https://kafka.apache.org/downloads

Extract and move to Directory:

$ tar -xzf kafka_2.13-3.7.0.tgz
$ cd kafka_2.13-3.7.0

Start the ZooKeeper service
$ bin/zookeeper-server-start.sh config/zookeeper.properties

Start the Kafka broker service after the Zookeeper has run for a while.
$ bin/kafka-server-start.sh config/server.properties

Start the topic
$ bin/kafka-topics.sh --create --topic answers --bootstrap-server localhost:9092

### Windows based systems

Download Kafka from: https://kafka.apache.org/downloads

Extract and move to Directory:

$ tar -xzf kafka_2.13-3.7.0.tgz
$ cd kafka_2.13-3.7.0

Start the ZooKeeper service
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

Start the Kafka broker service after the Zookeeper has run for a while.
.\bin\windows\kafka-server-start.bat .\config\server.properties

Start the topic
.\bin\windows\kafka-topics.bat --create --topic answers --bootstrap-server localhost:9092

