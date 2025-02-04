-- 코드를 입력하세요
SELECT PT_NAME, PT_NO, GEND_CD, AGE, 
CASE when TLNO IS NULL then 'NONE' else TLNO END as TLNO
FROM PATIENT
where age <= 12 AND GEND_CD = 'W'
ORDER BY age desc, PT_NAME asc