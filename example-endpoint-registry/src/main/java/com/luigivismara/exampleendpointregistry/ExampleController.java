package com.luigivismara.exampleendpointregistry;

import com.luigivismara.endpointregistry.annotations.EndPointDescription;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/example")
public class ExampleController {

    @GetMapping("/test")
    @EndPointDescription("Test - Endpoint Description")
    public String test() {
        return Arrays.toString(this.getClass().getMethods());
    }
}
