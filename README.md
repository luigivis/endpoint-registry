# 📚 EndpointRegistry

![GitHub](https://img.shields.io/github/license/luigivismara/endpointRegistry-registry)
![GitHub last commit](https://img.shields.io/github/last-commit/luigivismara/endpointRegistry-registry)
![GitHub issues](https://img.shields.io/github/issues/luigivismara/endpointRegistry-registry)

**EndpointRegistry** is a Spring Boot library designed to automatically register and manage application endpoints, storing their descriptions and details in a database. This library is perfect for projects needing centralized API documentation, endpointRegistry auditing, or integration with monitoring systems.

## 🚀 Features

- Automatic endpointRegistry registration with custom annotations.
- Stores metadata for each endpointRegistry in a database.
- Simple integration with Spring Boot projects.
- Ideal for automated API documentation generation.

## 📦 Installation

To use **EndpointRegistry** in your Spring Boot project, add the following dependency in your `pom.xml` file:

```xml
<dependency>
    <groupId>com.luigivismara</groupId>
    <artifactId>endpointRegistry-registry</artifactId>
    <version>1.0.0</version>
</dependency>
```

### Prerequisites

- **Java 17** or higher
- **Spring Boot 2.7** or higher

## ⚙️ Configuration

### Integration with Spring Boot

To use this library, simply annotate your controller methods with `@EndPointDescription`, as shown in the following example:

```java
import com.luigivismara.endpointregistry.annotations.EndPointDescription;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/example")
public class ExampleController {

    @GetMapping("/test")
    @EndPointDescription("This is a test endpointRegistry")
    public String test() {
        return "Hello World";
    }
}
```

### Component Scanning for Library Detection

If you find that **EndpointRegistry** is not detecting endpoints automatically, ensure that Spring Boot is scanning the appropriate packages. Here are some ways to enable component scanning:

1. **Place the Main Class in a Root Package**: Ensure that your main application class (annotated with `@SpringBootApplication`) is in a root package that includes both your application code and the library packages as subpackages. This will allow Spring Boot to scan all components automatically.

2. **Add a Separate Configuration for Component Scanning**: Alternatively, you can add a configuration class in your project to explicitly include the library package for scanning:

   ```java
   package com.yourapp.config;

   import org.springframework.context.annotation.ComponentScan;
   import org.springframework.context.annotation.Configuration;

   @Configuration
   @ComponentScan(basePackages = {
       "com.luigivismara.endpointregistry",
       "com.yourapp.controllers" // Adjust this to your controller package
   })
   public class EndpointRegistryConfig {
   }
   ```

By using one of these approaches, you ensure that **EndpointRegistry** and your controllers are automatically scanned by Spring Boot.

## 📖 Usage Examples

### Basic Example

This example shows how to register a simple endpointRegistry with a description.

```java
@RestController
public class ExampleController {

    @GetMapping("/simple")
    @EndPointDescription("Simple example endpointRegistry")
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