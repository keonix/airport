INSERT INTO Airport (name, city)
VALUES('Borispol', 'Kiev'),
('pervaja stolica', 'Kharkiv'),
('Burn', 'Donetsk'),
('KrimNash','Simferopol'),
('Privoz','Odessa'),
('Natasha','Antalia'),
('Piramida','Hurgada')
;


INSERT INTO PASSENGER ( NAME,SURNAME,PHONE) 
VALUES('Ilia', 'Lad','063-078-38-75'),
('Olya','Che','050-069-09-59')
;

     INSERT INTO FLIGHTTYPE (Class,ClassContango)
     VALUES('First ', 300),
('Second', 200),
('Third', 0);



 
INSERT INTO RACE(fromCity,toCity,time,price,TypeOfLuxury, FlightTypeID)

VALUES ('Kiev','Donetsk','02.11.2014 - 14:20',700,'Budget',3),
       ('Kiev','Simferopol','02.11.2014 - 14:20',900,'Budget',3),
       ('Kiev','Kharkov','02.11.2014 - 14:20',600,'Half-Lux',2),
       ('Kiev','Odessa','02.11.2014 - 14:20',800,'Half-Lux',2),
        ('Kiev','Antalia','02.11.2014 - 14:20',1100,'Lux',1),
        ('Kiev','Hurgada','02.11.2014 - 14:20',1200,'Lux',1 );
        
       