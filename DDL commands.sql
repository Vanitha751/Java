create database country;
show databases;
select user();
select database();
use country;
drop database country;

create database state;
show databases;
select user;
select database();
use state;
drop database state;

CREATE TABLE COUNTRY_INFO(
ID INT,
NAME VARCHAR(20),
CAPITAL VARCHAR(20)

);

SELECT * FROM COUNTRY_INFO;

CREATE TABLE STATE(
ID INT,
NAME VARCHAR(30),
CAPITAL VARCHAR(15)
);
SELECT * FROM STATE;

CREATE TABLE CITY(
ID INT,
NAME VARCHAR(30),
NAMEOFTHESTATE VARCHAR(20)
);

INSERT INTO STATE (ID,NAME,CAPITAL)
VALUES(1,'KARNATAKA','BANGLOOR')
,(2,'ap','Amaravathi');

select * from state;

INSERT INTO CITY(ID,NAME,NAMEOFTHESTATE)
VALUES(1,'TIRUPATHI','AP'),
(2,'TELANGANA','HYDERABAD');

select * from CITY;

