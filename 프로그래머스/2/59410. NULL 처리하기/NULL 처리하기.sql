-- 코드를 입력하세요
SELECT animal_type, 
CASE 
    WHEN name IS NULL then 'No name'
    WHEN name IS NOT NULL then name END as name, 
SEX_UPON_INTAKE
from animal_ins