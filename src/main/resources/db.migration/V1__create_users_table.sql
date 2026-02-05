CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE IF NOT EXISTS  users(
                                       id uuid primary key,
    name varchar(100) not null,
    email varchar(100) not null,
    role smallint not null,
    password varchar(100) not null,
    created_at TIMESTAMP(6) DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP(6),
    deleted_at TIMESTAMP(6)
    );