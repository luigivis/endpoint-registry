# 📚 EndpointRegistry

![GitHub](https://img.shields.io/github/license/luigivismara/endpoint-registry)
![GitHub last commit](https://img.shields.io/github/last-commit/luigivismara/endpoint-registry)
![GitHub issues](https://img.shields.io/github/issues/luigivismara/endpoint-registry)

**EndpointRegistry** is a Spring Boot library designed to automatically register and manage application endpoints, storing their descriptions and details in a database. This library is perfect for projects needing centralized API documentation, endpoint auditing, or integration with monitoring systems.

## 🚀 Features

- Automatic endpoint registration with custom annotations.
- Stores metadata for each endpoint in a database.
- Simple integration with Spring Boot projects.
- Ideal for automated API documentation generation.

## 📦 Installation

To use **EndpointRegistry** in your Spring Boot project, add the following dependency in your `pom.xml` file:

```xml
<dependency>
    <groupId>com.luigivismara</groupId>
    <artifactId>endpoint-registry</artifactId>
    <version>1.0.0</version>
</dependency>
```

### Prerequisites

- **Java 17** or higher
- **Spring Boot 2.7** or higher

## ⚙️ Configuration

Configure **EndpointRegistry** with the necessary properties in your project’s `application.properties` file.

```properties
endpoint.registry.enabled=true
```

### Integration with Spring Boot

To use this library, simply annotate your controller methods with `@EndPointDescription`, as shown in the following example:

```java
import com.luigivismara.endpointregistry.annotations.EndPointDescription;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/example")
    @EndPointDescription("This is a test endpoint")
    public String example() {
        return "Hello World";
    }
}
```

## 📖 Usage Examples

### Basic Example

This example shows how to register a simple endpoint with a description.

```java
@RestController
public class ExampleController {

    @GetMapping("/simple")
    @EndPointDescription("Simple example endpoint")
    public String simpleEndpoint() {
        return "Endpoint successfully registered";
    }
}
```

## 🛠️ Development and Contribution

If you want to contribute to **EndpointRegistry**, follow these steps:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature/new-feature`).
3. Make your changes and commit them (`git commit -am 'Add new feature'`).
4. Push to the branch (`git push origin feature/new-feature`).
5. Open a Pull Request.

### Development Requirements

- Java 17 or higher
- Maven or Gradle

## 🔧 Running Tests

To run unit tests, use the following command (assuming you’re using Maven):

```bash
mvn test
```

If you’re using Gradle, run the tests with:

```bash
./gradlew test
```

## 📄 License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## 🤝 Acknowledgments

Special thanks to all collaborators and projects that have inspired the development of **EndpointRegistry**.
