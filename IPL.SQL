CREATE DATABASE IPL;
USE IPL;
DROP DATABASE IPL;

CREATE TABLE IPL_INFO (
    team_id INT PRIMARY KEY,
    team_name VARCHAR(255),
    city VARCHAR(255),
    captain VARCHAR(255),
    owner VARCHAR(255)
);
SELECT *FROM IPL_INFO;
    INSERT INTO IPL_INFO (team_id, team_name, city, captain, owner) VALUES
(1, 'Mumbai Indians', 'Mumbai', 'Rohit Sharma', 'Reliance Industries'),
(2, 'Chennai Super Kings', 'Chennai', 'MS Dhoni', 'Chennai Super Kings Cricket Ltd.'),
(3, 'Kolkata Knight Riders', 'Kolkata', 'Eoin Morgan', 'Knight Riders Sports Pvt. Ltd.'),
(4, 'Royal Challengers Bangalore', 'Bangalore', 'Virat Kohli', 'United Spirits'),
(5, 'Kings XI Punjab', 'Mohali', 'KL Rahul', 'KPH Dream Cricket Private Ltd.'),
(6, 'Sunrisers Hyderabad', 'Hyderabad', 'Kane Williamson', 'SUN TV Network'),
(7, 'Delhi Capitals', 'Delhi', 'Rishabh Pant', 'GMR Group and JSW Group'),
(8, 'Rajasthan Royals', 'Jaipur', 'Sanju Samson', 'Manoj Badale'),
(9, 'Deccan Gladiators', 'Hyderabad', 'David Warner', 'Deccan Chronicle'),
(10, 'Pune Warriors India', 'Pune', 'Steve Smith', 'Sahara Adventure Sports Ltd.');

