/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  lobo
 * Created: 24 abr. 2023
 */

DROP DATABASE dbqatar2022;
CREATE DATABASE IF NOT EXISTS dbqatar2022;

USE dbqatar2022;

DROP TABLE IF EXISTS Departamento;
CREATE TABLE Departamento(
	id INT AUTO_INCREMENT,
    nombre VARCHAR(20) NOT NULL,
    presupuesto DECIMAL(12,2),
    PRIMARY KEY(id)
);

DROP TABLE IF EXISTS Empleado;
CREATE TABLE Empleado(
	id INT AUTO_INCREMENT,
    dni INT NOT NULL,
    nombre VARCHAR(10),
    apellido VARCHAR(10),
    nacionalidad char(20),
    departamento INT NOT NULL,
    PRIMARY KEY(id),
    CONSTRAINT fk_dpto 
		FOREIGN KEY (departamento) 
        REFERENCES Departamento(id)
			ON DELETE CASCADE
            ON UPDATE NO ACTION
);


INSERT INTO Departamento (Nombre,Presupuesto)
	VALUES ('Sistemas',20145648.21),('Logistica','15635458.25'),('Compras',21548985.36),('Artes',13254846.23),('ELIMINAR',2);

INSERT INTO Empleado (dni,nombre,apellido,nacionalidad,departamento)
VALUES (69318198,'Javier','Salinas','Argentina','1'),
	   (123456,'Michael','Jackson','Estados Unidos','4'),
       (654321,'Paul','McCartney','Inglaterra','4'),
       (852456,'Ringo','Bonavena','Argentina',3),
       (789456,'Junior','Dos Santos','Brasil','2'),
       (456789,'Jose','Aldo','Brasil','2'),
       (159753,'Petr','Yan','Rusia','2'),
       (753159,'Brandon','Moreno','Mexico','2'),
       (498123,'Dana','White','Francia',1);


SELECT * FROM Departamento;
SELECT * FROM Empleado;