CREATE TABLE users_users (
  id VARCHAR(36) NOT NULL PRIMARY KEY,
  email VARCHAR(100) NOT NULL UNIQUE,
  password_hash VARCHAR(100) NOT NULL,
  enabled BOOLEAN NOT NULL DEFAULT FALSE
);

CREATE TABLE users_authorities (
    id VARCHAR(36) NOT NULL PRIMARY KEY,
    name VARCHAR(36) NOT NULL UNIQUE
);

CREATE TABLE users_users_authorities(
    user_id VARCHAR(36) NOT NULL REFERENCES users_users (id) ON DELETE CASCADE,
    authority_id VARCHAR(36) NOT NULL REFERENCES users_authorities (id) ON DELETE CASCADE
);

CREATE UNIQUE INDEX users_authorities_idx ON users_users_authorities (user_id, authority_id);