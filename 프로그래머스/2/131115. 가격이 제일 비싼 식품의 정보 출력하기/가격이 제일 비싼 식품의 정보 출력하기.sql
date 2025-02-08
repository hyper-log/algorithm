select *
FROM Food_product
where price = (select max(price) from food_product)