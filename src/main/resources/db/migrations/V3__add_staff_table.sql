CREATE TABLE staff(
    id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    role_id BIGINT NOT NULL,
    firstname varchar(100),
    lastname varchar(100),
    phone varchar(20),
    email varchar(100),
    hired_date DATE,
    FOREIGN KEY (role_id) REFERENCES roles(id)
)