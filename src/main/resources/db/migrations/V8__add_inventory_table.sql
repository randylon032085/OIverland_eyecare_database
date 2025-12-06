CREATE TABLE inventory(
    id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    category_id BIGINT,
    item_name varchar(100),
    brand varchar(50),
    cost_price DECIMAL(10,2),
    selling_price DECIMAL(10,2),
    stock int DEFAULT 0,
    FOREIGN KEY(category_id) REFERENCES category (id)
)