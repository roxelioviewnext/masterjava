CREATE TABLE `noticias` (`titulo` VARCHAR(255) NOT NULL,`autor` VARCHAR(255) NOT NULL, `fecha` DATE NOT NULL ,`comentario` INT , PRIMARY KEY (`titulo`));
CREATE TABLE `comentarios` (`id` INT NOT NULL,`texto` VARCHAR(255) NOT NULL, `autor` VARCHAR(255) NOT NULL, PRIMARY KEY (`id`));
ALTER TABLE `noticias` ADD CONSTRAINT `noticias_fk0` FOREIGN KEY (`comentario`) REFERENCES `comentarios`(`id`);