-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 27, 2020 at 04:23 AM
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
  `originalBalance` double NOT NULL,
  `currentBalance` double NOT NULL,
  `dateCreated` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `accounts`
--

INSERT INTO `accounts` (`id`, `accountID`, `clientID`, `accountType`, `originalBalance`, `currentBalance`, `dateCreated`) VALUES
(1, 'A0001', 'C0001', 'Savings', 10000, 12880, '2020-04-27 00:01:19'),
(2, 'A0002', 'C0002', 'Fixed', 25000, 21850, '2020-04-27 00:08:47'),
(3, 'A0003', 'C0001', 'Fixed', 120000, 120000, '2020-04-27 00:23:10'),
(4, 'A0004', 'C0003', 'Current', 15000, 15000, '2020-04-27 00:23:46'),
(5, 'A0005', 'C0005', 'Savings', 29000, 29000, '2020-04-27 00:28:15'),
(6, 'A0006', 'C0003', 'Fixed', 18000, 18000, '2020-04-27 00:29:01'),
(7, 'A0007', 'C0004', 'Savings', 345216.18, 345216.18, '2020-04-27 00:30:38'),
(8, 'A0008', 'C0006', 'Savings', 24999.75, 24999.75, '2020-04-27 00:31:24'),
(9, 'A0009', 'C0007', 'Fixed', 12000, 12000, '2020-04-27 00:34:03'),
(10, 'A0010', 'C0008', 'Savings', 10500, 10500, '2020-04-27 00:48:41'),
(11, 'A0011', 'C0003', 'Savings', 12000, 12000, '2020-04-27 01:11:41');

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
(2, 'C0002', 'Go', 'Mark', 'Sy', 'Male', '1970-05-20', 'Single', '1 Makati Ave., Makati City', 9194569125, 'markgo@gmail.com', 'Makati'),
(3, 'C0003', 'Salvador', 'Amanda', 'Perez', 'Female', '1991-06-10', 'Divorced', '33 Ortigas Ave., Pasig City', 9102223457, 'apsalvador@yahoo.com', 'Pasig'),
(4, 'C0004', 'Reyes', 'Martha', 'Cruz', 'Female', '1999-07-26', 'Single', '7 Lawton Ave., Taguig City', 9273348987, 'm.c.reyes@outlook.com', 'Taguig'),
(5, 'C0005', 'Domingo', 'Andrew', 'Padilla', 'Male', '1986-05-13', 'Single', '3565 Alabang-Zapote Rd., Alabang, Muntinlupa City', 9754839113, 'adomingo13@gmail.com', 'Muntinlupa'),
(6, 'C0006', 'Dominguez', 'Ernesto', 'Rodriguez', 'Male', '1964-04-05', 'Married', '455 Pinaglaban St., San Juan City', 9233349567, 'erd.04051964@gmail.com', 'San Juan'),
(7, 'C0007', 'Roque', 'Santino', 'San Pedro', 'Male', '1995-09-17', 'Single', '100 EDSA cor. Roosevelt Ave., Quezon City', 9283459014, 'santinoroque@yahoo.com', 'Quezon City'),
(8, 'C0008', 'Flores', 'Edmundo', 'Delos Reyes', 'Male', '1971-06-07', 'Married', '1 Diego Cera Avenue, Las Piñas', 9556793201, 'edmundoflores@yahoo.com', 'Muntinlupa');

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
(1, 'A0001', 'C0001', '2020-04-27 09:09:31', 10000, 5000, 15000);

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
(1, '2020-04-27 09:47:52', 'A0001', 'C0001', 'A0002', 'C0002', 1000, 15000, 60, 13940, 20000, 75, 20925),
(2, '2020-04-27 10:02:45', 'A0001', 'C0001', 'A0002', 'C0002', 1000, 13940, 60, 12880, 20925, 75, 21850);

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
(1, 'A0002', 'C0002', '2020-04-27 09:19:02', 25000, 5000, 20000);

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
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

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
-- AUTO_INCREMENT for table `deposit`
--
ALTER TABLE `deposit`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `transfer`
--
ALTER TABLE `transfer`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `withdraw`
--
ALTER TABLE `withdraw`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
