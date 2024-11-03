package com.luigivismara.endpointregistry.dto;

/**
 * Endpoint object
 * @param url the url
 * @param httpMethod the http method
 * @param description the description
 */
public record Endpoint(String url, String httpMethod, String description) {
}
