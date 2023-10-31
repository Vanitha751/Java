CREATE DATABASE T20WORLDCUP;
USE T20WORLDCUP;
CREATE TABLE T20_WorldCup (
    match_id INT,
    match_date DATE,
    team1 VARCHAR(255),
    team2 VARCHAR(255),
    venue VARCHAR(255),
    city VARCHAR(255),
    match_result VARCHAR(255),
    man_of_the_match VARCHAR(255),
    highest_run_scorer_team1 VARCHAR(255),
    highest_run_scorer_team2 VARCHAR(255),
    highest_wicket_taker_team1 VARCHAR(255),
    highest_wicket_taker_team2 VARCHAR(255),
    team1_score INT,
    team2_score INT,
    team1_wickets INT,
    team2_wickets INT,
    overs_played INT,
    super_over_result VARCHAR(255),
    match_type VARCHAR(255),
    tournament_year INT
);
SELECT * FROM T20_WORLDCUP;
INSERT INTO T20_WorldCup (match_id, match_date, team1, team2, venue, city, match_result, man_of_the_match, highest_run_scorer_team1, highest_run_scorer_team2, highest_wicket_taker_team1, highest_wicket_taker_team2, team1_score, team2_score, team1_wickets, team2_wickets, overs_played, super_over_result, match_type, tournament_year) VALUES
(1, '2022-11-01', 'India', 'Australia', 'MCG', 'Melbourne', 'India won by 15 runs', 'Rohit Sharma', 'KL Rahul', 'David Warner', 'Jasprit Bumrah', 'Mitchell Starc', 175, 160, 5, 8, 20, 'No', 'Group Stage', 2022),
(2, '2022-11-02', 'England', 'South Africa', 'Eden Gardens', 'Kolkata', 'England won by 6 wickets', 'Joe Root', 'Joe Root', 'Kagiso Rabada', 'Adil Rashid', 'Chris Woakes', 140, 136, 5, 5, 18, 'No', 'Group Stage', 2022),
(3, '2022-11-03', 'Pakistan', 'West Indies', 'Dubai International Stadium', 'Dubai', 'Pakistan won by 4 wickets', 'Babar Azam', 'Babar Azam', 'Shai Hope', 'Shai Hope', 'Shaheen Afridi', 160, 156, 6, 6, 20, 'No', 'Group Stage', 2022),
(4, '2022-11-10', 'India', 'England', 'Wankhede Stadium', 'Mumbai', 'India won by 22 runs', 'Virat Kohli', 'Jason Roy', 'Ben Stokes', 'Yuzvendra Chahal', 'Yuzvendra Chahal', 180, 158, 4, 7, 20, 'No', 'Final', 2022);
