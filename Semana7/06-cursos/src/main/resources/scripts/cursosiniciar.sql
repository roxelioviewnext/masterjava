DROP TABLE IF EXISTS spring_libros;
CREATE DATABASE IF NOT EXISTS spring_libros;
USE spring_libros;

CREATE TABLE `curso` (
  `codigo` int NOT NULL,
  `duracion` int NOT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `precio` double NOT NULL,
  PRIMARY KEY (`codigo`)
);

INSERT INTO `curso` (`codigo`, `duracion`, `nombre`, `precio`) VALUES
(1, 40, 'Introducción a la Programación', 150.00),
(2, 60, 'Desarrollo Web Completo', 300.00),
(3, 45, 'Análisis de Datos con Python', 250.00),
(4, 30, 'Fundamentos de Redes', 200.00),
(5, 50, 'Desarrollo de Aplicaciones Móviles', 350.00),
(6, 20, 'Introducción a la Ciberseguridad', 180.00),
(7, 35, 'Diseño Gráfico', 220.00),
(8, 25, 'Marketing Digital', 210.00),
(9, 55, 'Inteligencia Artificial', 400.00),
(10, 30, 'Machine Learning Básico', 280.00);