SELECT u.name, (SELECT ifnull(SUM(r.distance), 0)
FROM rides r
WHERE u.id = r.user_id) as travelled_distance
from users u
order by travelled_distance desc, name asc