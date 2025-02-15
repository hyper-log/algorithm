-- 코드를 입력하세요
SELECT ANIMAL_ID, NAME, 
case WHEN (SEX_UPON_INTAKE like 'Neutered%') then 'O'
WHEN (SEX_UPON_INTAKE like 'Spayed%') then 'O' else 'X' END as 중성화
FROM ANIMAL_INS
order by ANIMAL_ID