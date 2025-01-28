-- 코드를 입력하세요
SELECT SUBSTRING(PRODUCT_CODE, 1, 2) as category, count(product_id) as products
FROM product
group by category
order by product_code asc