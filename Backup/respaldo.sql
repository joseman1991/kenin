/*
SQLyog Ultimate v11.11 (64 bit)
MySQL - 5.7.9-log : Database - citas
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`citas` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `citas`;

/*Table structure for table `tbdoctores` */

DROP TABLE IF EXISTS `tbdoctores`;

CREATE TABLE `tbdoctores` (
  `ci` char(10) NOT NULL,
  `apellidos` varchar(30) NOT NULL,
  `nombres` varchar(30) NOT NULL,
  `telef` char(10) DEFAULT NULL,
  `cel` char(10) NOT NULL,
  `idesp` int(11) NOT NULL,
  `nclgdo` int(11) NOT NULL,
  `freg` char(10) NOT NULL,
  `iduser` int(11) NOT NULL,
  PRIMARY KEY (`ci`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tbdoctores` */

/*Table structure for table `tbespecialidades` */

DROP TABLE IF EXISTS `tbespecialidades`;

CREATE TABLE `tbespecialidades` (
  `idesp` int(11) NOT NULL,
  `nesp` varchar(100) NOT NULL,
  PRIMARY KEY (`idesp`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tbespecialidades` */

insert  into `tbespecialidades`(`idesp`,`nesp`) values (1,'ODONTOLOGIA'),(2,'UROLOGIA'),(3,'CARDIOLOGIA'),(4,'MEDICINA GENERAL');

/*Table structure for table `tbfacturacion` */

DROP TABLE IF EXISTS `tbfacturacion`;

CREATE TABLE `tbfacturacion` (
  `idfact` char(20) NOT NULL,
  `ced` char(10) NOT NULL,
  `idesp` int(11) NOT NULL,
  `idserv` int(11) NOT NULL,
  `detallefact` varchar(100) NOT NULL,
  `punit` double(7,2) NOT NULL,
  `subtot` double(7,2) NOT NULL,
  `dscto` double(7,2) NOT NULL,
  `iva` double(7,2) NOT NULL,
  `neto` double(7,2) NOT NULL,
  `tpago` char(10) NOT NULL,
  `fechaa` char(10) NOT NULL,
  `iduser` int(11) NOT NULL,
  PRIMARY KEY (`idfact`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tbfacturacion` */

/*Table structure for table `tbpacientes` */

DROP TABLE IF EXISTS `tbpacientes`;

CREATE TABLE `tbpacientes` (
  `ced` char(10) NOT NULL,
  `nom` varchar(50) NOT NULL,
  `edad` int(11) NOT NULL,
  `sexo` char(1) NOT NULL,
  `telf` char(10) NOT NULL,
  `freg` char(10) NOT NULL,
  `iduser` int(11) NOT NULL,
  PRIMARY KEY (`ced`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tbpacientes` */

/*Table structure for table `tbservicios` */

DROP TABLE IF EXISTS `tbservicios`;

CREATE TABLE `tbservicios` (
  `idserv` int(11) NOT NULL,
  `nserv` varchar(200) NOT NULL,
  `pserv` double(7,2) NOT NULL,
  `idesp` int(11) NOT NULL,
  `fregis` char(10) NOT NULL,
  PRIMARY KEY (`idserv`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tbservicios` */

/*Table structure for table `tbusuarios` */

DROP TABLE IF EXISTS `tbusuarios`;

CREATE TABLE `tbusuarios` (
  `iduser` int(11) NOT NULL,
  `nuser` varchar(20) NOT NULL,
  `pass` char(50) NOT NULL,
  `estdo` int(11) NOT NULL DEFAULT '0',
  `facturacion` int(11) NOT NULL DEFAULT '0',
  `servicios` int(11) NOT NULL DEFAULT '0',
  `doctores` int(11) NOT NULL DEFAULT '0',
  `areas` int(11) NOT NULL DEFAULT '0',
  `pacientes` int(11) NOT NULL DEFAULT '0',
  `seguridad` int(11) NOT NULL DEFAULT '0',
  `freg` char(10) NOT NULL DEFAULT '0',
  PRIMARY KEY (`iduser`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `tbusuarios` */

insert  into `tbusuarios`(`iduser`,`nuser`,`pass`,`estdo`,`facturacion`,`servicios`,`doctores`,`areas`,`pacientes`,`seguridad`,`freg`) values (1,'kmejia','81dc9bdb52d04dc20036dbd8313ed055',1,1,1,1,1,1,1,'23/01/2018'),(2,'obernal','0c12278389532e91c601af4c8adef7fc',1,1,1,1,1,1,1,'23/01/2018');

/*Table structure for table `mostrar_usuarios` */

DROP TABLE IF EXISTS `mostrar_usuarios`;

/*!50001 DROP VIEW IF EXISTS `mostrar_usuarios` */;
/*!50001 DROP TABLE IF EXISTS `mostrar_usuarios` */;

/*!50001 CREATE TABLE  `mostrar_usuarios`(
 `estdo` int(11) ,
 `nuser` varchar(20) 
)*/;

/*Table structure for table `vw_mostrar_especialidades` */

DROP TABLE IF EXISTS `vw_mostrar_especialidades`;

/*!50001 DROP VIEW IF EXISTS `vw_mostrar_especialidades` */;
/*!50001 DROP TABLE IF EXISTS `vw_mostrar_especialidades` */;

/*!50001 CREATE TABLE  `vw_mostrar_especialidades`(
 `idesp` int(11) ,
 `nesp` varchar(100) 
)*/;

/*Table structure for table `vw_mostrardoctores` */

DROP TABLE IF EXISTS `vw_mostrardoctores`;

/*!50001 DROP VIEW IF EXISTS `vw_mostrardoctores` */;
/*!50001 DROP TABLE IF EXISTS `vw_mostrardoctores` */;

/*!50001 CREATE TABLE  `vw_mostrardoctores`(
 `ci` char(10) ,
 `apellidos` varchar(30) ,
 `nombres` varchar(30) ,
 `nesp` varchar(100) ,
 `nclgdo` int(11) 
)*/;

/*View structure for view mostrar_usuarios */

/*!50001 DROP TABLE IF EXISTS `mostrar_usuarios` */;
/*!50001 DROP VIEW IF EXISTS `mostrar_usuarios` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `mostrar_usuarios` AS select `tbusuarios`.`estdo` AS `estdo`,`tbusuarios`.`nuser` AS `nuser` from `tbusuarios` */;

/*View structure for view vw_mostrar_especialidades */

/*!50001 DROP TABLE IF EXISTS `vw_mostrar_especialidades` */;
/*!50001 DROP VIEW IF EXISTS `vw_mostrar_especialidades` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `vw_mostrar_especialidades` AS select `tbespecialidades`.`idesp` AS `idesp`,`tbespecialidades`.`nesp` AS `nesp` from `tbespecialidades` */;

/*View structure for view vw_mostrardoctores */

/*!50001 DROP TABLE IF EXISTS `vw_mostrardoctores` */;
/*!50001 DROP VIEW IF EXISTS `vw_mostrardoctores` */;

/*!50001 CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `vw_mostrardoctores` AS select `tbdoctores`.`ci` AS `ci`,`tbdoctores`.`apellidos` AS `apellidos`,`tbdoctores`.`nombres` AS `nombres`,`tbespecialidades`.`nesp` AS `nesp`,`tbdoctores`.`nclgdo` AS `nclgdo` from (`tbdoctores` join `tbespecialidades` on((`tbdoctores`.`idesp` = `tbespecialidades`.`idesp`))) */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
