CREATE TABLE appointments (
    id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    status_id varchar(100),
    patient_id BIGINT,
    staff_id BIGINT,
    appointment_date DATE,
    notes TEXT,
    
    FOREIGN KEY(patient_id) REFERENCES patients(id),
    FOREIGN KEY(staff_id) REFERENCES staff(id)
)