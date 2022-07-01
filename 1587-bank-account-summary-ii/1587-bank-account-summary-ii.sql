SELECT u.name, SUM(t.amount) as balance FROM Users u JOIN Transactions t
ON u.account = t.account
GROUP BY t.account 
HAVING balance > 10000;