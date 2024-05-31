DROP DATABASE IF EXISTS cursos;
CREATE DATABASE cursos;
USE cursos;

CREATE TABLE `curso` (
  `codigo` int NOT NULL,
  `duracion` int NOT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `precio` double NOT NULL,
  PRIMARY KEY (`codigo`)
);

INSERT INTO `cursos`.`curso` (`codigo`, `duracion`, `nombre`, `precio`) VALUES ('1', '20', 'Java', '100');
INSERT INTO `cursos`.`curso` (`codigo`, `duracion`, `nombre`, `precio`) VALUES ('2', '2', 'Python', '80');
INSERT INTO `cursos`.`curso` (`codigo`, `duracion`, `nombre`, `precio`) VALUES ('3', '2', 'Cobol', '30');
INSERT INTO `cursos`.`curso` (`codigo`, `duracion`, `nombre`, `precio`) VALUES ('4', '150', 'JavaScript', '35');
INSERT INTO `cursos`.`curso` (`codigo`, `duracion`, `nombre`, `precio`) VALUES ('5', '150', 'JavaScript Avanzado', '35');
INSERT INTO `cursos`.`curso` (`codigo`, `duracion`, `nombre`, `precio`) VALUES ('102', '70', 'Base de datos', '250');
INSERT INTO `cursos`.`curso` (`codigo`, `duracion`, `nombre`, `precio`) VALUES ('152', '70', 'Base de datos 2', '250');


