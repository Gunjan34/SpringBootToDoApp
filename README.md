# 📋 Full Stack Todo Application

A full-stack **Todo Application** built with:

- **Frontend**: React.js (Vite, Axios, Tailwind CSS)
- **Backend**: Spring Boot (REST API)
- **Database**: MySQL

This application allows users to add, update, mark as completed, and delete todo tasks. It demonstrates CRUD operations with a clean React UI and a Spring Boot REST API backend.

---

## 🚀 Features

✅ Add new todos with title & description  
✅ View all todos from the database  
✅ Mark todos as **completed / not completed**  
✅ Delete todos  
✅ Responsive and modern UI with Tailwind CSS  
✅ Full integration of React frontend ↔ Spring Boot backend ↔ MySQL database  

---

## 🛠️ Tech Stack

### Frontend
- React.js (Vite)
- Axios (API calls)
- Tailwind CSS (styling)

### Backend
- Spring Boot (REST APIs)
- Spring Data JPA (repository layer)
- MySQL (database)
- Hibernate (ORM)

---

## 📂 Project Structure

TodoApplication/
├── backend/ (Spring Boot)
│ ├── src/main/java/com/example/todoapp
│ │ ├── controller/ # REST Controllers
│ │ ├── model/ # Entity classes
│ │ ├── repository/ # JPA Repositories
│ │ └── service/ # Service layer
│ └── TodoappApplication.java # Main entry point
│
├── frontend/ (React + Vite)
│ ├── src/App.jsx # Main React component
│ ├── src/... # Other components
│ └── package.json
└── README.md

2️⃣ Backend (Spring Boot)

Navigate to the backend folder:

cd backend


Configure MySQL Database in application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/todo_db
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update


Run the Spring Boot application:

./mvnw spring-boot:run


or if using Maven installed globally:

mvn spring-boot:run

3️⃣ Frontend (React)

Navigate to frontend folder:

cd frontend


Install dependencies:

npm install


Start development server:

npm run dev


Frontend will run at http://localhost:5173
 and backend at http://localhost:8080
.
👨‍💻 Author

Gunjan Mahara

GitHub: Gunjan34
