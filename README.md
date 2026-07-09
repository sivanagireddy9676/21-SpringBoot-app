# 21-SpringBoot-app

A Spring Boot application demonstrating basic Spring Boot setup and Java development practices.

## Project Overview

This is a demo project for Spring Boot 2.7.17 with Java 11 compatibility. It includes example classes for Spring Boot application setup and bean management.

## Prerequisites

- **Java 11** or higher
- **Maven 3.6+** (or use the included Maven wrapper)
- **Git** for version control

## Project Structure

```
21-SpringBoot-app/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/ashokit/
│   │   │       ├── Application.java
│   │   │       └── beans/
│   │   │           └── Car.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── java/
│           └── com/ashokit/
│               └── ApplicationTests.java
├── pom.xml
└── README.md
```

## Dependencies

- **Spring Boot Starter Data JPA** - For database access
- **Oracle Database JDBC Driver** - ojdbc11
- **Lombok** - For reducing boilerplate code
- **Spring Boot Starter Test** - For testing support

## Build & Run

### Clean Build (without tests)
```bash
mvn clean compile
```

### Clean Build and Install (without tests)
```bash
mvn clean install -DskipTests
```

### Run the Application
```bash
mvn spring-boot:run
```

### Using Maven Wrapper (Windows)
```bash
.\mvnw clean install -DskipTests
```

## Configuration

Update `src/main/resources/application.properties` for database and application configuration:

```properties
spring.datasource.url=jdbc:oracle:thin:@localhost:1521:xe
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

## Classes

### Application.java
Main Spring Boot application class with:
- REST_URL constant for API endpoints
- Sample cache implementation using Map<String, Object>

### Car.java
Example bean class demonstrating:
- Basic class structure
- Method implementation
- Logging capabilities

## Technology Stack

| Technology | Version |
|-----------|---------|
| Spring Boot | 2.7.17 |
| Java | 11 |
| Maven | 3.10.1 |
| Lombok | Latest (from parent) |

## Recent Changes

- ✅ Updated Spring Boot from 3.3.0 to 2.7.17 for Java 11 compatibility
- ✅ Fixed compilation errors in Application.java and Car.java
- ✅ Added missing imports and fixed syntax issues
- ✅ Resolved merge conflicts

## Development

### IntelliJ IDEA Setup
1. Open project in IntelliJ IDEA
2. Right-click on `pom.xml` → Maven → Reload project
3. Build and run from IDE

### Command Line Build
```bash
cd 21-SpringBoot-app
mvn clean install -DskipTests
```

## Troubleshooting

### Build Errors
- Ensure Java 11 is installed: `java -version`
- Clear Maven cache: `mvn clean`
- Reload dependencies: `mvn dependency:resolve`

### Compilation Issues
- Check for syntax errors in `.java` files
- Verify all imports are correct
- Ensure pom.xml has all required dependencies

## Contributing

When making changes:
1. Create a feature branch: `git checkout -b feature/your-feature`
2. Commit changes: `git commit -m "Your message"`
3. Push to GitHub: `git push origin feature/your-feature`
4. Create a Pull Request

## Git Branches

- **main** - Production-ready code
- **develop** - Development branch
- **feature-2** - Current feature branch

## License

This is a demo project for learning purposes.

## Author

Siva Nagireddy (sivanagireddy9676)

## Support

For issues or questions, please create an issue on the GitHub repository.
