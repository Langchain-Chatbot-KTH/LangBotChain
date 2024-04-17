# Tutorial - Get Started

To run the application, ensure the following prerequisites are met:

- Docker is running on your system.
- Apache Kafka is downloaded.
- A Working JVM (Java Virtual Machine) version 17 or higher.
- A GPU with at least 8GB of VRAM.
- RAM memory exceeding 16GB.

## NVIDIA GPU drivers / NVIDIA Container Toolkit

1. Configure the repository:

```bash
curl -fsSL https://nvidia.github.io/libnvidia-container/gpgkey \
    | sudo gpg --dearmor -o /usr/share/keyrings/nvidia-container-toolkit-keyring.gpg
curl -s -L https://nvidia.github.io/libnvidia-container/stable/deb/nvidia-container-toolkit.list \
    | sed 's#deb https://#deb [signed-by=/usr/share/keyrings/nvidia-container-toolkit-keyring.gpg] https://#g' \
    | sudo tee /etc/apt/sources.list.d/nvidia-container-toolkit.list
sudo apt-get update 
```

2. Install the NVIDIA Container Toolkit packages

```bash
sudo apt-get install -y nvidia-container-toolkit
```

## Kafka setup for local testing

### UNIX based systems

Download Kafka from: https://kafka.apache.org/downloads

Extract and move to Directory:

```bash
$ tar -xzf kafka_2.13-3.7.0.tgz
$ cd kafka_2.13-3.7.0
```
```bash
#Start the ZooKeeper service
$ bin/zookeeper-server-start.sh config/zookeeper.properties
```

```bash
#Start the Kafka broker service after the Zookeeper has run for a while.
$ bin/kafka-server-start.sh config/server.properties
```

```bash
#Start the topic
$ bin/kafka-console-consumer.sh --topic answers --from-beginning --bootstrap-server localhost:9092
```

### Windows 

Download Kafka from: https://kafka.apache.org/downloads

Extract and move to Directory:

```bash
$ tar -xzf kafka_2.13-3.7.0.tgz
$ cd kafka_2.13-3.7.0
```

```bash
#Start the ZooKeeper service
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
```
```bash
#Start the Kafka broker service after the Zookeeper has run for a while.
.\bin\windows\kafka-server-start.bat .\config\server.properties
```

```bash
#Start the topic
.\bin\windows\kafka-console-consumer.bat --topic answers --from-beginning --bootstrap-server localhost:9092
```

## MIT License

Copyright (c) 2024 Samuel Tegsten

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
