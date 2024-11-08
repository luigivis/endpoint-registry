package com.luigivismara.endpointregistry.dto;

import jakarta.persistence.*;

@Entity
public class EndpointRegistry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(nullable = false)
    private String url;

    @Column(nullable = false)
    private String httpMethod;

    private String description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHttpMethod() {
        return httpMethod;
    }

    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EndpointRegistry(String url, String httpMethod, String description) {
        this.url = url;
        this.httpMethod = httpMethod;
        this.description = description;
    }

    public EndpointRegistry() {
    }
}
