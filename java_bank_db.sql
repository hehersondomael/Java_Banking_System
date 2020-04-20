-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 20, 2020 at 09:25 AM
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
-- Table structure for table `accounts`
--

CREATE TABLE `accounts` (
  `id` int(11) NOT NULL,
  `accountID` varchar(5) NOT NULL,
  `clientID` varchar(5) NOT NULL,
  `accountType` varchar(20) NOT NULL,
  `currentBalance` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `accounts`
--

INSERT INTO `accounts` (`id`, `accountID`, `clientID`, `accountType`, `currentBalance`) VALUES
(1, 'A0001', 'C0001', 'Savings', 5660),
(2, 'A0002', 'C0002', 'Savings', 20460),
(3, 'A0003', 'C0003', 'Savings', 17700),
(4, 'A0004', 'C0005', 'Savings', 18760),
(5, 'A0005', 'C0001', 'Fixed', 25000);

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
(1, 'C0001', 'Dela Cruz', 'Pedro', 'Santos', 'Male', '2000-06-12', 'Single', '1 Blumentritt St., Sta. Cruz, Manila', 9982355489, 'pedro.delacruz@gmail.com', 'Quezon City'),
(2, 'C0002', 'Go', 'Mark', 'Sy', 'Male', '1970-05-19', 'Single', '1 Makati Ave., Makati City', 9194569125, 'markgo@gmail.com', 'Makati'),
(3, 'C0003', 'Salvador', 'Amanda', 'Perez', 'Female', '1991-06-10', 'Separated', '33 Ortigas Ave., Pasig City', 9102223457, 'apsalvador@yahoo.com', 'Pasig'),
(4, 'C0004', 'Reyes', 'Martha', 'Cruz', 'Female', '1999-07-26', 'Single', '7 Lawton Ave., Taguig City', 9273348987, 'm.c.reyes@outlook.com', 'Taguig'),
(5, 'C0005', 'Domingo', 'Andrew', 'Padilla', 'Male', '1986-05-13', 'Single', '3565 Alabang-Zapote Rd., Alabang, Muntinlupa City', 9754839113, 'adomingo13@gmail.com', 'Muntinlupa'),
(6, 'C0006', 'Dominguez', 'Ernesto', 'Rodriguez', 'Male', '1964-04-05', 'Married', '455 Pinaglaban St., San Juan City', 9233349567, 'erd.04051964@gmail.com', 'San Juan');

-- --------------------------------------------------------

--
-- Table structure for table `deposit`
--

CREATE TABLE `deposit` (
  `id` int(11) NOT NULL,
  `accountID` varchar(5) NOT NULL,
  `clientID` varchar(5) NOT NULL,
  `timestamp` datetime NOT NULL,
  `previousBalance` double NOT NULL,
  `amountDeposited` double NOT NULL,
  `newBalance` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `deposit`
--

INSERT INTO `deposit` (`id`, `accountID`, `clientID`, `timestamp`, `previousBalance`, `amountDeposited`, `newBalance`) VALUES
(1, 'A0001', 'C0001', '2020-04-12 19:02:11', 10000, 50000, 60000),
(2, 'A0002', 'C0002', '2020-04-12 19:51:18', 37000, 39000, 76000);

-- --------------------------------------------------------

--
-- Table structure for table `transfer`
--

CREATE TABLE `transfer` (
  `id` int(11) NOT NULL,
  `timestamp` datetime NOT NULL,
  `sourceAccountID` varchar(5) NOT NULL,
  `sourceClientID` varchar(5) NOT NULL,
  `destinationAccountID` varchar(5) NOT NULL,
  `destinationClientID` varchar(5) NOT NULL,
  `amountToBeTransferred` double NOT NULL,
  `sourcePreviousBalance` double NOT NULL,
  `sourceTransferFee` double NOT NULL,
  `sourceNewBalance` double NOT NULL,
  `destinationPreviousBalance` double NOT NULL,
  `destinationTransferFee` double NOT NULL,
  `destinationNewBalance` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `transfer`
--

INSERT INTO `transfer` (`id`, `timestamp`, `sourceAccountID`, `sourceClientID`, `destinationAccountID`, `destinationClientID`, `amountToBeTransferred`, `sourcePreviousBalance`, `sourceTransferFee`, `sourceNewBalance`, `destinationPreviousBalance`, `destinationTransferFee`, `destinationNewBalance`) VALUES
(1, '2020-04-13 12:40:19', 'A0002', 'C0002', 'A0001', 'C0001', 8000, 76000, 0, 68000, 60000, 0, 68000),
(2, '2020-04-13 12:49:18', 'A0004', 'C0001', 'A0003', 'C0003', 4900, 25000, 0, 20100, 15200, 0, 20100),
(3, '2020-04-13 13:18:48', 'A0001', 'C0001', 'A0002', 'C0002', 2000, 68000, 60, 65940, 68000, 80, 69920),
(5, '2020-04-13 15:16:01', 'A0004', 'C0001', 'A0001', 'C0001', 1000, 20100, 60, 19040, 67060, 80, 67980),
(6, '2020-04-13 15:17:28', 'A0004', 'C0001', 'A0001', 'C0001', 1000, 19040, 60, 17980, 67980, 80, 68900),
(7, '2020-04-13 15:18:43', 'A0001', 'C0001', 'A0001', 'C0003', 1000, 68900, 60, 67840, 20100, 80, 21020),
(8, '2020-04-13 16:01:09', 'A0001', 'C0001', 'A0002', 'C0002', 1000, 21020, 60, 19960, 69920, 80, 70840),
(9, '2020-04-13 16:01:09', 'A0001', 'C0001', 'A0003', 'C0002', 1000, 19960, 60, 18900, 70840, 80, 71760),
(10, '2020-04-13 16:13:28', 'A0003', 'C0001', 'A0002', 'C0002', 1000, 18900, 60, 17840, 70840, 80, 71760),
(11, '2020-04-13 16:14:10', 'A0002', 'C0001', 'A0003', 'C0003', 1000, 18900, 60, 17840, 17840, 80, 18760),
(12, '2020-04-13 16:18:52', 'A0002', 'C0003', 'A0004', 'C0005', 1000, 18760, 60, 17700, 17980, 80, 18900),
(13, '2020-04-13 16:36:26', 'A0004', 'C0005', 'A0002', 'C0002', 1000, 18900, 60, 17840, 17700, 80, 18620),
(14, '2020-04-13 16:43:28', 'A0001', 'C0001', 'A0002', 'C0002', 1000, 8840, 60, 7780, 18620, 80, 19540),
(15, '2020-04-13 16:50:52', 'A0001', 'C0001', 'A0002', 'C0002', 1000, 7780, 60, 6720, 19540, 80, 20460),
(16, '2020-04-13 16:50:52', 'A0001', 'C0001', 'A0004', 'C0005', 1000, 6720, 60, 5660, 17840, 80, 18760);

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
  `accountID` varchar(5) NOT NULL,
  `clientID` varchar(5) NOT NULL,
  `timestamp` datetime NOT NULL,
  `previousBalance` double NOT NULL,
  `amountWithdrawn` double NOT NULL,
  `newBalance` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `withdraw`
--

INSERT INTO `withdraw` (`id`, `accountID`, `clientID`, `timestamp`, `previousBalance`, `amountWithdrawn`, `newBalance`) VALUES
(1, 'A0002', 'C0002', '2020-04-12 16:18:28', 45000, 5000, 40000),
(2, 'A0003', 'C0003', '2020-04-12 16:38:34', 25000, 7000, 18000),
(3, 'A0002', 'C0002', '2020-04-12 16:40:23', 40000, 3000, 37000),
(4, 'A0003', 'C0003', '2020-04-12 16:58:27', 18000, 2000, 16000),
(5, 'A0003', 'C0003', '2020-04-12 18:27:07', 16000, 800, 15200);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `accounts`
--
ALTER TABLE `accounts`
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
-- AUTO_INCREMENT for table `accounts`
--
ALTER TABLE `accounts`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `branch`
--
ALTER TABLE `branch`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `clients`
--
ALTER TABLE `clients`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `deposit`
--
ALTER TABLE `deposit`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `transfer`
--
ALTER TABLE `transfer`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `withdraw`
--
ALTER TABLE `withdraw`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
