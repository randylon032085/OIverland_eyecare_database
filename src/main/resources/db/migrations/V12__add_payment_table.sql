CREATE TABLE payment(
    id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    payment_method_id BIGINT,
    sales_id BIGINT,
    amount DECIMAL(10,2),
    payment_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY(payment_method_id) REFERENCES payment_method(id),
    FOREIGN KEY(sales_id) REFERENCES sales(id)
)