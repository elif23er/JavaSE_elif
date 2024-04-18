--Çoklu veri güncelleme -> birden fazla sütunu aynı anda günecelleme 
UPDATE cars 
SET color = 'white', year = 2000
WHERE brand = 'Nissan' OR brand ='Ford';

SELECT *FROM cars;