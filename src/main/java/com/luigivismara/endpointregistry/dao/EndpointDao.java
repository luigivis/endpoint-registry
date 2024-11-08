package com.luigivismara.endpointregistry.dao;

import com.luigivismara.endpointregistry.dto.EndpointRegistry;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Endpoint data access object to store endpoint information to database
 */
@Repository
public class EndpointDao {
    private final JdbcTemplate jdbcTemplate;

    public EndpointDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    /**
     * Save into table endpoints
     * @param endpointRegistry Objects
     */
    public void save(EndpointRegistry endpointRegistry) {
        var sql = "INSERT INTO endpoints (url, http_method, description) VALUES (?, ?, ?)";
        System.out.println("Query -> " + sql);
        jdbcTemplate.update(sql, endpointRegistry.getUrl(), endpointRegistry.getHttpMethod(), endpointRegistry.getDescription());
    }
}
