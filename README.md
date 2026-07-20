# Product Management API

A Spring Boot REST API for managing products. Built with Spring Boot 4.1.0, Java 17, and H2/PostgreSQL database support.

## 📋 Project Overview

This is a simple yet effective product management system that provides RESTful endpoints for creating, reading, updating, and deleting products. The application uses Spring Data JPA for database operations and supports both H2 (in-memory) and PostgreSQL databases.

## 🚀 Features

- **Get all products** - Retrieve a list of all products
- **Get product by ID** - Fetch a specific product using its ID
- **Create product** - Add a new product to the database
- **Update product** - Modify an existing product
- **Delete product** - Remove a product from the database

## 🛠️ Tech Stack

- **Framework**: Spring Boot 4.1.0
- **Language**: Java 17
- **Build Tool**: Maven
- **Database**: H2 (development) / PostgreSQL (production)
- **ORM**: Spring Data JPA
- **Annotation Processor**: Lombok
- **Testing**: Spring Boot Test Suite

## 📦 Dependencies

Key dependencies included:
- `spring-boot-starter-data-jpa` - JPA and Hibernate support
- `spring-boot-starter-webmvc` - Web MVC framework
- `spring-boot-h2console` - H2 database console
- `postgresql` - PostgreSQL driver
- `lombok` - Reduce boilerplate code
- `spring-boot-devtools` - Enhanced development experience

## 🏗️ Project Structure

```
demo/
├── src/
│   ├── main/
│   │   ├── java/com/diwakar/demo/
│   │   │   ├── controller/     # REST controllers
│   │   │   ├── model/          # Entity models
│   │   │   ├── service/        # Business logic
│   │   │   └── repository/     # Data access layer
│   │   └── resources/
│   │       └── application.properties  # Configuration
│   └── test/
│       └── java/               # Unit tests
├── pom.xml                     # Maven configuration
└── README.md                   # This file
```

## 🔌 API Endpoints

### Get All Products
```bash
GET /getProducts
```

**Response:**
```json
[
  {
    "prodID": 1,
    "name": "Product Name",
    "price": 99.99
  }
]
```

### Get Product by ID
```bash
GET /getProducts/{prodID}
```

**Response:**
```json
{
  "prodID": 1,
  "name": "Product Name",
  "price": 99.99
}
```

### Create Product
```bash
POST /product
Content-Type: application/json

{
  "name": "New Product",
  "price": 49.99
}
```

### Update Product
```bash
PUT /product
Content-Type: application/json

{
  "prodID": 1,
  "name": "Updated Product",
  "price": 59.99
}
```

### Delete Product
```bash
DELETE /product/{prodID}
```

## ⚙️ Setup & Installation

### Prerequisites
- Java 17 or higher
- Maven 3.6+
- (Optional) PostgreSQL for production use

### Steps

1. **Clone the repository**
```bash
git clone https://github.com/thewalker045/SpringBoot.git
cd demo
```

2. **Build the project**
```bash
mvn clean install
```

3. **Run the application**
```bash
mvn spring-boot:run
```

The application will start on `http://localhost:8080`

4. **H2 Console** (for development)
Access the H2 console at: `http://localhost:8080/h2-console`

## 📝 Configuration

Edit `src/main/resources/application.properties` to configure:

- **Database**: Switch between H2 and PostgreSQL
- **Server Port**: Default is `8080`
- **Logging Level**: Configure log levels

Example for PostgreSQL:
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/product_db
spring.datasource.username=postgres
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

## 🧪 Testing

Run tests with:
```bash
mvn test
```

## 📄 License

This project is open source and available for educational purposes.

## 👨‍💻 Author

**Diwakar Sharma**

## 📞 Support

For issues or questions, please create an issue in the repository.

---

**Happy Coding!** 🎉
