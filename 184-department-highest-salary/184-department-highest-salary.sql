SELECT D.name as Department, E.name as Employee, E.salary as Salary FROM Employee E, Department D
WHERE E.departmentId = D.id  
AND (DepartmentId,Salary) in (
    SELECT DepartmentId, MAX(Salary) as MAX FROM Employee GROUP BY DepartmentId
)
