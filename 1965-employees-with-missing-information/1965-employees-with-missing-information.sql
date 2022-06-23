SELECT employee_id from Employees WHERE employee_id NOT IN (SELECT employee_id from Salaries)
UNION
SELECT employee_id from Salaries WHERE employee_id NOT IN (SELECT employee_id from Employees)
ORDER BY employee_id