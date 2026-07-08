-- Session 3: Joins & Basic Queries

-- Use Case 1: Find Highest Confirmed Cases using INNER JOIN
SELECT 
    c.country_name,
    cc.date,
    cc.confirmed_cases
FROM covid_cases cc
INNER JOIN countries c
ON cc.country_id = c.country_id
WHERE cc.date = '2021-01-01'
ORDER BY cc.confirmed_cases DESC
LIMIT 1;


-- Use Case 2: Join COVID Deaths and Vaccination Data using LEFT JOIN
SELECT 
    c.country_name,
    cd.total_deaths,
    COALESCE(cv.vaccination_status, 'Not Available') AS vaccination_status
FROM covid_deaths cd
LEFT JOIN covid_vaccines cv
ON cd.country_id = cv.country_id
INNER JOIN countries c
ON cd.country_id = c.country_id;


-- Use Case 3: Analyze Deaths by Continent
SELECT 
    con.continent_name,
    SUM(cd.total_deaths) AS total_deaths
FROM covid_cases cc
INNER JOIN countries c
ON cc.country_id = c.country_id
INNER JOIN continents con
ON c.continent_id = con.continent_id
INNER JOIN covid_deaths cd
ON cc.country_id = cd.country_id
GROUP BY con.continent_name;


-- Use Case 4: Calculate Average New Deaths Per Day
SELECT 
    date,
    AVG(new_deaths) AS average_daily_deaths
FROM covid_cases
GROUP BY date
ORDER BY date;


-- Use Case 5: Find Countries with Highest Infection Rates
SELECT
    c.country_name,
    c.population,
    cc.confirmed_cases,
    ROUND((cc.confirmed_cases * 100.0 / c.population),2) AS infection_rate
FROM covid_cases cc
INNER JOIN countries c
ON cc.country_id = c.country_id
ORDER BY infection_rate DESC;