CREATE TABLE IF NOT EXISTS endpoints (
                                         id SERIAL PRIMARY KEY,
                                         url VARCHAR(255) NOT NULL,
                                         http_method VARCHAR(10) NOT NULL,
                                         description VARCHAR(500)
);