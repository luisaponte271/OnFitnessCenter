create database gym;

use gym;

 
create table productos ( 
	id int primary key auto_increment,
	nombre varchar(100) not null,
	descripcion varchar(500) not null,
	costo decimal(10, 2) not null,
	precio decimal(10, 2) not null,
	fechacreacion datetime,
    flag float
); 
 
 	INSERT INTO Productos values(1,'OATMEGA',	'14g Protein OMEGA-3s',	'140.00', '180.00',	now() ,true);
	INSERT INTO Productos values(2,'AGUA CIELO', 'Botella de 500 ml',	'6.00', '10.00',  now(),true);
    SELECT * From productos;
    
    create table socio ( 
	id int primary key auto_increment,
	nombre varchar(100) not null,
	apellido_pat varchar(100) not null,
	apellido_mat varchar(100) not null,
	telefono varchar(50) null,
	fecha_nac datetime null,
        email varchar(100) null,
    direccion varchar(250) null, 
    obs varchar(600) null,
    flag float
); 
     
	INSERT INTO Socio values(1,'LUIS ALBERTO','APONTE','CANCHANYA'			,'991052654',		'1994-11-09 00:00:00.000', 	'luisaponte271@gmail.com'						 ,'Mz. M Lote 26 Asoc. Virgen del Carmen - Ate'  			  ,'',true);
	INSERT INTO Socio values(2,'GELME IGNACIO','JARA','VENTURA'			,'945350517',		'1964-11-04 00:00:00.000', 	'ing.roycayetano@hotmail.com'					 ,'Jr. Los Petroqu�micos N� 111 Dpto. 101 - La Molina'        ,'',true);
	INSERT INTO Socio values(3,'SUSY','JARA','VENTURA'						,'991052654',		'1961-08-27 00:00:00.000', 	'Ronald-tg@hotmail.com'							 ,'Calle Los Olivos Mz. E-1 Lt. 14 Asoc. Virgen del Carmen'   ,'',true);
	INSERT INTO Socio values(4,'WILFREDO RAFAEL','JARA','VENTURA'			,'991853005',		'1968-06-09 00:00:00.000', 	'kendy_fya32@hotmail.com'						 ,'Calle Los Olivos Mz. E-1 Lt. 15 Asoc. Virgen del Carmen'   ,'',true);
	INSERT INTO Socio values(5,'DAVID','PRINCIPE','VENTURA'				,'989409331',		'2001-09-27 00:00:00.000', 	'daespinozan.22@gmail.com'						 ,'Calle Los Olivos Mz. E-1 Lt. 13 Asoc.Virgen del Carmen'    ,'',true);
	INSERT INTO Socio values(6,'WILLIAMS','PARIONA','GOMEZ'				,'989417275',		'2001-09-27 00:00:00.000', 	'ing.roycayetano@hotmail.com'					 ,'Calle 30 de Agosto Mz. A Lte. 07 Urb. Los Socialis'	      ,'',true);
	INSERT INTO Socio values(7,'JHON KENNEDY','LEON','PALACIOS'			,'962701753',		'1985-01-11 00:00:00.000', 	'martinzuritab@gmail.com' 						 ,'Asoc. Virgen del Carmen Mz E Lt. 39'                       ,'',true);
	INSERT INTO Socio values(8,'FERNANDO','DEPAZ','DEPAZ'					,'990917319',		'1983-02-23 00:00:00.000', 	'erick.veliz@jararesistencias.com'				 ,'Urb. Villa Victoria Mz. G  Lt. 9'                          ,'',true);
	INSERT INTO Socio values(9,'GREGORIO WALTER','MACHA','ROJAS'			,'997138855',		'2001-09-27 00:00:00.000', 	'daespinozan.22@gmail.com'						 ,'Los Claveles de Javier Prado Mz. B Lt. 15 Urb. Ceres'      ,'',true);
	INSERT INTO Socio values(10,'ANGELA PATRICIA','ROMERO','DAMIAN'		,'993344004',		'1988-01-06 00:00:00.000', 	'tommy20_th@hotmail.com'						 ,'Urb. Las Terrazas de Caraponguillo Mz. P Lt. 15'           ,'',true);
	INSERT INTO Socio values(11,'NILO','RAYMUNDO','SUAREZ'					,'968521545',		'2001-09-27 00:00:00.000', 	'svv_1989_18@hotmail.com'						 ,'Jr. Jun�n 3149 Urb. Per� - SMP'                            ,'',true);
	INSERT INTO Socio values(12,'ROSSE MARY','MATA','NARCISO'				,'945759426',		'1985-02-21 00:00:00.000', 	'tommy20_th@hotmail.com'						 ,'Asoc. de Viv. Los Girasoles Mz. E Lt. 17 Ate'              ,'',true);
	INSERT INTO Socio values(13,'HENRY DIEGO','ADRIANZEN','OLAYA'			,'993344004',		'2001-09-27 00:00:00.000', 	'jguerreroschirinos@gmail.com'					 ,'Av. Las Violetas N� 662 Mz. J Lt. 41 - Ermita�o'           ,'',true);
	INSERT INTO Socio values(14,'MARITZA MERY','APONTE','RIVERA'			,'972921326',		'1974-08-30 00:00:00.000', 	'raulesuarez25@gmail.com'						 ,'Asoc. Virgen del Carmen Mz. M Lt. 23 - Ate'                ,'',true);
	INSERT INTO Socio values(15,'LUIS ANGEL','SAMANIEGO','MAYTA'			,'966975497',		'1987-06-19 00:00:00.000', 	'abaldeonr@uni.pe'								 ,'Urb. Las Moras R�o Chira 432'                              ,'',true);
	INSERT INTO Socio values(16,'LORENA STEPHANY','PEZANTES','TAPIA'		,'966789379',		'1987-07-13 00:00:00.000', 	'almendra_ynfantes@hotmail.com'					 ,'Urb. Villa Victoria Mz. G Lt. 9'                           ,'',true);
	  SELECT * FROM  Socio;
      
	CREATE TABLE clases(
    id int primary key auto_increment,
    nombre varchar(60) not null,
	descripcion varchar(500) not null,
	horario_inicio varchar(50) not null,
	horario_fin varchar(50) not null,
	cupo numeric not null,
	lunes varchar(2) not null,
	martes varchar(2) not null,
	miercoles varchar(2) not null,
	jueves varchar(2) not null,
	viernes varchar(2) not null,
	sabado varchar(2) not null,
	domingo varchar(2) not null,
    flag float not null);
         
  
   INSERT INTO clases values(1,'sppinig','bicicleta','07:00:00 a.m.','08:00:00 p.m.',30,'SI','NO','NO','NO','SI','NO','NO',true);
   INSERT INTO clases values(2,'Yoga Fit','Yoga','07:00:00 a.m.','09:00:00 p.m.',10,'NO','NO','NO','NO','SI','NO','SI',true);
	select * FROM clases;
        
	CREATE TABLE compras(
    id int primary key auto_increment,   
    id_producto  int not null,
    cantidad int not null,
    total varchar(50) not null,
    fechacreacion varchar(30) not null,
    flag float,
    foreign key (id_producto) references productos(id));
    
     INSERT INTO compras values(1, 1, 3, '540.00', '2019-11-09 00:00:00.000', true);
     
        SELECT * FROM compras;
        
   CREATE TABLE ventas(
    id int primary key auto_increment,   
    id_producto  int not null,
    cantidad int not null,
    total varchar(50) not null,
    fechacreacion varchar(30) not null,
    flag float,
    foreign key (id_producto) references productos(id));
    
   INSERT INTO ventas values(1, 1, 3,'540.00', '2019-11-31 00:00:00.000', true);
     SELECT * FROM ventas; 
     
   CREATE TABLE tipomembresia( 
     id int primary key auto_increment,   
     nombre varchar(100) not null);
     
    
   INSERT INTO tipomembresia VALUES(1,'SEMANAL');
   INSERT INTO tipomembresia VALUES(2,'MENSUAL');
   INSERT INTO tipomembresia VALUES(3,'ANUAL');
   INSERT INTO tipomembresia VALUES(4,'INSCRIPCION');
   
     SELECT * FROM tipomembresia;
  
  CREATE TABLE membresia( 
   id int primary key auto_increment, 
   id_socio int not null,
   id_tipo_memb int not null,
   precio decimal(10, 2) not null,
   dia int not null,
   fecha_inicio varchar(50) not null,
   fecha_vencimiento varchar(50) not null,
   observacion varchar(500) not null,
	estado_pago float default 0,
   fechacreacion varchar(50) not null, 
   flag float not null, 
   foreign key (id_socio) references socio(id),
   foreign key (id_tipo_memb) references tipomembresia(id));
   
  INSERT INTO membresia values(1,1,1,'33.00',7,'2019-06-22 00:00:00.000','2019-06-29 00:00:00.000','',false,'2019-06-22 00:00:00.000',true);

  Select  * From membresia;
 
	
	 CREATE TABLE `rol` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

 INSERT INTO rol (`id`, `role`)
VALUES
	(1,'ADMIN');   
     
     SELECT * FROM  rol;
     
     
CREATE TABLE `usuario` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `active` int(11) DEFAULT NULL,
  `username` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `last_name` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
)  ENGINE=InnoDB DEFAULT CHARSET=latin1;
     
     INSERT INTO usuario (`id`, `active`,`username`, `email`, `last_name`, `name`, `password`)
VALUES
	(1,1,'NP154905' ,'luisaponte271@gmail.com','Aponte','Luis','091194se'),
	(2,1,'NP375143' ,'programadores4K@gmail.com','Aponte','NightStalker','contrasenia');
      
        SELECT * FROM  usuario; 
     
     CREATE TABLE `usuario_rol` (
  `usuario_id` int(11) NOT NULL,
  `rol_id` int(11) NOT NULL,
  PRIMARY KEY (`usuario_id`,`rol_id`),
  UNIQUE KEY `UK_it77eq964jhfqtu54081ebtio` (`rol_id`),
  CONSTRAINT `FK859n2jvi8ivhui0rl0esws6o` FOREIGN KEY (`usuario_id`) REFERENCES `usuario` (`id`),
  CONSTRAINT `FKa68196081fvovjhkek5m97n3y` FOREIGN KEY (`rol_id`) REFERENCES `rol` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

     
     INSERT INTO `usuario_rol` (`usuario_id`, `rol_id`)
VALUES
	(1,1);
     