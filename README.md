AI-Powered Code Review & Smart Debugging Assistant
---
<img width="1906" height="870" alt="output_1" src="https://github.com/user-attachments/assets/9d4beb68-5499-45ac-910d-8e0863254b9a" />
---
> **Your personal AI-powered code auditor.** > *Instantly analyze code for bugs, security risks, and logic errors using local Large Language Models.*

![Java](https://img.shields.io/badge/Java-21-orange)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.4-green)
![React](https://img.shields.io/badge/React-18-blue)
![Spring AI](https://img.shields.io/badge/Spring_AI-1.0-darkgreen)
![Ollama](https://img.shields.io/badge/AI-Ollama%20%7C%20Llama3-black)

---

## 📖 Overview

**AI-Powered Code Review & Smart Debugging Assistant** is a modern Full Stack application that brings the power of Generative AI to your local development environment. It allows developers to paste code snippets in various languages (Java, Python, JS, etc.) and receive instant, high-quality feedback on:

* **🐞 Logical Bugs**
* **🔒 Security Vulnerabilities**
* **⚡ Performance Optimizations**
* **✨ Clean Code Best Practices**

Unlike cloud-based tools, this runs **100% locally** using **Ollama** and **Llama 3**, ensuring your code never leaves your machine.

---

## 🌟 Key Features

* **🤖 Local AI Engine:** Powered by **Llama 3** via Ollama (No API costs, complete privacy).
* **⚡ Real-time Analysis:** Instant feedback streaming from the Spring AI backend.
* **🎨 Modern UI:** A sleek **Dark Mode** interface with VS Code-style editing.
* **🖥️ Split-Screen Design:** Draggable resizing handle to adjust the Editor vs. Feedback view.
* **🌍 Multi-Language Support:** Auto-detects and reviews Java, Python, JavaScript, C++, PHP, and SQL.
* **💻 Terminal-Style Output:** AI feedback is rendered in a beautiful "Bash" style format.

---

## 🛠️ Tech Stack

### **Backend (The Brain)**
* **Framework:** Java Spring Boot 3.4
* **AI Integration:** Spring AI (Ollama ChatClient)
* **Build Tool:** Maven

### **Frontend (The Face)**
* **Framework:** React 18 (TypeScript)
* **Editor:** Monaco Editor (The engine behind VS Code)
* **Styling:** Bootstrap 5 + Custom CSS (Glassmorphism & Neon Effects)
* **Markdown:** `react-markdown` for rendering AI responses

---

## 🚀 Getting Started

Follow these steps to run the project locally.

### **Prerequisites**
1.  **Java JDK 21+** installed.
2.  **Node.js & npm** installed.
3.  **Ollama** installed and running.

### **Step 1: Setup the AI (Ollama)**
#### Open your terminal and pull the Llama 3 model:
```bash
ollama run llama3.1
```
### **Step 2: Start the Backend**
#### Clone the repo:
```bash
git clone https://github.com/RK17904/smart-code-reviewer.git
cd smart-code-reviewer
```
#### Navigate to the backend folder and run:
```bash
./mvnw spring-boot:run
```
#### The server will start on http://localhost:8080.
### **Step 3: Start the Frontend**
#### Open a new terminal and go to the frontend folder:
```bash
cd frontend
```
#### Install dependencies:
```bash
npm install
```
#### Start the React app:
```bash
npm start
```
#### The app will open at http://localhost:3000.
---
### 📸 Usage
#### 1.Select your programming language from the dropdown (Java, Python, etc.).
#### 2.Paste your code snippet into the Editor (Left Panel).
#### 3.Click the "REVIEW CODE ▶" button.
#### 4.Watch the AI analyze your code and provide a fix in the Output Panel (Right Panel).
---
### 🤝 Contributing
#### Contributions are welcome! Please follow these steps:
#### 1.Fork the repository.
#### 2.Create a new branch (git checkout -b feature/AmazingFeature).
#### 3.Commit your changes (git commit -m 'Add some AmazingFeature').
#### 4.Push to the branch (git push origin feature/AmazingFeature).
#### 3.Open a Pull Request.




