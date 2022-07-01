SELECT u.name, (SELECT ifnull(SUM(r.distance), 0)
FROM rides r
WHERE u.id = r.user_id) as travelled_distance
FROM users u
ORDER BY travelled_distance desc, name asc