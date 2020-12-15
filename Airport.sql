CREATE DATABASE Airport;
 
USE Airport;

CREATE TABLE pilots(
id INT AUTO_INCREMENT,
name  VARCHAR(100) NOT NULL,
last_name VARCHAR(100),
rank VARCHAR(100) NOT NULL,
pilot_code VARCHAR(100) UNIQUE NOT NULL,
PRIMARY KEY (id)
);

CREATE TABLE aircraft(
id INT AUTO_INCREMENT,
brand  VARCHAR(100) NOT NULL,
model VARCHAR(100),
passenger_capacity INT,
tail_number INT UNIQUE NOT NULL,
PRIMARY KEY (id)
);

CREATE TABLE flights(
id INT AUTO_INCREMENT,
aircrat INT NOT NULL,
pilot INT NOT NULL,
data DATE,
time TIME,
flight_number INT UNIQUE NOT NULL,
PRIMARY KEY (id),
FOREIGN KEY (aircrat) REFERENCES aircraft (id),
FOREIGN KEY (pilot) REFERENCES pilots (id)
);