# Write your MySQL query statement below
SELECT P.product_name ,S.year, S.price FROM SALES S JOIN PRODUCT P ON S.PRODUCT_ID = P.PRODUCT_ID;