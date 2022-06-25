SELECT E1.name as Employee from Employee E1, Employee E2
Where E1.managerId = E2.id AND E1.salary > E2.salary