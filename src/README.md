# Task 4: Spring Boot Deployment with Nginx & SSL

👨‍💻 Author  
Pankaj Uramaliya

This project demonstrates how to deploy a **Spring Boot application** on an **Ubuntu server (AWS EC2 Free Tier)** with:
- systemd service (auto-restart on crash)
- Nginx reverse proxy
- SSL (self-signed certificate)

---

## 🚀 Project Setup

### 1. Prerequisites
Make sure your Ubuntu server has the following installed:
- OpenJDK 21
- Maven
- Nginx
- ufw (for firewall management)

Update and install:
```bash
sudo apt update && sudo apt upgrade -y
sudo apt install openjdk-21-jdk maven nginx ufw -y

## 🌍 Live Demo
- API URL: [https://13.233.116.116/product](https://13.233.116.116/product)


