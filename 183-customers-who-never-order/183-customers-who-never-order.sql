SELECT C.name as Customers from Customers C
WHERE C.id NOT IN (SELECT O.customerId FROM Orders O)