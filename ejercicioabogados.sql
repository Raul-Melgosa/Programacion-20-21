-- phpMyAdmin SQL Dump
-- version 4.0.4.2
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 31-03-2021 a las 08:57:19
-- Versión del servidor: 5.6.13
-- Versión de PHP: 5.4.17

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `ejercicioabogados`
--
CREATE DATABASE IF NOT EXISTS `ejercicioabogados` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `ejercicioabogados`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `abogados`
--

CREATE TABLE IF NOT EXISTS `abogados` (
  `dni` varchar(9) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellidos` varchar(100) NOT NULL,
  `direccion` varchar(200) NOT NULL,
  PRIMARY KEY (`dni`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `abogados`
--

INSERT INTO `abogados` (`dni`, `nombre`, `apellidos`, `direccion`) VALUES
('10101010M', 'Lionel', 'Messi', 'slghbsklgnselig'),
('12312312A', 'Paco', 'Jemez Gonzalez', '1ºC'),
('55555555B', 'Sergio', 'sljghsliegnseñogjp', 'lsgnlsignsñeglhj'),
('71350682J', 'Raúl', 'Melgosa', 'Miranda'),
('98765432A', 'Robert', 'Mendoza', 'Direccion tipo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `abogados-casos`
--

CREATE TABLE IF NOT EXISTS `abogados-casos` (
  `numeroExpediente` varchar(5) NOT NULL,
  `dni` varchar(9) NOT NULL,
  PRIMARY KEY (`numeroExpediente`,`dni`),
  KEY `dni-abogadoscasos-fk` (`dni`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `abogados-casos`
--

INSERT INTO `abogados-casos` (`numeroExpediente`, `dni`) VALUES
('00001', '12312312A'),
('00002', '12312312A'),
('00003', '12312312A'),
('00004', '12312312A');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `casos`
--

CREATE TABLE IF NOT EXISTS `casos` (
  `numeroExpediente` varchar(5) NOT NULL,
  `Estado` varchar(15) NOT NULL,
  `FechaInicio` date DEFAULT NULL,
  `FechaFin` date DEFAULT NULL,
  `dni` varchar(9) NOT NULL,
  PRIMARY KEY (`numeroExpediente`),
  KEY `dni` (`dni`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `casos`
--

INSERT INTO `casos` (`numeroExpediente`, `Estado`, `FechaInicio`, `FechaFin`, `dni`) VALUES
('00001', 'En trámite', '2021-03-04', '2021-03-25', '12345678A'),
('00002', 'En trámite', '2021-03-30', '2021-03-31', '12345678A'),
('00003', 'En trámite', '2021-03-04', '2021-03-31', '71350682J'),
('00004', 'En trámite', '2021-03-23', '2021-03-31', '98765432A');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE IF NOT EXISTS `clientes` (
  `dni` varchar(9) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellidos` varchar(100) NOT NULL,
  `direccion` varchar(200) NOT NULL,
  `telefono` varchar(9) NOT NULL,
  `correo` varchar(25) NOT NULL,
  PRIMARY KEY (`dni`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`dni`, `nombre`, `apellidos`, `direccion`, `telefono`, `correo`) VALUES
('12345678A', 'Javier', 'Berasategui Lopez', 'Debajo de un puente', '634936142', 'javiberasa@gmail.com'),
('71350682J', 'Raúl', 'Melgosa Conejo', 'C/Colón 20, 4ºC', '666189674', 'raulmelco@gmail.com'),
('98765432A', 'Rafael', 'Blazquez', 'Vitoria', '123987456', 'leorafardo@gmail.com');

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `abogados-casos`
--
ALTER TABLE `abogados-casos`
  ADD CONSTRAINT `abogados-casos_ibfk_1` FOREIGN KEY (`numeroExpediente`) REFERENCES `casos` (`numeroExpediente`),
  ADD CONSTRAINT `dni-abogadoscasos-fk` FOREIGN KEY (`dni`) REFERENCES `abogados` (`dni`);

--
-- Filtros para la tabla `casos`
--
ALTER TABLE `casos`
  ADD CONSTRAINT `casos_ibfk_1` FOREIGN KEY (`dni`) REFERENCES `clientes` (`dni`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
