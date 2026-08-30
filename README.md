# Mini Healthcare Support Web App

A simple and user-friendly **Mini Healthcare Support Web App** developed using **Java and Spring Boot**.

The application provides basic healthcare support features through a clean and responsive web interface. It is designed as an informational support tool and does not replace professional medical advice.

## 🚀 Features

### 1. Symptom Checker

* Users can select a basic symptom.
* The application provides general informational guidance.
* Includes a clear medical disclaimer.

### 2. Emergency Support

* Provides quick access to emergency healthcare information.
* Displays emergency guidance for situations requiring immediate professional help.

### 3. Healthcare Support

* Provides basic healthcare-related information in an easy-to-understand format.
* Simple navigation for a better user experience.

### 4. Responsive Design

* Clean and modern interface.
* Works on desktop, tablet and mobile screen sizes.

## 🛠️ Technologies Used

### Backend

* **Java 17**
* **Spring Boot**
* **Spring MVC**
* **Maven**

### Frontend

* **HTML5**
* **CSS3**
* **JavaScript**
* **Thymeleaf**

### Development Tool

* **IntelliJ IDEA**

## 🤖 AI Idea

The application can be enhanced with an AI-powered healthcare assistant that provides basic, non-diagnostic guidance based on user-entered symptoms. AI can help users understand general health information, suggest relevant precautions, and direct them to appropriate healthcare resources.

The AI feature should include clear medical disclaimers, avoid providing diagnoses or prescriptions, and recommend consulting a qualified healthcare professional whenever necessary.

## 🤝 NGO Use Case

This application can support NGOs working in rural, remote, or underserved communities by providing easily accessible healthcare information through a simple web interface. It can help users understand basic symptoms, find emergency guidance, and learn about preventive healthcare practices.

NGO volunteers or community health workers can use the platform during awareness campaigns, health camps, and community outreach programs. The application can also be extended with local languages, nearby hospital information, emergency contacts, and educational content for better accessibility.

## 📁 Project Structure

```text
mini-healthcare-support/
│
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── healthcare/
│       │           ├── MiniHealthcareApplication.java
│       │           └── controller/
│       │
│       └── resources/
│           ├── templates/
│           │   └── dashboard.html
│           │
│           ├── static/
│           │   └── css/
│           │       └── style.css
│           │
│           └── application.properties
│
├── pom.xml
└── README.md
```

## ⚙️ How to Run the Project

### Prerequisites

Make sure the following are installed:

* Java JDK 17 or higher
* IntelliJ IDEA
* Maven

### Steps

**1. Clone or download the project**

```bash
git clone <your-github-repository-url>
```

Or download and extract the ZIP file.

**2. Open the project**

Open the project folder in IntelliJ IDEA.

**3. Configure Java**

Set the project SDK to:

```text
Java 17
```

**4. Load Maven dependencies**

IntelliJ will automatically detect `pom.xml` and download the required dependencies.

**5. Run the application**

Open:

```text
MiniHealthcareApplication.java
```

and click **Run**.

**6. Open the application**

Visit:

```text
http://localhost:8080
```

## 🔄 Application Flow

```text
User
  ↓
Healthcare Support Web App
  ↓
Select / Enter Basic Information
  ↓
Spring Boot Controller
  ↓
Process Request
  ↓
Display Healthcare Information
```

## 🔐 Medical Disclaimer

This application is created for **educational and informational purposes only**.

The Symptom Checker provides general information and should not be considered a medical diagnosis. Users should consult a qualified healthcare professional for medical advice, diagnosis or treatment.

In case of a medical emergency, contact the appropriate local emergency service immediately.

## 🎯 Internship Assignment Objective

The objective of this project is to demonstrate the ability to:

* Build a web application using Java and Spring Boot.
* Create a simple user-friendly healthcare support interface.
* Implement backend request handling using Spring MVC.
* Connect frontend pages with backend functionality.
* Follow a clean project structure.
* Apply responsive web design principles.
* Develop and document a complete mini-project.

## 👨‍💻 Author

**Shiv Prakash Singh**
B.Tech – Computer Science & Engineering
Email: sshivprakash826@gmail.com
Date: 30 Aug 2026

## 📄 License

This project was developed as part of an internship assignment and is intended for educational and demonstration purposes.

