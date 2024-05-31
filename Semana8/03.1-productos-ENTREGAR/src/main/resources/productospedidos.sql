DROP DATABASE IF EXISTS productospedidos;
CREATE DATABASE productospedidos;
USE productospedidos;

CREATE TABLE `pedido` (
  `id_pedido` int NOT NULL AUTO_INCREMENT,
  `fecha` date DEFAULT NULL,
  `id_producto` int NOT NULL,
  `unidades` int NOT NULL,
  PRIMARY KEY (`id_pedido`)
);

CREATE TABLE `producto` (
  `id_producto` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) DEFAULT NULL,
  `precio` double NOT NULL,
  `stock` int NOT NULL,
  PRIMARY KEY (`id_producto`)
);

INSERT INTO `productospedidos`.`pedido` (`id_pedido`, `fecha`, `id_producto`, `unidades`) VALUES ('1', '2016-12-21', '1', '20');
INSERT INTO `productospedidos`.`pedido` (`id_pedido`, `fecha`, `id_producto`, `unidades`) VALUES ('2', '2017-12-22', '2', '40');
INSERT INTO `productospedidos`.`pedido` (`id_pedido`, `fecha`, `id_producto`, `unidades`) VALUES ('3', '2018-12-23', '13', '3');
INSERT INTO `productospedidos`.`pedido` (`id_pedido`, `fecha`, `id_producto`, `unidades`) VALUES ('4', '2019-12-24', '18', '10');
INSERT INTO `productospedidos`.`pedido` (`id_pedido`, `fecha`, `id_producto`, `unidades`) VALUES ('5', '2222-12-26', '1', '5');

INSERT INTO `productospedidos`.`producto` (`id_producto`, `nombre`, `precio`, `stock`) VALUES ('1', 'Laptop Dell XPS 13', '999.99', '2000');
INSERT INTO `productospedidos`.`producto` (`id_producto`, `nombre`, `precio`, `stock`) VALUES ('2', 'Mouse Logitech MX Master 3', '99.99', '150');
INSERT INTO `productospedidos`.`producto` (`id_producto`, `nombre`, `precio`, `stock`) VALUES ('3', 'Teclado Mecánico Corsair K95', '199.99', '150');
INSERT INTO `productospedidos`.`producto` (`id_producto`, `nombre`, `precio`, `stock`) VALUES ('4', 'Monitor Samsung 27\"', '279.99', '75');
INSERT INTO `productospedidos`.`producto` (`id_producto`, `nombre`, `precio`, `stock`) VALUES ('5', 'Auriculares Bose QuietComfort 35', '299.99', '60');
INSERT INTO `productospedidos`.`producto` (`id_producto`, `nombre`, `precio`, `stock`) VALUES ('6', 'Disco Duro Externo Seagate 2TB', '79.99', '120');
INSERT INTO `productospedidos`.`producto` (`id_producto`, `nombre`, `precio`, `stock`) VALUES ('7', 'Tarjeta Gráfica NVIDIA RTX 3080', '699.99', '30');
INSERT INTO `productospedidos`.`producto` (`id_producto`, `nombre`, `precio`, `stock`) VALUES ('8', 'Procesador Intel Core i9-11900K', '499.99', '40');
INSERT INTO `productospedidos`.`producto` (`id_producto`, `nombre`, `precio`, `stock`) VALUES ('9', 'Memoria RAM Kingston HyperX 16GB', '89.99', '80');
INSERT INTO `productospedidos`.`producto` (`id_producto`, `nombre`, `precio`, `stock`) VALUES ('10', 'Placa Madre ASUS ROG Strix Z590-E', '329.99', '35');
INSERT INTO `productospedidos`.`producto` (`id_producto`, `nombre`, `precio`, `stock`) VALUES ('11', 'Silla Gaming Secretlab Titan', '399.99', '25');
INSERT INTO `productospedidos`.`producto` (`id_producto`, `nombre`, `precio`, `stock`) VALUES ('12', 'Impresora HP LaserJet Pro', '249.99', '45');
INSERT INTO `productospedidos`.`producto` (`id_producto`, `nombre`, `precio`, `stock`) VALUES ('13', 'Tablet Apple iPad Pro 12.9\"', '1099.99', '20');
INSERT INTO `productospedidos`.`producto` (`id_producto`, `nombre`, `precio`, `stock`) VALUES ('14', 'Smartphone Samsung Galaxy S21', '799.99', '90');
INSERT INTO `productospedidos`.`producto` (`id_producto`, `nombre`, `precio`, `stock`) VALUES ('15', 'Cámara Sony Alpha a7 III', '1999.99', '10');
INSERT INTO `productospedidos`.`producto` (`id_producto`, `nombre`, `precio`, `stock`) VALUES ('16', 'Smartwatch Garmin Fenix 6', '549.99', '55');
INSERT INTO `productospedidos`.`producto` (`id_producto`, `nombre`, `precio`, `stock`) VALUES ('17', 'Altavoz Bluetooth JBL Charge 4', '149.99', '70');
INSERT INTO `productospedidos`.`producto` (`id_producto`, `nombre`, `precio`, `stock`) VALUES ('18', 'Router WiFi Netgear Nighthawk', '229.99', '65');
INSERT INTO `productospedidos`.`producto` (`id_producto`, `nombre`, `precio`, `stock`) VALUES ('19', 'SSD Samsung 970 EVO 1TB', '129.99', '110');
INSERT INTO `productospedidos`.`producto` (`id_producto`, `nombre`, `precio`, `stock`) VALUES ('20', 'Microondas Panasonic NN-SN966S', '179.99', '40');
INSERT INTO `productospedidos`.`producto` (`id_producto`, `nombre`, `precio`, `stock`) VALUES ('21', 'Licuadora NutriBullet Pro', '99.99', '85');
INSERT INTO `productospedidos`.`producto` (`id_producto`, `nombre`, `precio`, `stock`) VALUES ('22', 'Cafetera Nespresso Vertuo', '149.99', '50');
INSERT INTO `productospedidos`.`producto` (`id_producto`, `nombre`, `precio`, `stock`) VALUES ('23', 'Aspiradora Dyson V11', '599.99', '25');
INSERT INTO `productospedidos`.`producto` (`id_producto`, `nombre`, `precio`, `stock`) VALUES ('24', 'Televisor LG OLED 55\"', '1299.99', '15');
INSERT INTO `productospedidos`.`producto` (`id_producto`, `nombre`, `precio`, `stock`) VALUES ('25', 'Consola PlayStation 5', '499.99', '100');

