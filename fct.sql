-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 18-04-2020 a las 11:46:51
-- Versión del servidor: 10.4.11-MariaDB
-- Versión de PHP: 7.4.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `fct`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `fact_prov`
--

CREATE TABLE `fact_prov` (
  `CIF_PROVEEDOR` varchar(30) NOT NULL,
  `RAZ_PROVEEDOR` varchar(30) NOT NULL,
  `NUM_FACTURA` int(11) NOT NULL,
  `DES_FACTURA` varchar(30) NOT NULL,
  `BAS_IMPONIBLE` float NOT NULL,
  `IVA_IMPORTE` float NOT NULL,
  `TOT_IMPORTE` float NOT NULL,
  `FEC_FACTURA` timestamp NOT NULL DEFAULT current_timestamp(),
  `FEC_VENCIMIENTO` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `prov_comp`
--

CREATE TABLE `prov_comp` (
  `CIF_PROVEEDOR` varchar(30) NOT NULL,
  `RAZ_PROVEEDOR` varchar(30) NOT NULL,
  `REG_NOTARIAL` varchar(30) NOT NULL,
  ` SEG_RESPONSABILIDAD` varchar(30) NOT NULL,
  `SEG_IMPORTE` int(11) NOT NULL,
  `FEC_HOMOLOGACIÓN` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
