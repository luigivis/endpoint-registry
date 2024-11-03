package com.luigivismara.endpointregistry;

import com.luigivismara.endpointregistry.annotations.EndPointDescription;
import com.luigivismara.endpointregistry.dao.EndpointDao;
import com.luigivismara.endpointregistry.dto.Endpoint;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

/**
 * Scanner class
 */
@Component
public class EndpointScanner {
    private final EndpointDao endpointDao;
    private final RequestMappingHandlerMapping requestMappingHandlerMapping;

    public EndpointScanner(EndpointDao endpointDao, RequestMappingHandlerMapping requestMappingHandlerMapping) {
        this.endpointDao = endpointDao;
        this.requestMappingHandlerMapping = requestMappingHandlerMapping;
    }

    /**
     * Init on start Spring boot application, search for endpoints in controllers and save each endpoint
     */
    @PostConstruct
    public void init() {
        System.out.println("Init Endpoints Registry");
        var handlerMethods = requestMappingHandlerMapping.getHandlerMethods();

        for (var entry : handlerMethods.entrySet()) {
            var mappingInfo = entry.getKey();
            var handlerMethod = entry.getValue();

            System.out.println("Found method: " + handlerMethod.getMethod().getName() + " in " + handlerMethod.getBeanType());
            var descriptionAnnotation = handlerMethod.getMethodAnnotation(EndPointDescription.class);
            if (descriptionAnnotation != null) {
                assert mappingInfo.getPathPatternsCondition() != null;
                var url = mappingInfo.getPathPatternsCondition().getPatterns().iterator().next().toString();
                var httpMethod = mappingInfo.getMethodsCondition().getMethods().iterator().next().toString();

                var endpoint = new Endpoint(url, httpMethod, descriptionAnnotation.value());
                System.out.println("Endpoint try to save -> " + endpoint);
                endpointDao.save(endpoint);
            }
        }
    }
}
