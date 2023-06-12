CREATE DATABASE bd_hotelalura;

USE bd_hotelalura;

CREATE TABLE Reservas(
	id int not null auto_increment,
    fecha_entrada date not null,
    fecha_salida  date not null,
    valor double,
    forma_pago varchar(50) not null,
	PRIMARY KEY(id)
);


CREATE TABLE Huespedes(
	id int not null auto_increment,
    nombre varchar(75) not null,
    apellido varchar(75) not null,
    fecha_nacimiento date not null,
    nacionalidad varchar(55) not null,
    telefono varchar(10) not null,
    id_reserva int not null, 
    PRIMARY KEY(id),
    FOREIGN KEY(id_reserva) REFERENCES Reservas(id)
);


CREATE TABLE Usuarios(
	id int not null auto_increment,
    nombre varchar(50) not null,
    clave varchar(50) not null,
    PRIMARY KEY(id)
);


INSERT INTO Usuarios(nombre, clave) VALUES("jperez", "1234");
INSERT INTO Usuarios(nombre, clave) VALUES("admin", "1234");


select * from Usuarios;