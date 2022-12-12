CREATE DATABASE `prointegrador` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

CREATE TABLE `admins` (
   `id` int NOT NULL AUTO_INCREMENT,
   `identificacion` varchar(45) NOT NULL,
   `nombre` varchar(45) NOT NULL,
   `contraseña` varchar(45) NOT NULL,
   PRIMARY KEY (`id`),
   UNIQUE KEY `identificacion_UNIQUE` (`identificacion`)
 ) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
 
 CREATE TABLE `productos` (
   `id` int NOT NULL AUTO_INCREMENT,
   `codigo` varchar(20) NOT NULL,
   `nombre` varchar(50) NOT NULL,
   `precio` decimal(10,0) NOT NULL,
   `cantidad` int NOT NULL,
   PRIMARY KEY (`id`),
   UNIQUE KEY `codigo_UNIQUE` (`codigo`),
   UNIQUE KEY `nombre_UNIQUE` (`nombre`)
 ) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
 
 CREATE TABLE `users` (
   `id` int NOT NULL AUTO_INCREMENT,
   `identificacion` varchar(11) NOT NULL,
   `nombre` varchar(50) NOT NULL,
   `contraseña` varchar(50) NOT NULL,
   PRIMARY KEY (`id`),
   UNIQUE KEY `identificacion_UNIQUE` (`identificacion`)
 ) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
 
 CREATE TABLE `proveedores` (
   `id` int NOT NULL AUTO_INCREMENT,
   `codigo` varchar(45) NOT NULL,
   `nombre` varchar(45) NOT NULL,
   `producto` varchar(45) NOT NULL,
   `precio` varchar(45) NOT NULL,
   `cantidad` varchar(45) NOT NULL,
   PRIMARY KEY (`id`),
   UNIQUE KEY `codigo_UNIQUE` (`codigo`),
   UNIQUE KEY `producto_UNIQUE` (`producto`)
 ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
