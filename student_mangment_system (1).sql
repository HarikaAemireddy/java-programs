CREATE DATABASE student_managment_system;
use student_managment_system;

CREATE TABLE Student (
    student_id INT PRIMARY KEY,
    student_name VARCHAR(100) NOT NULL,
    date_of_birth DATE,
    email VARCHAR(255),
    phone_number VARCHAR(20)
);

CREATE TABLE Course (
    course_id INT PRIMARY KEY,
    course_name VARCHAR(100) NOT NULL,
    duration_in_months INT,
    course_fee DECIMAL(10, 2)
);

 CREATE TABLE Exams (
    exam_number INT PRIMARY KEY,
    student_id INT,
    subject VARCHAR(100),
    FOREIGN KEY (student_id) REFERENCES Student(student_id)
);

 CREATE TABLE Result (
    result_id INT PRIMARY KEY,
    student_id INT,
    score DECIMAL(5, 2),
    subject VARCHAR(100),
    FOREIGN KEY (student_id) REFERENCES Student(student_id)
);