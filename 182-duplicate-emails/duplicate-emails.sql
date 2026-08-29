# Write your MySQL query statement below
Select email as Email
From Person
group by email
Having count(*) > 1;