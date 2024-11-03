package com.luigivismara.endpointregistry.dao;

import com.luigivismara.endpointregistry.dto.Endpoint;
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
     * @param endpoint Objects
     */
    public void save(Endpoint endpoint) {
        var sql = "INSERT INTO endpoints (url, http_method, description) VALUES (?, ?, ?)";
        System.out.println("Query -> " + sql);
        jdbcTemplate.update(sql, endpoint.url(), endpoint.httpMethod(), endpoint.description());
    }
}
