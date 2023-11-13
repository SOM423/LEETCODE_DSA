# Write your MySQL query statement below
SELECT e1.name
FROM Employee as e1 INNER JOIN  Employee as e2 
ON e2.managerId = e1.id
Group by e2.managerId
Having count(e1.id) >= 5