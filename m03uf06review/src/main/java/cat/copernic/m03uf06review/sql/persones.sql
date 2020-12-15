DROP DATABASE IF EXISTS persones;
CREATE DATABASE persones;


USE persones;

/*TAULA PERSONA*/

CREATE TABLE persona(

    persona_id INT AUTO_INCREMENT,
    persona_nom CHAR(120),
    persona_direccio VARCHAR(200),
    persona_altura DOUBLE,
    persona_viva BOOLEAN,
    persona_naixement DATE,
    PRIMARY KEY(persona_id)

);


/*INSERTS*/
INSERT INTO persona (persona_nom, persona_direccio, persona_altura, persona_viva, persona_naixement) 
              VALUES('Arnau','Carrer Sant Jordi, 3, Rub�', 190.0, true, '1999-04-20');
INSERT INTO persona (persona_nom, persona_direccio, persona_altura, persona_viva, persona_naixement) 
              VALUES('Sara','Carrer Major, 5, Sant Qugat', 180.5, true, '1999-01-09');
INSERT INTO persona (persona_nom, persona_direccio, persona_altura, persona_viva, persona_naixement) 
              VALUES('Salma','Passatge Santa Fe, 2, Sabadell', 173.0, true, '1998-12-03');
INSERT INTO persona (persona_nom, persona_direccio, persona_altura, persona_viva, persona_naixement) 
              VALUES('Noelia','Carrer Magallanes, 15, Barcelona', 179.0, true, '2002-11-15');
INSERT INTO persona (persona_nom, persona_direccio, persona_altura, persona_viva, persona_naixement) 
              VALUES('Manel','Avinguda del estatut, 35, Rub�', 185.0, true, '1999-07-10');
INSERT INTO persona (persona_nom, persona_direccio, persona_altura, persona_viva, persona_naixement) 
              VALUES('Brian','Carrer Santa Maria, 4, Tarragona', 167.0, false, '1995-09-22');



