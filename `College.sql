CREATE DATABASE COLLEGE;
USE COLLEGE;
CREATE TABLE DEPARTMENT (
    DEPARTMENT_ID INT PRIMARY KEY,DEPARTMENT_NAME VARCHAR(255) NOT NULL
);
INSERT INTO DEPARTMENT VALUES
(1, 'Computer Science'),(2, 'Electrical Engineering'),(3, 'Mathematics'),(4, 'Physics'),(5, 'Chemistry'),
(6, 'Biology'),(7, 'History'),(8, 'English Literature'),(9, 'Business Administration'),(10, 'Psychology');
SELECT * FROM DEPARTMENT WHERE DEPARTMENT_NAME = 'Computer Science';
CREATE TABLE TRAINER (
    TRAINER_ID INT PRIMARY KEY,
    TRAINER_NAME VARCHAR(255) NOT NULL
);
INSERT INTO TRAINER (TRAINER_ID, TRAINER_NAME) VALUES
(1, 'John'),(2, 'Mary'),(3, 'David'),(4, 'Anna'),(5, 'sony'),
(6, 'Lavanya'),(7, 'Michael'),(8, 'shiva'),(9, 'vani'),(10, 'shivanir');
CREATE TABLE ADMISSION_SECTION (
    ADMISSION_ID INT PRIMARY KEY,
    ADMISSION_NAME VARCHAR(255) NOT NULL
);
INSERT INTO ADMISSION_SECTION VALUES(1, 'Admission Section A'),(2, 'Admission Section B'),
(3, 'Admission Section C'),(4, 'Admission Section D'),(5, 'Admission Section E'),(6, 'Admission Section F'),
(7, 'Admission Section G'),(8, 'Admission Section H'),(9, 'Admission Section I'),(10, 'Admission Section J');
CREATE TABLE EXAM_CELL (
    EXAM_ID INT PRIMARY KEY,
    EXAM_NAME VARCHAR(255) NOT NULL
);
INSERT INTO EXAM_CELL (EXAM_ID, EXAM_NAME) VALUES
(1, 'Final Exams'),(2, 'Midterm Exams'),(3, 'Entrance Exams'),(4, 'Practical Exams'),(5, 'Viva Exams'),(6, 'Semester Exams'),
(7, 'Placement Exams'),(8, 'Mock Exams'),(9, 'Quiz Exams'),(10, 'Retake Exams');
CREATE TABLE PLACEMENT_CELL (
    CELL_ID INT PRIMARY KEY,CELL_NAME VARCHAR(255) NOT NULL,LOCATION VARCHAR(255) NOT NULL,PACKAGE_OFFERED DECIMAL(10, 2) NOT NULL
);
INSERT INTO PLACEMENT_CELL (CELL_ID, CELL_NAME, LOCATION, PACKAGE_OFFERED) VALUES
(1, 'Cell A', 'City X', 600000.00),(2, 'Cell B', 'City Y', 550000.00),(3, 'Cell C', 'City Z', 700000.00),
(4, 'Cell D', 'City X', 650000.00),(5, 'Cell E', 'City Y', 750000.00);
SELECT * FROM PLACEMENT_CELL WHERE PACKAGE_OFFERED = 700000.00;