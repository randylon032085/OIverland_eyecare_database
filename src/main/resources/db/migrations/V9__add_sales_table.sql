CREATE TABLE sales(
    id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    patient_id BIGINT,
    staff_id BIGINT,
    sale_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    total_amount DECIMAL(10,2),
    FOREIGN KEY(patient_id) REFERENCES patients(id),
    FOREIGN KEY(staff_id) REFERENCES staff(id)
)