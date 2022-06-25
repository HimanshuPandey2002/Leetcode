SELECT DISTINCT e1.email as Email FROM Person e1
JOIN Person e2 ON (e1.email=e2.email)
WHERE e1.id != e2.id