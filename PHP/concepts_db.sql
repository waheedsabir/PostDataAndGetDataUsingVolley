-- phpMyAdmin SQL Dump
-- version 4.0.10.18
-- https://www.phpmyadmin.net
--
-- Host: localhost:3306
-- Generation Time: Aug 16, 2017 at 05:13 AM
-- Server version: 5.6.35-cll-lve
-- PHP Version: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `concepts_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `health`
--

CREATE TABLE IF NOT EXISTS `health` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(200) NOT NULL,
  `detail` varchar(200) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=23 ;

--
-- Dumping data for table `health`
--

INSERT INTO `health` (`id`, `title`, `detail`) VALUES
(11, 'waheed', 'dhjli. nkit kiurv nk. hdyikhdsb '),
(12, 'waheed', 'dhjli. nkit kiurv nk. hdyikhdsb '),
(13, 'hello', 'ok ok '),
(14, 'he', 'hello'),
(15, 'he', 'hello'),
(16, 'he', 'hello'),
(17, 'ok', 'okkk'),
(18, 'ok', 'okkk'),
(19, 'jqjqj', 'jshsjw'),
(20, 'jqjqj', 'jshsjw'),
(21, 'jqjqj', 'jshsjw'),
(22, 'jqjqj', 'jshsjw');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
