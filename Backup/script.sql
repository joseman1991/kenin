

DROP DATABASE if exists citas;
CREATE DATABASE citas;
USE citas;

DROP TABLE IF EXISTS tbusuarios;
CREATE TABLE tbusuarios(
iduser INT NOT NULL,
nuser VARCHAR(20) NOT NULL,
pass CHAR(50) NOT NULL,
estdo INT DEFAULT 0,
facturacion INT DEFAULT 0,
servicios INT DEFAULT 0,
doctores INT DEFAULT 0,
areas    INT DEFAULT 0,
pacientes INT DEFAULT 0,
seguridad INT DEFAULT 0,
freg CHAR(10) DEFAULT 0,
CONSTRAINT pkusr PRIMARY KEY (iduser)
)ENGINE=INNODB DEFAULT CHARSET=utf8;

CREATE VIEW mostrar_usuarios
AS
SELECT estdo,nuser
FROM tbusuarios;






-- -------------------------------//////////////////////////////////////////////////////////--------------------------------------------------

CREATE TABLE tbpacientes(
ced CHAR(10) NOT NULL,
nom VARCHAR(50) NOT NULL,
edad INT NOT NULL,
sexo CHAR(1)NOT NULL,
telf CHAR(10) NOT NULL,
freg CHAR(10) NOT NULL,
email char(50) not null default 'no correo',
iduser INT NOT NULL,
CONSTRAINT PK_CED PRIMARY KEY (ced)
)ENGINE=INNODB DEFAULT CHARSET=utf8;

CREATE VIEW vw_MostrarPacientes
AS
SELECT * FROM tbpacientes;

 

CREATE TABLE tbespecialidades(
idesp INT NOT NULL,
nesp VARCHAR (100) NOT NULL,
CONSTRAINT PK_IDESP PRIMARY KEY (idesp)
)ENGINE=INNODB DEFAULT CHARSET=utf8;

CREATE VIEW vw_MostrarEspecialidades
AS
SELECT * FROM tbespecialidades;


CREATE TABLE tbdoctores(
ci CHAR(10) NOT NULL,
apellidos VARCHAR(30) NOT NULL,
nombres VARCHAR(30) NOT NULL,
telef CHAR(10) ,
cel CHAR(10) NOT NULL,
idesp INT NOT NULL,
nclgdo INT NOT NULL,
freg CHAR(10) NOT NULL,
iduser INT NOT NULL,
CONSTRAINT PK_CEDD PRIMARY KEY (ci)
)ENGINE=INNODB DEFAULT CHARSET=utf8;

/* CREATE VIEW vw_MostrarDoctores
AS
SELECT ci,apellidos,nombres,tbespecialidades.`nesp`,nclgdo 
FROM tbdoctores 
INNER JOIN tbespecialidades ON tbdoctores.idesp=tbespecialidades.`idesp`;*/

CREATE VIEW vw_MostrarDoctores
AS
SELECT tbdoctores.`ci`,tbdoctores.`apellidos`,tbdoctores.`nombres`,
tbespecialidades.`nesp`,tbdoctores.`nclgdo`
FROM tbdoctores
INNER JOIN tbespecialidades ON tbdoctores.`idesp`=tbespecialidades.`idesp`;

ALTER TABLE tbdoctores
ADD CONSTRAINT FK_IDESPECILIDAD_DOCTOR
FOREIGN KEY (idesp)
REFERENCES tbespecialidades(idesp)ON DELETE CASCADE ON UPDATE CASCADE;

ALTER TABLE tbdoctores
ADD CONSTRAINT FK_IDUSER_TBUSUARIOS
FOREIGN KEY (iduser)
REFERENCES tbusuarios(iduser)ON DELETE CASCADE ON UPDATE CASCADE;

create table tbafilia_labor(
idtbf int auto_increment primary key,
idesp INT NOT NULL,
cedd CHAR(10)
);




CREATE TABLE tbfacturacion(
idfact CHAR (20) NOT NULL,
ced CHAR(10) NOT NULL,
idesp INT NOT NULL,
idserv INT NOT NULL,
detallefact VARCHAR(100) NOT NULL,
punit DOUBLE (7,2)NOT NULL,
subtot DOUBLE (7,2)NOT NULL,
dscto DOUBLE (7,2)NOT NULL,
iva DOUBLE (7,2)NOT NULL,
neto DOUBLE (7,2)NOT NULL,
tpago CHAR(10) NOT NULL,
fechaa CHAR(10) NOT NULL,
iduser INT NOT NULL,
CONSTRAINT PK_IDFACT PRIMARY KEY (idfact)
)ENGINE=INNODB DEFAULT CHARSET=utf8;


alter table tbfacturacion add tipodoc char(20);
alter table tbfacturacion add  medida char(20); 
alter table tbfacturacion add  marca char(20);
alter table tbfacturacion add dosis char(100);
alter table tbfacturacion add frecuencia char(100);
alter table tbfacturacion add duracion char(100);
alter table tbfacturacion add va char(20);
alter table tbfacturacion add  tipomed char(20);
alter table tbfacturacion add observacion char(200);


SELECT * FROM tbfacturacion;

SELECT MAX(idfact) AS idfact FROM tbfacturacion;


CREATE TABLE tbhimedico(
idh varchar(10) not null primary key,
ced CHAR(10) NOT NULL,
detallepadece CHAR(250) ,
idserv INT ,
nmedicatrata CHAR(250) ,
dosis CHAR(50),
frecuencia CHAR(50) ,
duracion CHAR(50) , 
vadministra VARCHAR(50),           
tipmedica VARCHAR (30),    
medi_medi VARCHAR(20),     
tfabri VARCHAR(20),
freg CHAR(10), 
idesp int,       
iduser INT NOT NULL
)ENGINE=INNODB DEFAULT CHARSET=utf8;



ALTER TABLE tbhimedico
ADD CONSTRAINT FK_IDPACIENTE_HISTORIAL
FOREIGN KEY (ced)
REFERENCES tbpacientes (ced)ON DELETE CASCADE ON UPDATE CASCADE;

SELECT tbhimedico.`ced`,tbpacientes.`nom`,tbhimedico.`nmedicatrata`,tbhimedico.`dosis`,tbhimedico.`vadministra`,
tbhimedico.`frecuencia`,tbhimedico.`duracion`,tbhimedico.`tipmedica`,
tbhimedico.`medi_medi`,tbhimedico.`tfabri`,tbhimedico.`detallepadece`
FROM tbhimedico
INNER JOIN tbpacientes ON tbhimedico.`ced`=tbpacientes.`ced` WHERE tbpacientes.`ced`='1203482361';
 

 
CREATE TABLE tbservicios(
idserv INT NOT NULL,
nserv VARCHAR(200) NOT NULL,
pserv DOUBLE (7,2) NOT NULL,
giva CHAR(2) NOT NULL,
idesp INT NOT NULL, 
fregis CHAR(10) NOT NULL,
CONSTRAINT PK_IDSERV PRIMARY KEY (idserv)
)ENGINE=INNODB DEFAULT CHARSET=utf8;


CREATE VIEW vw_MostrarTPServicios
AS
SELECT tbservicios.`idserv`,tbservicios.`nserv`,tbservicios.`pserv`,tbservicios.`giva`,tbespecialidades.`nesp`,tbservicios.`idesp`
FROM tbservicios
INNER JOIN tbespecialidades ON tbservicios.`idesp`=tbespecialidades.`idesp`;

SELECT * FROM tbservicios;

insert  into `tbusuarios`(`iduser`,`nuser`,`pass`,`estdo`,`facturacion`,`servicios`,`doctores`,`areas`,`pacientes`,`seguridad`,`freg`) values (1,'kmejia','81dc9bdb52d04dc20036dbd8313ed055',1,1,1,1,1,1,1,'23/01/2018'),(2,'obernal','0c12278389532e91c601af4c8adef7fc',1,1,1,1,1,1,1,'23/01/2018');



