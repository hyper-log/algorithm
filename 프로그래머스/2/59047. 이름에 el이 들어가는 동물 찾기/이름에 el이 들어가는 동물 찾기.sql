-- 코드를 입력하세요
SELECT animal_id, name
FROM animal_ins
where name like '%el%' and name like '%EL%' and animal_type = 'Dog'
order by name asc