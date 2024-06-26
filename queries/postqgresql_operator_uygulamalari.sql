
INSERT INTO cars(brand,model,year)
VALUES
('Ferrari','Enzo',2002),
('Nissan','R34',1999),
('Nissan', 'Silvia',2002),
('Cobra','Shel',1962),
('Aston Martin','DB',2013),
('Ford','Ranger',2000);


SELECT * FROM cars;

SELECT *FROM cars 
WHERE brand = 'Nissan'; -- markası Nissan olanları getir .

SELECT *FROM cars 
WHERE year <1999; -- modeli 1975 ten küçük olanları getir

SELECT *FROM cars 
WHERE year >1999; -- modeli 1975 ten küçük olanları getir

SELECT *FROM cars 
WHERE year <=1999; -- modeli 1975 ten küçük veya eşit olanları getir

SELECT *FROM cars 
WHERE year >=1999; -- modeli 1975 ten küçük veya eşit olanları getir

SELECT* FROM cars 
where brand <> 'Cobra'; -- markası 'Cobra' olmayanları getir

SELECT* FROM cars 
where brand! = 'Cobra'; -- markası 'Cobra' olmayanları getir. yukarıdakiyle aynı işi yapar.

SELECT * FROM cars 
WHERE model LIKE 'R%';-- % işareti sıfır,bir birden fazla karakteri temsil edenbir wildcard'dır
                      -- modeli R ile başlayanları getirir
					  
SELECT * FROM cars 
WHERE model LIKE '%r;--modeli 'r' ile başlayanları getirir

SELECT * FROM cars 
WHERE model LIKE '%r%; -- modeli 'r' ile bitenleri getirir

SELECT * FROM  cars
WHERE brand LIKE '%ra%'; -- markasının içinde 'ra' geçenleri getirir 

--_ wildcard tek bir karakteri temsil eder.herhangi bir karakter veya sayı olabilir
SELECT * FROM cars 
WHERE brand LIKE 'F__ra__';--markası F ile başlayan ardından iki adet wildcard karakter alan (--)
--ardından da 'ra' ve ardından yine bir wildcard karakter alan markayı döndürür.

-- birden fazla koşulu kontrol etmek istediğimizde AND operatörü kullanılır

SELECT * FROM cars 
WHERE brand ='Nissan'
AND model= 'Silvia';-- markası Nissan ve modeli Silvia olan tüm kayıtları döndürür

-- birden fazla koşuldan herhangi birisinin doğruluğunu kontrol etmek için OR operatörü kullanılır
SELECT * FROM cars 
WHERE brand ='Nissan'
OR model= 'Enzo';-- markası Nissan ve modeli enzo olan tüm kayıtları döndürür

--IN operatörü bir sutunu diğeri listesindeki değerlerden herhangi 
--biriyle /birileriyle eşleştiğinde kullanılır.bir liste verileceği zaman 
SELECT * FROM  cars
WHERE brand IN ('Nissan',('Aston Martin'),'Ford');-- markası{Nissan,Aston Martin,Ford} olanları getir

SELECT * FROM cars
WHERE year BETWEEN 1950 AND 2000;--yılı 1950 ile 2000 arasında olan bütün kayıtları getirir

SELECT * FROM cars
WHERE model IS NULL ; --Model NULL olan tüm kayıtları döndürür.

--NOT  operatörü ,operatörün doğruluğunu tersine çvirmek için LIKE ,ILIKE,IN,BETWEEN,NULL operatörleri
--birlikte kullanılabilir
SELECT* FROM cars
WHERE brand NOT LIKE-- F ile başlamayan kayıtları döndürür.-> LIKE case sensitive (büyük küçük harf duyarlı )
'F%';

SELECT* FROM cars
WHERE brand NOT LIKE-- F ya da f başlamayan kayıtları döndürür.-> LIKE case sensitive (büyük küçük harf duyarsız )
'f%';

SELECT * FROM cars
WHERE brand NOT IN ('Cobra','ford','ferrari');-- markanın bu listede olmadığı bütün kayıtları döndürür

SELECT * FROM cars
WHERE year NOT BETWEEN 1950 AND 2000;--yılı 1950 ile 2000 arasında olmayan bütün kayıtları getirir

SELECT * FROM cars 
WHERE model IS NOT NULL ;--- model NULL olmayan tüm kayıtları döndürür






				 