-- 코드를 입력하세요
SELECT b.TITLE, b.BOARD_ID, r.REPLY_ID, r.WRITER_ID, r.CONTENTS, date_format(r.CREATED_DATE, '%Y-%m-%d')
FROM USED_GOODS_BOARD as b
inner join USED_GOODS_REPLY as r
on r.BOARD_ID = b.BOARD_ID
WHERE date_format(b.CREATED_DATE, '%Y-%m') = '2022-10'
ORDER BY r.CREATED_DATE asc, b.title asc