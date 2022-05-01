/* oppgave 1 */

/* data.sql */

INSERT INTO Vare (Varenavn, Pris, Antall)
VALUES ('Rosinbolle', 30, 100);

/* MERK: Passord-kolonnen er ikke noe krav i løsningen */
INSERT INTO Kunde (Navn, Mobil, Epost, Passord)
VALUES ('Ole', '99999999', 'ole99@gmail.no', 'qwerty1234');

INSERT INTO Bestilling (KID, Bord, Mottatt, Varer)
VALUES (1, 42, PARSEDATETIME('23-05-2022 15:00:00', 'dd-MM-yyyy hh:mm:ss'), '1');