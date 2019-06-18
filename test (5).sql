-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Czas generowania: 20 Maj 2019, 04:50
-- Wersja serwera: 5.7.19
-- Wersja PHP: 5.6.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Baza danych: `test`
--

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `category`
--

DROP TABLE IF EXISTS `category`;
CREATE TABLE IF NOT EXISTS `category` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `for_adults` tinyint(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

--
-- Zrzut danych tabeli `category`
--

INSERT INTO `category` (`id`, `name`, `for_adults`) VALUES
(1, 'Horror', 1),
(2, 'Komedia', 0),
(3, 'Scifi', 0),
(4, 'Film animowany', 0),
(5, 'Dramat', 1),
(6, 'Wojtkowa', 1),
(7, 'dfgdfgd', 1);

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `movie`
--

DROP TABLE IF EXISTS `movie`;
CREATE TABLE IF NOT EXISTS `movie` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) NOT NULL,
  `release_date` date NOT NULL,
  `language` varchar(255) NOT NULL,
  `category_id` int(11) NOT NULL,
  `id_movie` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `category_id` (`category_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

--
-- Zrzut danych tabeli `movie`
--

INSERT INTO `movie` (`id`, `title`, `release_date`, `language`, `category_id`, `id_movie`) VALUES
(1, 'Alien', '2012-05-20', 'Angielski', 1, NULL),
(2, 'The Conjuring', '2012-05-20', 'Angielski', 1, NULL),
(3, 'Alien', '2012-05-20', 'Angielski', 1, NULL),
(4, 'The Conjuring', '2012-05-20', 'Angielski', 1, NULL),
(5, 'Chlopaki nie placza ', '2012-05-20', 'Polski', 2, NULL),
(6, 'Avengers: Infinity War', '2012-05-20', 'Angielski', 3, NULL),
(7, 'Dragon ball Z', '2012-05-20', 'Japonski', 4, NULL),
(8, 'Wojtek', '2014-04-11', 'Polski', 1, NULL),
(9, 'Wojtkowa', '2012-12-22', 'Angielski', 6, NULL),
(10, 'Title', '2010-12-13', 'Language', 1, NULL);

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `users`
--

DROP TABLE IF EXISTS `users`;
CREATE TABLE IF NOT EXISTS `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `login` varchar(255) NOT NULL,
  `haslo` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Zrzut danych tabeli `users`
--

INSERT INTO `users` (`id`, `login`, `haslo`) VALUES
(1, 'adam', 'qwerty');

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `watched`
--

DROP TABLE IF EXISTS `watched`;
CREATE TABLE IF NOT EXISTS `watched` (
  `id_movie` int(11) NOT NULL,
  `movie` varchar(255) NOT NULL,
  `raiting` int(100) NOT NULL,
  `description` varchar(255) NOT NULL,
  `watched` tinyint(4) NOT NULL,
  KEY `id` (`id_movie`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Ograniczenia dla zrzutów tabel
--

--
-- Ograniczenia dla tabeli `movie`
--
ALTER TABLE `movie`
  ADD CONSTRAINT `FKaork482evmtbc7xj2wrt0it2v` FOREIGN KEY (`category_id`) REFERENCES `category` (`id`),
  ADD CONSTRAINT `movie_ibfk_1` FOREIGN KEY (`category_id`) REFERENCES `category` (`id`);

--
-- Ograniczenia dla tabeli `watched`
--
ALTER TABLE `watched`
  ADD CONSTRAINT `watched_ibfk_1` FOREIGN KEY (`id_movie`) REFERENCES `movie` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
