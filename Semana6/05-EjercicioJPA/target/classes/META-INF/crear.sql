CREATE TABLE departamento(id_dept int primary key, nombre VARCHAR(20), localidad VARCHAR(20));

CREATE TABLE empleado(id_emp int primary key, nombre VARCHAR(20), fecha DATE, sueldo decimal, id_dept INT, FOREIGN KEY (id_dept) REFERENCES departamento(id_dept));