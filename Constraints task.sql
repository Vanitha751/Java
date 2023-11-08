CREATE DATABASE COMPANY;
USE COMPANY;
DROP DATABASE COMPANY;
CREATE TABLE EMPLOYEE(
SNO INT,EMPLOYEE_ID INT PRIMARY KEY,EMPLOYEE_NAME VARCHAR(2000) NOT NULL,EMPLOYEE_PHONENUMBER LONG UNIQUE,EMPLOYEE_MAILID VARCHAR(2000) NOT NULL UNIQUE,
EMPLOYEE_AADHARNUMBER VARCHAR(2000) UNIQUE,EMPLOYEE_SALARY VARCHAR(2000)NOT NULL UNIQUE,EMPLOYEE_TIMINGS BOOLEAN,EMPLOYEEATTENDANCE VARCHAR(2000) NOT NULL,EMPLOYEE_UNIFORMCOLOUR VARCHAR(2000) NOT NULL
); 
INSERT INTO EMPLOYEE  VALUES
(1, 1001, 'Vanitha', '1234056789', 'vanitha@.com', '1234-5678-9012', '50000', true, 'Present', 'Blue'),
(2, 1002, 'Shiva', '9876543210', 'shiva@.com', '9876-5432-1098', '55000', true, 'Present', 'Red'),
(3, 1003, 'Prakash', '5556667777', 'prakash@.com', '5555-6666-7777', '60000', true, 'Present', 'Green'),
(4, 1004, 'Reddy', '3332221111', 'reddy@.com', '3333-2222-1111', '52000', true, 'Present', 'Black'),
(5, 1005, 'Bujji',' 7778889999', 'bujji@.com', '7777-8888-9999', '53000', true, 'Present', 'White'),
(6, 1006, 'Shivani',' 1112223333', 'shivani@.com', '1111-2222-3333', '51000', true, 'Present', 'Gray'),
(7, 1007, 'Potti', '9990001111', 'potti@.com', '9990-0011-1122', '54000', true, 'Present', 'Brown'),
(8, 1008, 'John', '4445556666', 'john@.com', '4444-5555-6666', '56000', true, 'Present', 'Yellow'),
(9, 1009, 'Smith', '6667778888', 'smith@.com', '6666-7777-8888', '58000', true, 'Present', 'Orange'),
(10, 1010, 'Doe', '2223334444', 'doe@.com', '2222-3333-4444', '59000', true, 'Present', 'Purple');
SELECT * FROM EMPLOYEE;
TRUNCATE TABLE EMPLOYEE;
SELECT * FROM EMPLOYEE WHERE EMPLOYEE_ID=EMPLOYEE_ID;
CREATE TABLE DEPARTMENT (
DEPARTMENT_ID INT PRIMARY KEY,DEPARTMENT_NAME VARCHAR(255)  NOT NULL,LOCATION VARCHAR(255) NOT NULL,MANAGER VARCHAR(255)NOT NULL,EMPLOYEE_COUNT INT UNIQUE);
INSERT INTO DEPARTMENT (DEPARTMENT_ID, DEPARTMENT_NAME, LOCATION, MANAGER, EMPLOYEE_COUNT) VALUES
(1, 'Human Resources', 'New York', 'Alice Johnson', 12),
(2, 'Information Technology', 'San Francisco', 'John Smith', 25),
(3, 'Sales', 'Los Angeles', 'Mary Wilson', 18),
(4, 'Finance', 'Chicago', 'David Brown', 10),
(5, 'Marketing', 'Boston', 'Sarah Davis', 15),
(6, 'Research and Development', 'Austin', 'Michael Lee', 20),
(7, 'Customer Support', 'Seattle', 'Lisa Taylor', 14),
(8, 'Production', 'Denver', 'Robert Miller', 22),
(9, 'Quality Assurance', 'Miami', 'Karen Anderson', 8),
(10, 'Legal', 'Dallas', 'William Jackson', 6);
SELECT * FROM DEPARTMENT;
SELECT * FROM DEPARTMENT WHERE DEPARTMENT_ID = 3; 
SELECT * FROM DEPARTMENT WHERE DEPARTMENT_NAME = 'Sales';
