-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 11, 2020 at 03:07 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `java_bank_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `account`
--

CREATE TABLE `account` (
  `id` int(11) NOT NULL,
  `acc_id` varchar(255) NOT NULL,
  `cust_id` varchar(255) NOT NULL,
  `acc_type` varchar(255) NOT NULL,
  `balance` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `account`
--

INSERT INTO `account` (`id`, `acc_id`, `cust_id`, `acc_type`, `balance`) VALUES
(1, 'A0001', 'CS001', 'Savings', 8000),
(2, 'A0002', 'CS002', 'Fixed', 1000);

-- --------------------------------------------------------

--
-- Table structure for table `branch`
--

CREATE TABLE `branch` (
  `id` int(11) NOT NULL,
  `branch` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `branch`
--

INSERT INTO `branch` (`id`, `branch`) VALUES
(1, 'Makati'),
(2, 'Quezon City');

-- --------------------------------------------------------

--
-- Table structure for table `clients`
--

CREATE TABLE `clients` (
  `id` int(11) NOT NULL,
  `clientID` varchar(5) NOT NULL,
  `lastName` varchar(100) NOT NULL,
  `firstName` varchar(50) NOT NULL,
  `middleName` varchar(50) NOT NULL,
  `genderAtBirth` varchar(6) NOT NULL,
  `dateOfBirth` date NOT NULL,
  `civilStatus` varchar(20) NOT NULL,
  `homeAddress` varchar(255) NOT NULL,
  `mobileNo` bigint(20) NOT NULL,
  `email` varchar(50) NOT NULL,
  `branch` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `clients`
--

INSERT INTO `clients` (`id`, `clientID`, `lastName`, `firstName`, `middleName`, `genderAtBirth`, `dateOfBirth`, `civilStatus`, `homeAddress`, `mobileNo`, `email`, `branch`) VALUES
(1, 'C0001', 'Dela Cruz', 'Pedro', 'Santos', 'Male', '2000-06-12', 'Single', '100 Muralla St., Intramuros, Manila', 9982355489, 'pedro.delacruz@gmail.com', 'Manila'),
(2, 'C0002', 'Go', 'Mark', 'Sy', 'Male', '1970-05-19', 'Single', '1 Makati Ave., Makati City', 9275449851, 'markgo@gmail.com', 'Makati'),
(3, 'C0003', 'Lopez', 'Jose', 'Flores', 'Male', '1983-08-21', 'Married', '1 Carriedo St., Quiapo, Manila', 9203495834, 'lopez.jose@gmail.com', 'Manila'),
(4, 'C0004', 'Salvador', 'Amanda', 'Perez', 'Female', '1991-06-10', 'Separated', '33 Ortigas Ave., Pasig City', 9102223457, 'apsalvador@yahoo.com', 'Pasig'),
(5, 'C0004', 'Salvador', 'Amanda', 'Perez', 'Female', '1991-06-10', 'Separated', '33 Ortigas Ave., Pasig City', 9102223457, 'apsalvador@yahoo.com', 'Pasig'),
(6, 'C0005', 'Reyes', 'Martha', 'Cruz', 'Female', '1999-07-26', 'Single', '7 Lawton Ave., Taguig City', 9273348987, 'm.c.reyes@outlook.com', 'Taguig'),
(7, 'C0006', 'Domingo', 'Andrew', 'Padilla', 'Male', '1986-05-13', 'Single', '3565 Alabang-Zapote Rd., Alabang, Muntinlupa City', 9754839113, 'adomingo13@gmail.com', 'Muntinlupa'),
(8, 'C0007', 'Dominguez', 'Ernesto', 'Rodriguez', 'Male', '1964-04-05', 'Married', '455 Pinaglaban St., San Juan City', 9233349567, 'erd.04051964@gmail.com', 'San Juan');

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `id` int(11) NOT NULL,
  `cust_id` varchar(255) NOT NULL,
  `firstname` varchar(255) NOT NULL,
  `lastname` varchar(255) NOT NULL,
  `street` varchar(255) NOT NULL,
  `city` varchar(255) NOT NULL,
  `branch` varchar(255) NOT NULL,
  `phone` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`id`, `cust_id`, `firstname`, `lastname`, `street`, `city`, `branch`, `phone`) VALUES
(1, 'CS001', 'Jose', 'Romulo', 'Balut St.', 'Manila', 'Quezon City', 9558483948),
(2, 'CS002', 'Pedro', 'Romero', 'Times St.', 'Quezon City', 'Quezon City', 9756671231),
(3, 'CS003', 'Carlos', 'Padilla', 'Ayala Ave.', 'Makati', 'Makati', 9984677896),
(4, 'CS004', 'Mariam', 'Delos Reyes', 'McKinley Highway', 'Taguig', 'Makati', 9473389876);

-- --------------------------------------------------------

--
-- Table structure for table `deposit`
--

CREATE TABLE `deposit` (
  `id` int(11) NOT NULL,
  `acc_id` varchar(255) NOT NULL,
  `cust_id` varchar(255) NOT NULL,
  `date` date NOT NULL,
  `balance` double NOT NULL,
  `deposit` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `deposit`
--

INSERT INTO `deposit` (`id`, `acc_id`, `cust_id`, `date`, `balance`, `deposit`) VALUES
(1, 'a0001', 'CS001', '2020-04-09', 5000, 5000),
(2, 'A0001', 'CS001', '2020-04-09', 10000, 5000),
(3, 'A0001', 'CS001', '2020-04-09', 15000, 2000),
(4, 'A0002', 'CS002', '2020-04-10', -9000, 9000),
(5, 'A0002', 'CS002', '2020-04-10', 0, 1000);

-- --------------------------------------------------------

--
-- Table structure for table `transfer`
--

CREATE TABLE `transfer` (
  `id` int(11) NOT NULL,
  `f_account` varchar(255) NOT NULL,
  `t_account` varchar(255) NOT NULL,
  `amount` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `transfer`
--

INSERT INTO `transfer` (`id`, `f_account`, `t_account`, `amount`) VALUES
(1, 'A0002', 'A0001', 3000);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `username` varchar(255) CHARACTER SET latin1 COLLATE latin1_general_cs NOT NULL,
  `userPass` varchar(255) CHARACTER SET latin1 COLLATE latin1_general_cs NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `username`, `userPass`) VALUES
(1, 'user', 'userpass');

-- --------------------------------------------------------

--
-- Table structure for table `withdraw`
--

CREATE TABLE `withdraw` (
  `id` int(11) NOT NULL,
  `acc_id` varchar(255) NOT NULL,
  `cust_id` varchar(255) NOT NULL,
  `date` date NOT NULL,
  `balance` double NOT NULL,
  `withdraw` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `withdraw`
--

INSERT INTO `withdraw` (`id`, `acc_id`, `cust_id`, `date`, `balance`, `withdraw`) VALUES
(1, 'A0001', 'CS001', '2020-04-09', 17000, 5000),
(2, 'A0001', 'CS001', '2020-04-09', 17000, 5000),
(3, 'A0001', 'CS001', '2020-04-10', 15000, 7000),
(4, 'A0001', 'CS001', '2020-04-10', 15000, 7000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `account`
--
ALTER TABLE `account`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `branch`
--
ALTER TABLE `branch`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `clients`
--
ALTER TABLE `clients`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `deposit`
--
ALTER TABLE `deposit`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `transfer`
--
ALTER TABLE `transfer`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `withdraw`
--
ALTER TABLE `withdraw`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `account`
--
ALTER TABLE `account`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `branch`
--
ALTER TABLE `branch`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `clients`
--
ALTER TABLE `clients`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `deposit`
--
ALTER TABLE `deposit`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `transfer`
--
ALTER TABLE `transfer`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `withdraw`
--
ALTER TABLE `withdraw`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
