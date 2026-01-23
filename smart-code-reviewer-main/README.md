# AI-Enabled-Code-Quality-Risk-Analysis-Platform
### Smart Code Reviewer


---

> **Your personal AI-powered code auditor.**  
> *Instantly analyze code for bugs, security risks, and logic errors using local Large Language Models.*

![Java](https://img.shields.io/badge/Java-21-orange)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.4-green)
![React](https://img.shields.io/badge/React-18-blue)
![Spring AI](https://img.shields.io/badge/Spring_AI-1.0-darkgreen)
![Ollama](https://img.shields.io/badge/AI-Ollama%20%7C%20Llama3-black)

---

## 📖 Overview

**AI-Enabled-Code-Quality-Risk-Analysis-Platform (Smart Code Reviewer)** is a modern **Full Stack application** that brings the power of **Generative AI** to your local development environment.

It allows developers to paste code snippets in various languages (Java, Python, JavaScript, etc.) and receive **instant, high-quality feedback** on:

* 🐞 **Logical Bugs**
* 🔒 **Security Vulnerabilities**
* ⚡ **Performance Optimizations**
* ✨ **Clean Code Best Practices**

Unlike cloud-based tools, this runs **100% locally** using **Ollama** and **Llama 3**, ensuring your code **never leaves your machine**.

---

## 🌟 Key Features

* 🤖 **Local AI Engine:** Powered by **Llama 3** via Ollama (No API costs, complete privacy)
* ⚡ **Real-time Analysis:** Instant feedback streaming from the Spring AI backend
* 🎨 **Modern UI:** Sleek **Dark Mode** with VS Code-style editor
* 🖥️ **Split-Screen Design:** Draggable resize between Editor and Feedback panels
* 🌍 **Multi-Language Support:** Java, Python, JavaScript, C++, PHP, SQL
* 💻 **Terminal-Style Output:** AI feedback rendered in a Bash-style format

---

## 🛠️ Tech Stack

### **Backend (The Brain)**
* **Framework:** Java Spring Boot 3.4
* **AI Integration:** Spring AI (Ollama ChatClient)
* **Build Tool:** Maven

### **Frontend (The Face)**
* **Framework:** React 18 (TypeScript)
* **Editor:** Monaco Editor (VS Code engine)
* **Styling:** Bootstrap 5 + Custom CSS (Glassmorphism & Neon Effects)
* **Markdown Rendering:** `react-markdown`

---

## 🚀 Getting Started

### **Prerequisites**
1. Java JDK 21+
2. Node.js & npm
3. Ollama installed and running

---

### **Step 1: Setup the AI (Ollama)**
```bash
ollama run llama3.1


Step 2: Start the Backend
git clone https://github.com/KondalwadiDeepika/AI-Enabled-Code-Quality-Risk-Analysis-Platform.git
cd AI-Enabled-Code-Quality-Risk-Analysis-Platform
./mvnw spring-boot:run


Backend runs at 👉 http://localhost:8080

Step 3: Start the Frontend
cd frontend
npm install
npm start


Frontend opens at 👉 http://localhost:3000