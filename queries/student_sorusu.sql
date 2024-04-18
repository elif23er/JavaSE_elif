CREATE TABLE students (
    name  VARCHAR(255),
	surname VARCHAR (255),
    grade INT
);




INSERT INTO students (name,surname,grade)
VALUES
('Büşra','Özdemir',70),
('Muhammed Bedir','Küçükhazar',80),
('Elif','ER',100),
('Meryem','Alanoğlu','60')

UPDATE students
SET surname ='ER' 
WHERE name ='Elif';

ALTER TABLE students
ADD birth_year VARCHAR (4);

UPDATE students
SET birth_year = 1996

UPDATE students
SET name = 'Abuzer', surname ='Komurcu', birth_year 1996
WHERE name 'Büşra';

DELETE FROM students
WHERE name ='Muhammed Bedir'

SELECT * FROM students;

				 