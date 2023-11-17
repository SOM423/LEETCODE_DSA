# Write your MySQL query statement below
SELECT r.contest_id,ROUND((COUNT(r.contest_id)/(Select Count(*) From Users))*100,2) As percentage
From Users u Right JOIN Register r
ON u.user_id = r.user_id
Group by r.contest_id
ORDER BY percentage Desc,Contest_id