package com.luigivismara.exampleendpointregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
        "com.luigivismara.*"
})
public class ExampleEndpointRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExampleEndpointRegistryApplication.class, args);
    }

}
