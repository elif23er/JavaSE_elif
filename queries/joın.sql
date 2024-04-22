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


SELECT * FROM testproduct
SELECT * FROM products;

-- INNER JOIN : her iki tablolada da eşleşen değerlere sahip kayıtları döndürür .
--LEFT JOIN : Soldaki tablodaki tüm kayıtları sağdaki eşleşen kayıtları döndürür.
--RIGHT JOIN : Sağdaki tablodaki tüm kayıtları soldaki eşleşen kayıtları döndürür.
-- FULL JOIN : Sağ ve sol tabloda eşleşen old. tüm kayıtları döndürür .

--INNER JOIN 
SELECT testproduct_id, product_name,category_name
FROM products AS tp 
INNER JOIN categories AS c 
ON  tp.category_id = c.category_id;
-- HER iki tablodada eşleşen değerlere sahip kayıtları seçer
-- Joın ve INNER JOIN  aynı sonucu verecektir INNER JOIN  için varsayılan (default) birleştirme türüdür

--LEFT JOIN 
SELECT testproduct_id , product_name,category_name
FROM testproducts AS tp 
LEFT JOIN categories AS c 
ON  tp.category_id = c.category_id;
--LEFT JOIN  kullanarak categories tablosuyla eşleşmeyenlerde de dahil olm. üzere (category_id) testproducts dan
--tüm kayıtları aldık 
--LEFT OUATER JOIN ve LEFT JOIN  aynı sonucu verecektir. OUATER,LEFT JOIN için varsayılan birleştirme türüdür

-- RİGHT JOIN
SELECT testproduct_id , product_name,category_name
FROM testproducts AS tp 
RIGHT JOIN categories AS c 
ON  tp.category_id = c.category_id;

--RIGHT JOIN SAĞ (right) tablodan ve sol tablodan (left) eşleşen kayıtları seçer.
--RIGHT OUTER JOIN VERIGHT JOIN  aynı sonucu verecektir,OUTER,RIGHT JOIN  için e varsayılan birleştirme türüdür

--FULL JOIN 
SELECT testproduct_id , product_name,category_name
FROM testproducts
CROSS JOIN categories;
FROM testproducts AS tp 
FULL JOIN categories AS c 
ON  tp.category_id = c.category_id;
-- FULL JOIN eşleşen olmasa bile her iki tablodaki kayıtları seçer. Eşleşen satırlar için 
-- her iki tablodaki değerlerde mevcuttur.eşleşme yoksa boş olanlar NULL değerini alır.

--CROSS JOIN 
---CROSS JOIN  keywordü 'sol'tablodaki tüm kayıtları 'sağ' tablodaki her kayıtla eşleştirir.
SELECT testproduct_id , product_name,category_name
FROM testproducts
CROSS JOIN categories;

--UNION
--UNION  operatörü iki veya daha fala sorgunun (query) sonuç kümesini birleştirmek için kullanılır.
-- birleşimdeki sorgular şu kurallara uymalıdır; 
--1- aynı sayıda sütuna sahip olmaları gerekir 
--2- sütunlar aynı veri türlerine dahil olmalıdır
--3- sütunlar aynı sırada olmalıdır

SELECT product_id , product_name , category_id
FROM products
UNION
SELECT testproduct_id , product_name , category_id
FROM testproducts
ORDER BY product_id;


-- UNION ile yapınca özgün veri gelir
SELECT product_id
FROM products
UNION
SELECT testproduct_id 
FROM testproducts
ORDER BY product_id;


--UNION ALL ile yapınca tekrar eden veriler de gelir
SELECT product_id 
FROM products
UNION ALL
SELECT testproduct_id 
FROM testproducts
ORDER BY product_id;

--GROUP BY CLAUSE 
--GROUP BY  genellikle sonuç kümesini bir veya daha fazla sütuna göre gruplandırmak için 
--COUNT(),MAX(),MİN(),SUM(),AVG()gibi bir araya toplama(aggregate)işlevleriyle birlikte kullanılır

SELECT COUNT (customer_id),country
FROM customers
GROUP BY country ;

--GROUP BY WİTH JOIN 
SELECT c.contact_name, COUNT (o.order_id)
FROM orders o 
LEFT JOIN customers c ON o.customer_id = c.customer_id
GROUP BY c.contact_name;
-- order tablosunda her bir ordera ait bir customer_id bulunmakta
--customer tablosunda da yine her customer ın bir customer_id sı bululnmakta
--order tablosunda her bir order için customer id ybakıyor ve COUNTA'A  ekliyor
--sorasında customer tablosunda ilgili customer_id ye denk gelen contact_name ile
--grupluyor ve order adedini yazdırıyor

--HAVING CLAUSE 
--HAVING CLAUSE SQL e eklendi çünkü WHERE clause toplama (aggragate)işlevleriyle kullanılmıyor
--Aggregate işlemleri genellikle GROUP BY clausları ile kullanılır
--HAVING ekleyerek WHERE da yaptığımız gibi koşullar yazabilir
SELECT COUNT (customer_id), country
FROM customers
GROUP BY country
HAVING COUNT(customer_id)>5;

SELECT order_id SUM (products.price) -- order_details isimli ortak bir tablodan çekmek gerekir
FROM orders 
LEFT JOIN products ON orders.product_id = products.product_id
GROUP BY order_id
HAVING SUM (products.price)>23.25;

--EXISTS
--EXISTS OPERATÖRÜ bir alt sorguda herhangi bir kaydın varlığıını test etmek için kullanılır
--ALT sorgu veya birden fazla kayıt döndürürse EXISTS OPERATÖRÜ TRUE DEĞERİNİ DÖNDÜRÜR
SELECT customers.customer_name
WHERE EXISTS (
SELECT  order_id
	FROM orders 
	WHERE customer_id =customers.customer_id
);

-- NOT EXISTS 
--EXISTS operatörünü tam ters işlevde çalıştırır.
--Alt sorguda verilen koşulları kayıtlar hariç bütün kayıtları döndürür
SELECT customers.customer_name
FROM customers
WHERE EXISTS (
SELECT  order_id
	FROM orders 
	WHERE customer_id =customers.customer_id
);

CREATE TABLE IF NOT EXISTS employee(
employee_id INT PRIMARY KEY,
	first_name VARCHAR(50),
	last_name VARCHAR(50),
	deparment VARCHAR (50),
	hire_date DATE 
);

-- ANY Operatörü 
--ANY Operatörü tek bir sütun  değeri ile diğer değerler aralığı arasında karşılaştırma yapmamızı sağlar 
--sonuç olarak bir boolean değeri döndürür
--alt sorgu değerinden herhangi biri koşulu sağlıyorsa true değerini döndürür
--HERHANGİ(ANY) işlemin aralıktaki değerlerinden herhangi biri için true olması durumunda 
--koşulun doğru olacağı anlamına gelir.
SELECT product_name 
FROM products
WHERE product_id =ANY (
SELECT product_id
	FROM orders 
	WHERE quantity >100;	
);

/*SUPDATE public.orders 
SET quantity = 555
WHERE  order_id =8;*/









