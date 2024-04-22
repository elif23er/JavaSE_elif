-- JOIN
SELECT product_id, product_name,category_name
FROM products AS p 
INNER JOIN categories AS c 
ON  p.category_id = c.category_id;
-- products daki category_id ile categories category_id arasında eşleşen veriler için ;
-- producttan product_id ve product_name,categories den category_name sütununu birleştirir ve kayıtları döner 

SELECT * FROM products;

SELECT product_id, product_name,category_name
FROM products AS tp 
INNER JOIN categories AS c 
ON  tp.category_id = c.category_id;

