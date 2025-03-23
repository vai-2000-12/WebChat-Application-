# Simple Chat Application

## Overview
This is a real-time chat application built using **Spring Boot** and **WebSockets**. The application allows multiple users to communicate instantly without using a database. The project follows a minimalistic approach to WebSocket communication.

## Features
- Real-time messaging using WebSockets
- Supports multiple users
- Simple and lightweight architecture
- No database required
- Built with Spring Boot

## Technologies Used
- **Spring Boot** - Backend framework
- **Spring WebSocket** - WebSocket communication
- **Thymeleaf** - Frontend templating engine (optional)
- **HTML, CSS, JavaScript** - Frontend

## Installation
### Prerequisites
Ensure you have the following installed on your system:
- Java (JDK 17 or later recommended)
- Maven

### Steps to Run
1. Clone the repository:
   ```sh
   git clone https://github.com/yourusername/simple-chat-app.git
   cd simple-chat-app
   ```
2. Build the project using Maven:
   ```sh
   mvn clean install
   ```
3. Run the Spring Boot application:
   ```sh
   mvn spring-boot:run
   ```
4. Open your browser and navigate to:
   ```
   http://localhost:8080
   ```

## How It Works
- Users open the chat UI in their browsers.
- WebSocket connections are established when a user joins.
- Messages are transmitted in real time between users.

## Project Structure
```
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.example.chat
│   │   │       ├── config (WebSocket configuration)
│   │   │       ├── controller (Handles messaging)
│   │   │       ├── model (Message data structure)
│   │   │       ├── service (WebSocket services)
│   │   ├── resources
│   │   │   ├── static (CSS, JavaScript)
│   │   │   ├── templates (Thymeleaf HTML files)
│   │   │   ├── application.properties
├── pom.xml
└── README.md
```

## Contributing
Contributions are welcome! Feel free to open an issue or submit a pull request.

## License
This project is licensed under the MIT License.

## Contact
For any inquiries or suggestions, feel free to reach out!
- **GitHub:** [yourusername](https://github.com/yourusername)
- **Email:** your.email@example.com

