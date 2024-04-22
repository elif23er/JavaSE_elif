-- SELECT STATEMENT
SELECT customer_name, country FROM customers;
-- customer_nameve country sütünlarını ve bilgilerini 'customers' tablosuna getirir

SELECT * FROM customers ;
--'*' ALL anlamına gelir.bu durumda da customers tablosuna ait bütün sütünları verileriyle birlikte getirir

---------------------------------------
--DISTINCTSTATMENT
SELECT DISTINCT country
FROM customers;
-- yanlızca farklı (dıstınct) değerleri döndürmek için kullanılır. yinelenme olmadan özgün veri getiri
--customers tablosunda tekrar eden ülkeler vardı ancak yukarıdaki sorgu aracılığıyla ülkeler özgün şekilde getirir.

SELECT COUNT (DISTINCT country)
FROM customers;
-- kaç adet dıstıct ülke olduğunu döndürür.

-------------------------------------------


--WHERE CLAUSE(filtrelemek için)
SELECT * FROM customers WHERE city = 'London';
--sadece belli bir koşulu karşılayan verileri getirir.
--yukarıdaki örnekte bu koşul şehrin adının 'london' olması koşuludur.

--------------------------------------------

--ORDER BY (sıralamak için)
SELECT * FROM customers 
ORDER BY city;
--kayıtları belli bir stuna sıralamak için kullanılır
--hem artan hem azalan sıralama yapılır (ASC/DESC)

SELECT * FROM customers
ORDER BY city ASC;
--ASC -> artan sıralama (doğal sıralama ). kayıtları ilgili sütunun aratacağı şkilde sıralar

SELECT * FROM customers
ORDER BY city DESC ;
--DESC (descenting)-> azalan sıralama (reverse olur) kayıtlarla ilgili sütüunun azalacağı şekilde sıralar 

----------------------------------------
--LİMİT CLAUSE 
SELECT * FROM  customers 
LIMIT 20 ;
-- LIMIT döndürülecek max kayıt sayısını sınırlandırır
-- yukarıdaki örnekte customers tablosunun ilk 20 kaydı döndürürlür.
----------------------------------------

--OFSET CLAUSE
SELECT * FROM  customers 
LIMIT 20 OFFSET 40;
--OFFSET  döndürülecek kayıtların seçmeye nerden başlayacağımızı belirtmek için kullanılır 
-- yukarıdaki örnekte 20 kayıt döndürmek istiyoruz. OFFSET 40 diyerek bu 20 kaydı 
--40. kayıttan sonra gelen ilk 20 kayıttan alıyoruz ( OFFSET 40  yazdığım için ilk kayıt 41. kayıt olacaktır)

----------------------------------------

--MIN() AND MAX() Functions
SELECT MIN (city)
FROM customers ;

SELECT DISTINCT city FROM customers 
ORDER BY city ;
-- NIN()  fonk. min. değeri döndürür . bu bir sayı ise en küçük sayıyı 
-- bu bir kelime ise alfabetik olarak en önde gelen kelimeyi döndürür 

SELECT MAX(city)
FROM customers ;
-- MAX()  fonk. max. değeri döndürür . bu bir sayı ise en BÜYÜK sayıyı 
-- bu bir kelime ise alfabetik olarak en SONDA gelen kelimeyi döndürür 
-----------------------------------------

-- SUTUNUNU  yeniden adlandırma 
SELECT MAX(city) As alphabetically_last_city
FROM customers ;
-- bulduğu değerleri farklı bir sutun isminde görüntülemek için AS anahtar kelimesi kullanılır

-- COUNT() function
SELECT  COUNT (customer_id)
FROM customers;
-- COUNT() fonk. belirtilen ölçütle eşleşen satır sayısını döndürür 
--NOT ; NULL değerler sayılmaz 

SELECT COUNT (customer_id)
FROM customers 
WHERE  city ='London';
--şehri 'london'olanların adedini getirdi.


------------------------------------------- 
--SUM unction
SELECT SUM (customer_id)
FROM customers ;
-- kayıtların belirtilen sütüna ait olan değerini toplar ve süuna döner 

-- AVG() function 
SELECT AVG (customer_id)
FROM customers;
-- kayıtların belirtilen sütuna ait olan değerleri ortalamasını döner.

------------------------------------------
--IN operatörü 
SELECT * FROM customers 
WHERE country IN ('Germany','France','UK');
-- IN  operatörü WHERE clause undaki olası değerlerin bir listesini belirtmemize olanak tanır
-- IN operatörü birden fazla OR koşulunun kısalmasıdır 
--yukarıdaki örnekteki durumu; 'Germany','France',yada 'UK' de olan tüm müşterileri getirir
				  
SELECT * FROM customers 
WHERE country NOT IN ('Germany','France','UK');
--In operatörün önünde NOT keyword ü kullanarak 
--listedeki değerlerden herhangi biri DEĞİL (not) olan tüm kayıtları döndürür
-- yukarıdaki örnekteki durum; 'germany','france','UK'olman müşterileri getirir
				  
-----------------------------------------------

SELECT * FROM customers 
WHERE customer_id IN(SELECT customer_id FROM orders );
-- daha önce sipariş vermiş olan kullanıcıları getirir
--önce ordes tblosuna giderve her  bir sipariş için customer_id leri tolar ve bir liste haline getirir
--ondan sonra bu listedeki id leri customer tablosundaki idler ile eşleştirir
--eşleşem-n sonuçları birer customer olarak yazdırır.

WHERE customer_id IN(SELECT customer_id FROM orders );
--daha önce sipariş vermemiş olan kullanıcıları getirir 

---------------------------------------------
-- BETWEN operatörü 
SELECT *  FROM customers
WHERE customer_id BETWEEN 10 AND 15;
--BETWEEN  operatörü belirli bir aralıktaki değerleri seçer değerler sayı metin yada tarih olabilir
--BETWEEN operatörü kapsayıcıdır. başlangıç ve bitiş değerleri dahildir.
--metin karşılaştırmalarında son değeri dahil etmez 

SELECT *  FROM customers
WHERE country BETWEEN 'Austria' AND 'UK';
-- country si  Austria ile UK arasında kalan bütün ülkeleri döndürür 

------------------------------------------------------------
	
-- ORDER BY CLAUSE 
SELECT *  FROM customers
WHERE country BETWEEN 'Austria' AND 'UK'
ORDER BY country; 
--country si  'austria'ile 'uk ' arasında olan bütün kullanıcıları, ülkeleri baz alarak sıralamaya sokarve döndürür 
-------------------------------------------------------------
--Aliases(takma isim)
SELECT customer_id AS id 
FROM customers;
--SQL aliases bir tabloya veya tablodaki bir sütuna geçici bir ad vermek için kullanılır.
--genelikle sütun adlarını daha okunaklı hale getirmek için kullanılır 
-- bir alıases yanlızca söz konusu sorgu süresince geçerlidir
--AS anahtar sözcüğü ile oluşturulur


				  
				  
				  
































