DROP DATABASE IF EXISTS agencia_viajes;
CREATE DATABASE agencia_viajes;
USE agencia_viajes;

CREATE TABLE `hotel` (
  `id_hotel` int NOT NULL AUTO_INCREMENT,
  `categoria` varchar(255) DEFAULT NULL,
  `disponible` bit(1) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `precio` double DEFAULT NULL,
  PRIMARY KEY (`id_hotel`)
); 

CREATE TABLE `vuelo` (
  `id_vuelo` int NOT NULL AUTO_INCREMENT,
  `companhia` varchar(255) DEFAULT NULL,
  `fecha_vuelo` date DEFAULT NULL,
  `plazas_disponibles` int DEFAULT NULL,
  `precio` double DEFAULT NULL,
  PRIMARY KEY (`id_vuelo`)
);

CREATE TABLE `reserva` (
  `id_reserva` int NOT NULL AUTO_INCREMENT,
  `dni` varchar(255) DEFAULT NULL,
  `id_hotel` int DEFAULT NULL,
  `id_vuelo` int DEFAULT NULL,
  `nombre_cliente` varchar(255) DEFAULT NULL,
  `tot_personas` int DEFAULT NULL,
  PRIMARY KEY (`id_reserva`)
); 


INSERT INTO `hotel` (`categoria`, `disponible`, `nombre`, `precio`) VALUES
('5 estrellas', b'1', 'Hotel Ritz', 300.00),
('4 estrellas', b'1', 'Hotel Melia', 200.00),
('3 estrellas', b'1', 'Hotel Ibis', 100.00),
('5 estrellas', b'0', 'Hotel Palace', 350.00),
('4 estrellas', b'1', 'Hotel NH', 180.00),
('3 estrellas', b'0', 'Hotel Campanile', 90.00),
('5 estrellas', b'1', 'Hotel Hilton', 400.00),
('4 estrellas', b'1', 'Hotel Radisson', 220.00),
('3 estrellas', b'1', 'Hotel Holiday Inn', 120.00),
('5 estrellas', b'0', 'Hotel W', 450.00);

INSERT INTO `reserva` (dni, id_hotel, id_vuelo, nombre_cliente, tot_personas)
VALUES 
('12345678A', 1, 7, 'Juan Pérez', 2),
('87654321B', 2, 6, 'María García', 4),
('11223344C', 3, 4, 'Carlos Sánchez', 1),
('44332211D', 5, 2, 'Ana López', 3),
('99887766E', 8, 9, 'Luis Fernández', 2);


INSERT INTO `vuelo` (`companhia`, `fecha_vuelo`, `plazas_disponibles`, `precio`) VALUES
('Iberia', '2024-07-15', 50, 150.75),
('Air France', '2024-07-20', 30, 200.00),
('British Airways', '2024-08-01', 25, 175.50),
('Lufthansa', '2024-08-15', 10, 250.00),
('Ryanair', '2024-09-05', 100, 50.00),
('American Airlines', '2024-09-15', 60, 300.00),
('Delta Airlines', '2024-10-10', 20, 400.00),
('Emirates', '2024-11-01', 5, 800.00),
('Qatar Airways', '2024-11-20', 15, 750.00),
('LATAM Airlines', '2024-12-01', 40, 500.00);
