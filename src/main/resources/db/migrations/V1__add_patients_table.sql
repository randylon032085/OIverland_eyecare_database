CREATE TABLE patients (
    id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    firstname varchar(100),
    lastname varchar(100),
    date_of_birth DATE,
    gender varchar(10),
    phone varchar(20),
    email varchar(100),
    address TEXT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
)