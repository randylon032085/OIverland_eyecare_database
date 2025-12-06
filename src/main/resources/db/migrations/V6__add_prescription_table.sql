CREATE TABLE prescription(
    id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    prescription_type varchar(100),
    eye_exam_id BIGINT,
    valid_until DATE,
    remarks TEXT,
    FOREIGN KEY (eye_exam_id) REFERENCES eye_exam(id)
)