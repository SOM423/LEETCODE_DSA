# Write your MySQL query statement below
SELECT P.Project_id,ROUND(AVG(e.experience_years),2) as average_years
FROM Project p LEFT JOIN EMPLOYEE e
ON p.employee_id=e.employee_id
Group by p.project_id
