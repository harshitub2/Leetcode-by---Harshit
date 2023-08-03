# Write your MySQL query statement below
/*select count(case when income < 20000 as 1 else 0 end) as Low Salary, count(case when income is between 20000 and 50000 as 1 else 0 end) as Average Salary,count(case when income > 50000 as 1 else 0 end) as High Salary from Accounts;*/

select 'Low Salary' as category, sum(case when income <20000 then 1 else 0 end) as accounts_count from Accounts union (select 'Average Salary' as category, sum(case when income between 20000 and 50000 then 1 else 0 end) as accounts_count from Accounts) union  (select 'High Salary' as category, sum(case when income > 50000 then 1 else 0 end) as accounts_count from Accounts);