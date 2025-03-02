CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) UNIQUE NOT NULL
);

CREATE TABLE subscription (
    id SERIAL PRIMARY KEY,
    service_name VARCHAR(255) NOT NULL,
    user_id INT NOT NULL,
    CONSTRAINT fk_user
        FOREIGN KEY (user_id)
        REFERENCES users(id)
        ON DELETE CASCADE
);

INSERT INTO users (name, email) VALUES
    ('Alice', 'alice@example.com'),
    ('Bob', 'bob@example.com'),
    ('Charlie', 'charlie@example.com'),
    ('David', 'david@example.com'),
    ('Eve', 'eve@example.com'),
    ('Frank', 'frank@example.com'),
    ('Grace', 'grace@example.com'),
    ('Hank', 'hank@example.com'),
    ('Ivy', 'ivy@example.com'),
    ('Jack', 'jack@example.com');

INSERT INTO subscription (service_name, user_id) VALUES
    ('Netflix', 1),
    ('YouTube Premium', 2),
    ('Spotify', 3),
    ('Netflix', 4),
    ('YouTube Premium', 5),
    ('Spotify', 6),
    ('Netflix', 7),
    ('YouTube Premium', 8),
    ('Spotify', 9),
    ('Netflix', 10),
    ('YouTube Premium', 3),
    ('Spotify', 4),
    ('Spotify', 5),
    ('Spotify', 8),
    ('Netflix', 2),
    ('Amazon TV', 1),
    ('Spotify', 1);


