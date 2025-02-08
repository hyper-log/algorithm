select count(ID) as FISH_COUNT
FROM FISH_INFO
group by length
HAVING length is null or length <= 10