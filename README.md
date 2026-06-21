# DRIPLAB. — Spring Boot E-Commerce Store

DRIPLAB. is a modern, minimalist e-commerce storefront engineered for next-generation streetwear and fashion trends. Built on Java and Spring Boot, this project showcases clean backend architecture, secure session management, and relational database designs.

---

## 🚀 Key Features

- **Dynamic Homepage**: Features text-overlay carousels, animated category capsules, and trust-badge grids.
- **Product Catalog & Management**: Searchable and category-filtered grids featuring INR (`₹`) currency mappings and aspect-ratio responsive image scaling.
- **Interactive Cart & Checkout Flow**: Add to cart, quantity updates, total order sums, shipping details form, and checkout validation.
- **Role-Based Access Control**: Standard user registrations and secure admin dashboard for category/product CRUD operations.
- **Toast Alerts**: Successful and error alert toasts bound to active database transactions.

---

## 🛠️ Tech Stack

- **Core Backend**: Java 17, Spring Boot, Spring Data JPA
- **Security**: Spring Security (Role-Based Authorization, BCrypt Password Hashing)
- **Database**: MySQL (relational schema design, index optimized queries)
- **Front-End Rendering**: Thymeleaf Template Engine, Bootstrap 5, Custom CSS3
- **Build Tool**: Maven

---

## 📁 Project Architecture

```text
src/main/java/com/manish/ecommerce/
├── config/             # Spring Security and custom login handlers
├── controller/         # Web view mapping controllers
│   └── rest/           # REST endpoints for dashboard status triggers
├── entity/             # JPA entity definitions (User, Product, Category, etc.)
├── repository/         # Database Spring Data repositories
├── service/            # Business logic interfaces
│   └── impl/           # Service layer implementations
└── utils/              # Application constants and utility helpers
```

---

## ⚙️ Setup and Installation

### Prerequisites
- JDK 17 or higher
- Maven 3.6+
- MySQL Server (via XAMPP or standalone)

### 1. Database Configuration
Create a schema in your MySQL server:
```sql
CREATE DATABASE ecommerce_store;
```

Update your `src/main/resources/application.properties` credentials if needed:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce_store?useSSL=false&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=
```

### 2. Run the Application
Start the Spring Boot server using the Maven wrapper:
```bash
./mvnw spring-boot:run
```
The server will start on port `8080`. Navigate to `http://localhost:8080/` in your browser.

---

## 🧪 Testing and Verification
Run the unit test suites:
```bash
./mvnw test
```
