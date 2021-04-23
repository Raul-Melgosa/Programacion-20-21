-- phpMyAdmin SQL Dump
-- version 4.0.4.2
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 23-04-2021 a las 08:04:28
-- Versión del servidor: 5.6.13
-- Versión de PHP: 5.4.17

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `ejercicioliga`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `equipos`
--

CREATE TABLE IF NOT EXISTS `equipos` (
  `Nombre` varchar(50) NOT NULL,
  `Ciudad` varchar(50) NOT NULL,
  `FechaFundacion` date NOT NULL,
  `Colores` varchar(50) NOT NULL,
  `Presupuesto` int(11) NOT NULL,
  `Clasificacion` int(2) NOT NULL,
  PRIMARY KEY (`Nombre`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `equipos`
--

INSERT INTO `equipos` (`Nombre`, `Ciudad`, `FechaFundacion`, `Colores`, `Presupuesto`, `Clasificacion`) VALUES
('Athletic Club de Bilbao', 'Bilbao', '1898-01-01', 'Rojiblanco', 104000000, 10),
('Atlético de Madrid', 'Madrid', '1903-04-26', 'Rojiblanco', 515000000, 1),
('Club Atlético Osasuna', 'Pamplona', '1920-10-24', 'Rojo', 65000000, 9),
('FC Barcelona', 'Barcelona', '1899-11-29', 'Blaugrana', 828000000, 2),
('Granada CF', 'Granada', '1931-04-14', 'Blanquirojo', 70000000, 8),
('Levante Unión Deportiva', 'Valencia', '1909-01-01', 'Blaugrana', 118000000, 11),
('Real Betis Balompié', 'Sevilla', '1907-09-12', 'BlanquiVerde', 88000000, 6),
('Real Madrid', 'Madrid', '1902-03-06', 'Blanco', 617000000, 3),
('Real Saociedad', 'San Sebastián', '1909-09-07', 'Blanquiazul', 110000000, 5),
('Sevilla CF', 'Sevilla', '1890-01-25', 'Rojiblanco', 226000000, 4),
('Villareal', 'Villareal', '1923-03-10', 'Amarillo', 117000000, 7);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
