CREATE DATABASE BANGLOOR;
USE BANGLOOR;
DROP DATABASE BANGLOOR;
CREATE TABLE METRO(
ID INT,BUS_NAME VARCHAR(1000),BUS_NUMBER INT,STATION_NAME VARCHAR(1000),STATION_ID VARCHAR(1000),CITY VARCHAR(1000),
TICKET_PRICE FLOAT,STARTING_TIME INT,ENDING_TIME INT,TRAVEL_DISTANCE VARCHAR(1000)
);
SELECT * FROM METRO;
INSERT INTO METRO VALUES(1,'A',2013,'VIVEKANANDHA STATION','ABCD123','ELECTRONIC CITY',50.2,8,9,'200KM'),
(2,'B',1236,'VIJAYANAGARA STATION','MKLOP12','WHITE FIELD',200.52,7,10,'300KM'),
(3,'C',4201,'CENTRAL STATION','ADGJ258','HOSUR',300.5,6,12,'100KM'),
(4,'D',2031,'EAST STATION','ZXCV258','MARTHAHALLI',3000.50,6,12,'500KM'),
(5,'E',2587,'WEST STATION','QWER147','MYSORE',4000.50,7,12,'600KM'),
(6,'F',1236,'EAST-WEST STATION','LVUS143','RAJAJINAGAR',500.32,12,12,'NONSTOP'),
(7,'G',2587,'NORTH STATION','QWER123','MAGESTIC',200.0,12,12,'NONSTOP'),
(8,'H',4563,'SOUTH STATION','ASDF123','KRPURAM',200.500,12,12,'NONSTOP'),
(9,'I',4567,'YASWATHPUR','ASER145','BAYANAPPAHALLI',200.0,12,12,'NONSTOP'),
(10,'v',14323,'SV STATION','ABCD123','KOLAR',300.23,12,12,'800KM');
SELECT *FROM METRO;
ALTER TABLE METRO RENAME METRO_INFO;
ALTER TABLE METRO_INFO RENAME COLUMN BUS_NAME TO BUSNAME;
ALTER TABLE METRO_INFO ADD COLUMN AVAILABLE VARCHAR(1000);
ALTER TABLE METRO_INFO DROP COLUMN STATION_ID;
ALTER TABLE METRO_INFO MODIFY COLUMN TRAVEL_DISTANCE VARCHAR(2000);

CREATE TABLE MOVIE(
SNO INT,MOVIENAME VARCHAR(2000),TEATRE_NAME VARCHAR(2000),LOCATION VARCHAR(1000),TICKET_PRICE INT,
TEATRE_MANAGERNAME VARCHAR(1000),HERONAME VARCHAR(1000),HEROINNAME VARCHAR(1000),SONGNAME VARCHAR(1000),NOOFSONGS INT
);
SELECT * FROM MOVIE;
INSERT INTO MOVIE VALUES(1,'KUSHI','PGR','TIRUPATHI',250,'SHIVA','VIJAYA DEVARAKONDA','SAMANTHA','NAROJANUVVE',6),
(2,'MANAM','SURYA','TIRUPATHI',540,'VANITHA','NAGARJUNA','LAVANYATRIPATI','NENAVEHAYIGAUNDHI',7),
(3,'RRR','SVL','KADAPA',600,'SHIVANI','NTR','ABCD','NATUNATU',4),
(4,'DARLING','SSS','KADAPA',500,'SHIVA','PRABAS','KAJAL','NEVEENEVEE',4),
(5,'MR.PERFECT','VASANTHA','BANGLOOR',500,'POORNA','PRABHAS','KAJAL','MR.PERFECT',5),
(6,'NANNAKUPREMATHO','TRISUOL','TPT',400,'RAGHAVENDRA','NTR','RAKUL','LOVEMEAGAIN',6),
(7,'OYE','LAVANYA','HOSUR',250,'KUSUMA','SIDDU','EESHA','SEHARI',7),
(8,'3','SV','TPT',300,'PRAKASH','DHANUSH','SRUTHIHASAN','POVEPO',7),
(9,'DADDY','AB','VIJAYANAGAR',230,'SONY','CHIRANJEEVI','SHREYA','GUMADI',5),
(10,'GANGA','PLR','KRPURA',250,'HARISH','RAGHAVA','TAPSEE','RARANAVEERA',6);
SELECT * FROM MOVIE;
ALTER TABLE MOVIE RENAME MOVIE_INFO;
ALTER TABLE MOVIE_INFO RENAME COLUMN MOVIENAME TO MOVIE_NAME;
ALTER TABLE MOVIE_INFO ADD COLUMN DIRECTOR VARCHAR(1000);
ALTER TABLE MOVIE_INFO DROP COLUMN LOCATION;
ALTER TABLE MOVIE_INFO MODIFY COLUMN NOOFSONGS VARCHAR(2000);
drop table resart;
CREATE TABLE RESART (
    restaurant_id INT,
    restaurant_name VARCHAR(2000),
    address VARCHAR(2550),
    city VARCHAR(2000),
    cuisine_type VARCHAR(2000),
    rating float,
    open_hours VARCHAR(1000),
    contact_number VARCHAR(2000),
    website_url VARCHAR(2550),
    delivery_available BOOLEAN
    );
    SELECT * FROM RESART;
    INSERT INTO RESART (restaurant_id, restaurant_name, address, city, cuisine_type, rating, open_hours, contact_number, website_url, delivery_available) VALUES
(1, 'Tasty Bites', '123 Main St', 'Bangloor', 'Indian', 4.5, '10:00 AM - 9:00 PM', '123-456-7890', 'https://www.tastybites.com', true),
(2, 'Pizza Paradise', '456 Elm St', 'Bangloor', 'Italian', 4.2, '11:00 AM - 10:00 PM', '987-654-3210', 'https://www.pizzaparadise.com', true),
(3, 'Sushi Sensation', '789 Oak St', 'Bangloor', 'Japanese', 4.7, '12:00 PM - 8:00 PM', '555-123-4567', 'https://www.sushisensation.com', true),
(4, 'Burger Haven', '101 Pine St', 'Bangloor', 'American', 4.0, '11:00 AM - 10:00 PM', '111-222-3333', 'https://www.burgerhaven.com', true),
(5, 'Noodle Express', '222 Cedar St', 'Bangloor', 'Chinese', 4.3, '10:30 AM - 9:30 PM', '777-888-9999', 'https://www.noodleexpress.com', true),
(6, 'Mediterranean Delight', '333 Maple St', 'Bangloor', 'Mediterranean', 4.6, '12:00 PM - 9:00 PM', '999-888-7777', 'https://www.mediterraneandelight.com', true),
(7, 'Fisherman','444 Birch St', 'Bangloor', 'Seafood', 4.4, '11:30 AM - 9:30 PM', '444-555-6666', 'https://www.fishermanscatch.com', true),
(8, 'Veggie Heaven', '555 Walnut St', 'Bangloor', 'Vegetarian', 4.8, '10:30 AM - 8:30 PM', '666-777-8888', 'https://www.veggieheaven.com', true),
(9, 'BBQ Grill House', '666 Cedar St', 'Bangloor', 'Barbecue', 4.1, '12:00 PM - 10:00 PM', '333-222-1111', 'https://www.bbqgrillhouse.com', true),
(10, 'Sweet Treats Bakery', '777 Oak St', 'Bangloor', 'Bakery', 4.9, '9:00 AM - 7:00 PM', '888-999-0000', 'https://www.sweettreatsbakery.com', true);
SELECT * FROM RESART;
ALTER TABLE RESART RENAME RESART_INFO;
ALTER TABLE RESART_INFO RENAME COLUMN RESTAURANT_NAME TO RESTONAME;
ALTER TABLE RESART_INFO ADD COLUMN FEEDBACK VARCHAR(1000);
ALTER TABLE RESART_INFO DROP COLUMN CUISINE_TYPE;
ALTER TABLE RESART_INFO MODIFY COLUMN  DELIVERY_AVAILABLE BOOLEAN;

CREATE TABLE RESTAURANT(
SNO INT,RESTO_NAME VARCHAR(2000),LOCATION VARCHAR(2000),NOOFITEMS INT,MENU VARCHAR(2000),ACAVAILABLE VARCHAR(2000),
ORDERFOOD VARCHAR(2000),STARTING_PRICE INT,PRICEOFTHEITEM INT,TASTE VARCHAR(2000)
);
SELECT * FROM RESTAURANT;
INSERT INTO RESTAURANT VALUES(1,'STARFOOD','TPT',300,'NON-VEG','YES','CHICKENBIRIYANI',60,150,'GOOD'),
(2,'PARADISE','TPT',300,'NON=VEG','YES','CHICKENSTARTERS',200,150,'BETTER'),
(3, 'Pizza Paradise', '456 Elm St', 30, 'Pizza Menu', 'Yes', 'Online', 250, 12, 'Savory'),
(4, 'Sushi Sensation', '789 Oak St', 40, 'Sushi Menu', 'Yes', 'Online', 300, 15, 'Exquisite'),
(5, 'Burger Haven', '101 Pine St', 35, 'Burger Menu', 'Yes', 'Online', 180, 8, 'Juicy'),
(6, 'Noodle Express', '222 Cedar St', 45, 'Noodle Menu', 'Yes', 'Online', 220, 11, 'Flavorful'),
(7, 'Mediterranean Delight', '333 Maple St', 30, 'Mediterranean Menu', 'Yes', 'Online', 280, 14, 'Satisfying'),
(8, 'Fisherman\'s Catch', '444 Birch St', 25, 'Seafood Menu', 'Yes', 'Online', 350, 18, 'Fresh'),
(9, 'Veggie Heaven', '555 Walnut St', 40, 'Vegetarian Menu', 'Yes', 'Online', 190, 9, 'Healthy'),
(10, 'BBQ Grill House', '666 Cedar St', 35, 'Barbecue Menu', 'Yes', 'Online', 270, 13, 'Smoky');
select * from restaurant;
ALTER TABLE RESTAURANT RENAME RESTO_INFO;
ALTER TABLE RESTO_INFO RENAME COLUMN RESTO_NAME TO RESTONAME;
ALTER TABLE RESTO_INFO ADD COLUMN HOTELTIMINGS VARCHAR(1000);
ALTER TABLE RESTO_INFO DROP COLUMN MENU;
ALTER TABLE RESTO_INFO MODIFY COLUMN TASTE VARCHAR(3000);

CREATE TABLE MALLS(
mall_id INT,
    mall_name VARCHAR(2550),
    location VARCHAR(2550),
    city VARCHAR(1000),
    opening_date DATE,
    total_shops INT,
    parking_available BOOLEAN,
    food_court_available BOOLEAN,
    entertainment_zone VARCHAR(2505),
    contact_number VARCHAR(2000)
);
INSERT INTO MALLS VALUES
(1, 'Mega Mall', '123 Main St', 'Bangloor', 150, true, '10:00 AM - 9:00 PM', '123-456-7890', 'https://www.megamall.com', true),
(2, 'City Center', '456 Elm St', 'Bangloor', 100, true, '11:00 AM - 10:00 PM', '987-654-3210', 'https://www.citycenter.com', true),
(3, 'Fashion Square', '789 Oak St', 'Bangloor', 120, true, '12:00 PM - 8:00 PM', '555-123-4567', 'https://www.fashionsquare.com', true),
(4, 'Westside Plaza', '101 Pine St', 'Bangloor', 80, true, '11:00 AM - 10:00 PM', '111-222-3333', 'https://www.westsideplaza.com', true),
(5, 'Tech Park Mall', '222 Cedar St', 'Bangloor', 90, true, '10:30 AM - 9:30 PM', '777-888-9999', 'https://www.techparkmall.com', true),
(6, 'Central Mall', '333 Maple St', 'Bangloor', 110, true, '12:00 PM - 9:00 PM', '999-888-7777', 'https://www.centralmall.com', true),
(7, 'Galleria', '444 Birch St', 'Bangloor', 70, true, '11:30 AM - 9:30 PM', '444-555-6666', 'https://www.galleria.com', true),
(8, 'Suburbia Shopping Center', '555 Walnut St', 'Bangloor', 85, true, '10:30 AM - 8:30 PM', '666-777-8888', 'https://www.suburbiashopping.com', true),
(9, 'The Mall at Riverfront', '666 Cedar St', 'Bangloor', 95, true, '12:00 PM - 10:00 PM', '333-222-1111', 'https://www.riverfrontmall.com', true),
(10, 'Fusion Mall', '777 Oak St', 'Bangloor', 130, true, '9:00 AM - 7:00 PM', '888-999-0000', 'https://www.fusionmall.com', true);
SELECT * FROM MALLS;
ALTER TABLE MALLS RENAME MALLS_INFO;
ALTER TABLE MALLS_INFO RENAME COLUMN MALL_NAME TO MALLNAME;
ALTER TABLE MALLS_INFO ADD COLUMN MALLTIMINGS VARCHAR(1000);
ALTER TABLE MALLS_INFO DROP COLUMN OPENINGDATE;
ALTER TABLE MALLS_INFO MODIFY COLUMN QUALITYOFITEM VARCHAR(3000);

CREATE TABLE SHOWROOM(
showroom_id INT PRIMARY KEY,showroom_name VARCHAR(255),location VARCHAR(255),city VARCHAR(50),total_cars INT,
    open_hours VARCHAR(100),contact_number VARCHAR(20),website_url VARCHAR(255),has_service_center BOOLEAN,available_models VARCHAR(255)
);
SELECT * FROM SHOWROOM;
INSERT INTO SHOWROOM VALUES
(1, 'Car World', '123 Main St', 'Bangloor', 50, '10:00 AM - 8:00 PM', '123-456-7890', 'http://www.carworld.com', 1, 'Sedan, SUV, Hatchback'),
(2, 'Auto Universe', '456 Elm St', 'Bangloor', 30, '10:00 AM - 7:30 PM', '987-654-3210', 'http://www.autouniverse.com', 0, 'SUV, Pickup'),
(3, 'Speed Motors', '789 Oak St', 'Bangloor', 40, '9:00 AM - 6:00 PM', '555-123-4567', 'http://www.speedmotors.com', 1, 'Sedan, Hatchback'),
(4, 'Metro Auto', '101 Pine St', 'Bangloor', 25, '10:30 AM - 8:00 PM', '111-222-3333', 'http://www.metroauto.com', 0, 'SUV, Electric'),
(5, 'City Cars', '222 Cedar St', 'Bangloor', 35, '9:30 AM - 7:00 PM', '777-888-9999', 'http://www.citycars.com', 1, 'Sedan, Hatchback'),
(6, 'Elite Autos', '333 Maple St', 'Bangloor', 30, '10:00 AM - 6:30 PM', '999-888-7777', 'http://www.eliteautos.com', 1, 'Luxury, SUV'),
(7, 'Prestige Motors', '444 Birch St', 'Bangloor', 20, '10:00 AM - 6:00 PM', '444-555-6666', 'http://www.prestigemotors.com', 0, 'Luxury, Electric'),
(8, 'Dream Cars', '555 Walnut St', 'Bangloor', 45, '9:00 AM - 8:30 PM', '666-777-8888', 'http://www.dreamcars.com', 1, 'Sports, Convertible'),
(9, 'Green Auto', '666 Cedar St', 'Bangloor', 35, '10:00 AM - 7:30 PM', '333-222-1111', 'http://www.greenauto.com', 1, 'Electric, Hybrid'),
(10, 'Sunrise Motors', '777 Oak St', 'Bangloor', 28, '10:00 AM - 8:00 PM', '888-999-0000', 'http://www.sunrisemotors.com', 1, 'Sedan, SUV');
ALTER TABLE SHOWROOM RENAME SHOWROOM_INFO;
ALTER TABLE SHOWROOM_INFO RENAME COLUMN SHOWROOM_NAME TO SHOWROOMNAME;
ALTER TABLE SHOWROOM_INFO ADD COLUMN SHOWROOMTIMINGS VARCHAR(1000);
ALTER TABLE SHOWROOM_INFO DROP COLUMN TOTAL_CARS;
ALTER TABLE SHOWROOM_INFO MODIFY COLUMN available_models  VARCHAR(3000);

DROP TABLE MALL_INFO;