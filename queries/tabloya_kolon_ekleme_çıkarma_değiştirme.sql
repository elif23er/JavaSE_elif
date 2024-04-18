-- Tabloya yeni kolon ekleme, mevcut kolonu değiştirme veya silme ;
-- Ekleme
ALTER TABLE cars
ADD color VARCHAR(255);

SELECT * FROM cars;
-- Silme
ALTER TABLE cars 
DROP color;

-- Adını Değiştirme
ALTER TABLE cars
RENAME COLUMN color TO colorrrr;

-- Veri boyutunu/türünü  değiştirme 
ALTER TABLE cars 
ALTER COLUMN color TYPE VARCHAR(150);