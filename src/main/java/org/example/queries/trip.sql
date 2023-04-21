CREATE TABLE trip(
                     trip_id INT PRIMARY KEY,
                     airplane VARCHAR(50),
                     town_from VARCHAR(50),
                     town_to varchar(50),
                     time_out DATE,
                     time_in DATE,
                     company_id INT,
                     FOREIGN KEY (company_id)
                         REFERENCES companies(id)
);