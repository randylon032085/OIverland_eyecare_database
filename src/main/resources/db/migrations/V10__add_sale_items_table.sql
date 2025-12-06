CREATE TABLE sale_items(
    id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    sales_id BIGINT,
    inventory_id BIGINT,
    quantity int, 
    price DECIMAL(10,2),
    FOREIGN KEY(sales_id) REFERENCES sales(id),
    FOREIGN KEY(inventory_id) REFERENCES inventory(id)
)