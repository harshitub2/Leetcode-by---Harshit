# Write your MySQL query statement below
#select user_id,name, mail from Users where mail like '[a-zA-Z]%@leetcode.com';
SELECT user_id, name, mail
FROM users
WHERE mail regexp '^[a-zA-Z][a-zA-Z0-9_.-]*@leetcode[.]com';