# Tutorial - Get Started

In order to run the application you need to have: 
- Docker running on your system.
- Download Apache Kafka.
- A Working JVM. (17)
- A GPU with atlest 8bg off VRAM
- RAM memory exceding 16GB 

## NVIDIA GPU drivers / NVIDIA Container Toolkit
1. Configure the repository
'''
curl -fsSL https://nvidia.github.io/libnvidia-container/gpgkey \
    | sudo gpg --dearmor -o /usr/share/keyrings/nvidia-container-toolkit-keyring.gpg
curl -s -L https://nvidia.github.io/libnvidia-container/stable/deb/nvidia-container-toolkit.list \
    | sed 's#deb https://#deb [signed-by=/usr/share/keyrings/nvidia-container-toolkit-keyring.gpg] https://#g' \
    | sudo tee /etc/apt/sources.list.d/nvidia-container-toolkit.list
sudo apt-get update
'''

2. Install the NVIDIA Container Toolkit packages
'''
sudo apt-get install -y nvidia-container-toolkit
'''

## Kafka setup for local testing

### UNIX based systems

### Windows based systems

## 

