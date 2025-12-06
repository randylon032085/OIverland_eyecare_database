CREATE TABLE eye_exam(
    id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    appointments_id BIGINT,
    right_eye_sphere DECIMAL(4,2),
    right_eye_cylinder DECIMAL(4,2),
    right_eye_axis int,
    left_eye_sphere DECIMAL(4,2),
    left_eye_cylinder DECIMAL(4,2),
    left_eye_axis int,
    pd DECIMAL(4,1),
    exam_notes TEXT,
    exam_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY(appointments_id) REFERENCES appointments(id)
)