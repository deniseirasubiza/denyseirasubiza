-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 19, 2024 at 11:24 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `denyse_irasubiza_btms`
--

-- --------------------------------------------------------

--
-- Table structure for table `anotherview`
--

CREATE TABLE `anotherview` (
  `userid` int(11) DEFAULT NULL,
  `username` varchar(40) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `fullname` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `phonenumber` int(11) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `payment` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `booking`
--

CREATE TABLE `booking` (
  `id` int(10) NOT NULL,
  `userid` int(15) NOT NULL,
  `eventid` int(30) DEFAULT NULL,
  `bookingdateandtime` date DEFAULT NULL,
  `numberofticket` int(11) DEFAULT NULL,
  `totalprice` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `booking`
--

INSERT INTO `booking` (`id`, `userid`, `eventid`, `bookingdateandtime`, `numberofticket`, `totalprice`) VALUES
(5, 1, 5, '2023-09-21', 8, 50000),
(4, 2, 4, '2023-07-26', 6, 10000),
(3, 3, 1, '2023-07-26', 4, 20000),
(7, 8, 9, '2024-04-09', 32, 123),
(20, 14, 13, '2024-11-12', 12, 123),
(1, 5, 3, '2023-09-11', 1, 1000),
(14, 14, 12, '2024-12-12', 35432, 123),
(16, 8, 7, '2024-09-09', 2, 123),
(5, 1, 5, '2023-09-21', 8, 50000),
(4, 2, 4, '2023-07-26', 6, 10000),
(3, 3, 1, '2023-07-26', 4, 20000),
(1, 5, 3, '2023-02-12', 10, 10000),
(7, 8, 9, '2024-04-09', 32, 123);

-- --------------------------------------------------------

--
-- Table structure for table `event`
--

CREATE TABLE `event` (
  `eventid` int(11) NOT NULL,
  `eventname` varchar(40) DEFAULT NULL,
  `eventdate` date DEFAULT NULL,
  `eventtime` int(11) DEFAULT NULL,
  `eventlocation` varchar(30) DEFAULT NULL,
  `eventdescription` varchar(50) DEFAULT NULL,
  `eventcapacity` varchar(30) DEFAULT NULL,
  `ticketprice` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `event`
--

INSERT INTO `event` (`eventid`, `eventname`, `eventdate`, `eventtime`, `eventlocation`, `eventdescription`, `eventcapacity`, `ticketprice`) VALUES
(1, 'musicfestival', '2023-03-12', 3, 'arena', 'harmonyfest2023', '100peaple', 10000),
(2, 'sport', '2023-08-22', 7, 'stadeumuganda', 'championlegue', '1000peaple', 20000),
(3, 'conference', '2023-01-02', 1, 'rusizi', 'innovativeandcreativity', '1000peaple', 10000),
(4, 'expo', '2023-01-02', 1, 'kigali', 'fashion', '2000peaple', 1000),
(5, 'gospel', '2022-01-02', 1, 'gisenyi', 'praiseandworship', '200peaple', 10000),
(12, 'ghjk', '2024-09-09', 9, 'ghj', 'ghjk', '98', 9),
(20, 'kdgt', '2024-09-09', 5, 'kjhgfd', 'hgfds', '45peaple', 456),
(12, 'sdfgh', '2024-09-09', 4, 'sdfghj', 'dfghj', '4', 56),
(13, 'sdfgh', '2024-12-12', 3, 'sdfgh', 'dfghj', '12p', 123),
(1, 'musicfestival', '2023-03-12', 3, 'arena', 'harmonyfest2023', '100peaple', 10000),
(2, 'sport', '2023-08-22', 7, 'stadeumuganda', 'championlegue', '1000peaple', 20000),
(3, 'conference', '2023-01-02', 1, 'rusizi', 'innovativeandcreativity', '1000peaple', 10000),
(4, 'expo', '2023-01-02', 1, 'kigali', 'fashion', '2000peaple', 1000),
(5, 'gospel', '2022-01-02', 1, 'gisenyi', 'praiseandworship', '200peaple', 10000),
(12, 'ghjk', '2024-09-09', 9, 'ghj', 'ghjk', '98', 9);

-- --------------------------------------------------------

--
-- Table structure for table `newview`
--

CREATE TABLE `newview` (
  `userid` int(11) DEFAULT NULL,
  `username` varchar(40) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `fullname` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `phonenumber` int(11) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `payment` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `notification`
--

CREATE TABLE `notification` (
  `notificationid` int(11) NOT NULL,
  `userid` int(11) DEFAULT NULL,
  `notificationtype` varchar(30) DEFAULT NULL,
  `notificationmessage` varchar(50) DEFAULT NULL,
  `notificationdateandtime` date DEFAULT NULL,
  `notificationstatus` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `notification`
--

INSERT INTO `notification` (`notificationid`, `userid`, `notificationtype`, `notificationmessage`, `notificationdateandtime`, `notificationstatus`) VALUES
(2, 4, 'failed', 'cancelled', '1998-06-13', 'unread'),
(3, 3, 'failed', 'cancelled', '1998-06-13', 'unread'),
(4, 2, 'successful', 'completed', '1998-08-13', 'read'),
(15, 12, 'dfgh', 'dfgh', '2024-09-12', 'fghj'),
(1, 2, 'hgfd', 'jhgfd', '2024-09-09', 'jhgfd'),
(1, 5, 'bookingconfirmed', 'booking', '1999-06-03', 'read'),
(2, 4, 'failed', 'cancelled', '1998-06-13', 'unread'),
(3, 3, 'failed', 'cancelled', '1998-06-13', 'unread'),
(4, 2, 'successful', 'completed', '1998-08-13', 'read'),
(15, 16, 'fghj', 'frghjk', '2024-09-09', 'sdfgh');

--
-- Triggers `notification`
--
DELIMITER $$
CREATE TRIGGER `AfterUpdatenotification` AFTER UPDATE ON `notification` FOR EACH ROW BEGIN
    INSERT INTO notification (notificationid, userid,notificationtype,notificationmessage ,notificationDateTime, notificationstatus)
    VALUES (NEW.notificationid, 'notification Updated', NOW(), INET6_ATON('127.0.0.1'));
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `notificationview`
--

CREATE TABLE `notificationview` (
  `notificationid` int(11) DEFAULT NULL,
  `userid` int(11) DEFAULT NULL,
  `notificationtype` varchar(30) DEFAULT NULL,
  `notificationmessage` varchar(50) DEFAULT NULL,
  `notificationdateandtime` date DEFAULT NULL,
  `notificationstatus` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `organizer`
--

CREATE TABLE `organizer` (
  `organizerid` int(11) NOT NULL,
  `organizername` varchar(50) DEFAULT NULL,
  `organizercontactinformation` int(11) DEFAULT NULL,
  `organizerevents` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `organizer`
--

INSERT INTO `organizer` (`organizerid`, `organizername`, `organizercontactinformation`, `organizerevents`) VALUES
(6, 'gedeon', 789053258, 'sport'),
(7, 'prince', 789054258, 'conference'),
(8, 'peace', 789054218, 'festival'),
(9, 'fred', 788954218, 'expo'),
(10, 'sunrise', 788954212, 'gospel'),
(6, 'gedeon', 789053258, 'sport'),
(7, 'prince', 789054258, 'conference'),
(8, 'peace', 789054218, 'festival'),
(9, 'fred', 788954218, 'expo'),
(10, 'sunrise', 788954212, 'gospel');

-- --------------------------------------------------------

--
-- Table structure for table `organizerview`
--

CREATE TABLE `organizerview` (
  `organizerid` int(11) DEFAULT NULL,
  `organizername` varchar(50) DEFAULT NULL,
  `organizercontactinformation` int(11) DEFAULT NULL,
  `organizerevents` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `payment`
--

CREATE TABLE `payment` (
  `paymentid` int(11) NOT NULL,
  `bookingid` int(11) DEFAULT NULL,
  `paymentdateandtime` date DEFAULT NULL,
  `paymentamount` int(11) DEFAULT NULL,
  `paymentmethod` varchar(30) DEFAULT NULL,
  `transactionstatus` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `payment`
--

INSERT INTO `payment` (`paymentid`, `bookingid`, `paymentdateandtime`, `paymentamount`, `paymentmethod`, `transactionstatus`) VALUES
(1, 2, '2022-09-13', 600, 'creditcard', 'successful'),
(2, 3, '2000-09-15', 200, 'momopay', 'failed'),
(3, 4, '2009-07-29', 500, 'mocash', 'pending'),
(4, 5, '2008-06-28', 100, 'creditcard', 'failed'),
(5, 1, '2008-08-08', 2000, 'momopay', 'pending'),
(23, 12, '2012-09-09', 1200, 'momo', 'paying'),
(12, 13, '2024-09-12', 1234, 'hgfds', 'jnbvcxz'),
(1, 2, '2022-09-13', 600, 'creditcard', 'successful'),
(2, 3, '2000-09-15', 200, 'momopay', 'failed'),
(3, 4, '2009-07-29', 500, 'mocash', 'pending'),
(4, 5, '2008-06-28', 100, 'creditcard', 'failed'),
(5, 1, '2008-08-08', 2000, 'momopay', 'pending'),
(23, 12, '2012-09-09', 1200, 'momo', 'paying');

--
-- Triggers `payment`
--
DELIMITER $$
CREATE TRIGGER `AfterDeletepayment` AFTER DELETE ON `payment` FOR EACH ROW BEGIN
    INSERT INTO payment (paymentid, bookingid, paymentDateandTime,paymentamount,paymentmethod, transactionstatus)
    VALUES (OLD.paymentid, 'payment Deleted', NOW(), INET6_ATON('127.0.0.1'));
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `paymentview`
--

CREATE TABLE `paymentview` (
  `paymentid` int(11) DEFAULT NULL,
  `bookingid` int(11) DEFAULT NULL,
  `paymentdateandtime` date DEFAULT NULL,
  `paymentamount` int(11) DEFAULT NULL,
  `paymentmethod` varchar(30) DEFAULT NULL,
  `transactionstatus` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `report`
--

CREATE TABLE `report` (
  `reportid` int(11) NOT NULL,
  `reporttype` varchar(50) DEFAULT NULL,
  `reportgenerationdateandtime` date DEFAULT NULL,
  `reportcontent` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `report`
--

INSERT INTO `report` (`reportid`, `reporttype`, `reportgenerationdateandtime`, `reportcontent`) VALUES
(6, 'salesreport', '2000-08-09', 'financialreport'),
(7, 'attendance', '2009-06-07', 'projectstatusreport'),
(8, 'salesreport', '2019-06-07', 'marketresearchreport'),
(9, 'salesreport', '2019-06-07', 'employesperformancereport'),
(12, 'hgfd', '2024-09-09', 'hg'),
(6, 'salesreport', '2000-08-09', 'financialreport'),
(7, 'attendance', '2009-06-07', 'projectstatusreport'),
(8, 'salesreport', '2019-06-07', 'marketresearchreport'),
(9, 'salesreport', '2019-06-07', 'employesperformancereport'),
(12, 'hgfd', '2024-09-09', 'hg');

-- --------------------------------------------------------

--
-- Table structure for table `reportview`
--

CREATE TABLE `reportview` (
  `reportid` int(11) DEFAULT NULL,
  `reporttype` varchar(50) DEFAULT NULL,
  `reportgenerationdateandtime` date DEFAULT NULL,
  `reportcontent` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `review`
--

CREATE TABLE `review` (
  `reviewid` int(11) NOT NULL,
  `usedid` int(11) DEFAULT NULL,
  `eventid` int(11) DEFAULT NULL,
  `reviewtext` varchar(30) DEFAULT NULL,
  `rating` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `review`
--

INSERT INTO `review` (`reviewid`, `usedid`, `eventid`, `reviewtext`, `rating`) VALUES
(1, 5, 2, 'positivereview', 1),
(2, 4, 4, 'negativereview', 0),
(3, 3, 1, 'neutralreview', 1),
(4, 2, 5, 'shortandpositiveereview', 1),
(5, 1, 3, 'positiveereview', 1);

--
-- Triggers `review`
--
DELIMITER $$
CREATE TRIGGER `AfterInsertreview` AFTER INSERT ON `review` FOR EACH ROW BEGIN
    INSERT INTO review (reviewid, usedid, eventid, reviewtext, rating)
    VALUES (NULL, 'New review Added', CONCAT('review ', ' has been added.'), NOW(), 'Unread');
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `reviewview`
--

CREATE TABLE `reviewview` (
  `reviewid` int(11) DEFAULT NULL,
  `usedid` int(11) DEFAULT NULL,
  `eventid` int(11) DEFAULT NULL,
  `reviewtext` varchar(30) DEFAULT NULL,
  `rating` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `ticket`
--

CREATE TABLE `ticket` (
  `ticketid` int(11) NOT NULL,
  `tickettype` varchar(50) DEFAULT NULL,
  `eventid` int(11) DEFAULT NULL,
  `seatnumber` int(11) DEFAULT NULL,
  `ticketprice` int(11) DEFAULT NULL,
  `purchasedate` date DEFAULT NULL,
  `ticketstatus` varchar(50) DEFAULT NULL,
  `userid` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `ticket`
--

INSERT INTO `ticket` (`ticketid`, `tickettype`, `eventid`, `seatnumber`, `ticketprice`, `purchasedate`, `ticketstatus`, `userid`) VALUES
(1, 'vip', 3, 9, 30000, '2023-10-10', 'booked', 5),
(2, 'generaladmission', 2, 8, 20000, '2023-05-12', 'cancelled', 4),
(3, 'general', 2, 8, 10000, '2023-08-22', 'sold', 3),
(4, 'vip', 1, 6, 30000, '2023-02-23', 'cancelled', 2),
(5, 'general', 5, 5, 10000, '2023-01-23', 'booked', 1),
(1, 'vip', 3, 9, 30000, '2023-10-10', 'booked', 5),
(2, 'generaladmission', 2, 8, 20000, '2023-05-12', 'cancelled', 4),
(3, 'general', 2, 8, 10000, '2023-08-22', 'sold', 3),
(4, 'vip', 1, 6, 30000, '2023-02-23', 'cancelled', 2),
(5, 'general', 5, 5, 10000, '2023-01-23', 'booked', 1);

--
-- Triggers `ticket`
--
DELIMITER $$
CREATE TRIGGER `AfterUpdateticket` AFTER UPDATE ON `ticket` FOR EACH ROW BEGIN
    INSERT INTO ticket (ticketid, tickettype,eventid,seatnumber ,ticketprice,purchasedate,ticketstatus,userid)
    VALUES (NEW.ticketid, 'ticket Updated', NOW(), INET6_ATON('127.0.0.1'));
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `ticketview`
--

CREATE TABLE `ticketview` (
  `ticketid` int(11) DEFAULT NULL,
  `tickettype` varchar(50) DEFAULT NULL,
  `eventid` int(11) DEFAULT NULL,
  `seatnumber` int(11) DEFAULT NULL,
  `ticketprice` int(11) DEFAULT NULL,
  `purchasedate` date DEFAULT NULL,
  `ticketstatus` varchar(50) DEFAULT NULL,
  `userid` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `transaction`
--

CREATE TABLE `transaction` (
  `transactionid` int(11) NOT NULL,
  `userid` int(11) DEFAULT NULL,
  `transactiontype` varchar(50) DEFAULT NULL,
  `transactiondateandtime` date DEFAULT NULL,
  `transactionamount` int(11) DEFAULT NULL,
  `transactionstatus` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `transaction`
--

INSERT INTO `transaction` (`transactionid`, `userid`, `transactiontype`, `transactiondateandtime`, `transactionamount`, `transactionstatus`) VALUES
(6, 1, 'ticketpurchased', '2000-02-12', 500, 'completed'),
(7, 2, 'refund', '2002-09-22', 50, 'onhold'),
(8, 3, 'ticketpurchased', '2007-07-30', 1000, 'pending'),
(9, 4, 'ticketpurchased', '2009-09-14', 100, 'failed'),
(10, 5, 'refund', '2009-12-24', 123, 'completed'),
(6, 1, 'ticketpurchased', '2000-02-12', 500, 'completed'),
(7, 2, 'refund', '2002-09-22', 50, 'onhold'),
(8, 3, 'ticketpurchased', '2007-07-30', 1000, 'pending'),
(9, 4, 'ticketpurchased', '2009-09-14', 100, 'failed'),
(10, 5, 'refund', '2009-12-24', 123, 'completed');

--
-- Triggers `transaction`
--
DELIMITER $$
CREATE TRIGGER `AfterDeletetransaction` AFTER DELETE ON `transaction` FOR EACH ROW BEGIN
    INSERT INTO transaction (transactionid, userid,transactiontype,transactionDateandTime,transactionamount,transactionstatus)
    VALUES (OLD.transactionid, 'transaction Deleted', NOW(), INET6_ATON('127.0.0.1'));
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `transactionview`
--

CREATE TABLE `transactionview` (
  `transactionid` int(11) DEFAULT NULL,
  `userid` int(11) DEFAULT NULL,
  `transactiontype` varchar(50) DEFAULT NULL,
  `transactiondateandtime` date DEFAULT NULL,
  `transactionamount` int(11) DEFAULT NULL,
  `transactionstatus` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `update_user_information`
--

CREATE TABLE `update_user_information` (
  `userid` int(11) DEFAULT NULL,
  `username` varchar(40) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `fullname` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `phonenumber` int(11) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `payment` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `userid` int(11) NOT NULL,
  `username` varchar(40) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `fullname` varchar(50) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `phonenumber` int(11) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `payment` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`userid`, `username`, `password`, `fullname`, `email`, `phonenumber`, `address`, `payment`) VALUES
(1, 'aline', 'abayisenga', 'abayisengaaline', 'aline@gmail.com', 798989898, 'kigali', 1000),
(2, 'noella', 'uwera', 'uweranoella', 'uwera@gmail.com', 798989898, 'gisenyi', 2000),
(3, 'queen', 'ishimwe', 'ishimwefideline', 'ishimwe@gmail.com', 798989898, 'gicumbi', 5000),
(4, 'fred', 'mugisha', 'mugishafred', 'mugisha@gmail.com', 798989348, 'mainstreet', 6000),
(5, 'penuel', 'irumva', 'irumvapenuel', 'irumva@gmail.com', 712389348, 'bujumburra', 4000);

--
-- Triggers `user`
--
DELIMITER $$
CREATE TRIGGER `AfterInsertyuser` AFTER INSERT ON `user` FOR EACH ROW BEGIN
    INSERT INTO AuditLog (Userid, username, password, fullname,email,phonenumber,address,payment)
    VALUES (NEW.userid, 'New user Added', NOW(), INET6_ATON('127.0.0.1'));
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(11) DEFAULT NULL,
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(50) NOT NULL,
  `fullname` varchar(50) NOT NULL,
  `email` varchar(25) NOT NULL,
  `phonenumber` int(12) NOT NULL,
  `address` varchar(50) NOT NULL,
  `payment` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `username`, `password`, `fullname`, `email`, `phonenumber`, `address`, `payment`) VALUES
(6, 'ytre', 'jhgfd', 'uhgfd', 'gfds@gmail.com', 76543, 'jhgfd', 5432),
(2, 'denyse', 'irasubiza', 'irasubza denyse', 'denyse@gmail.com', 76543, 'kgl', 123),
(9, 'sunrise', 'ishimwe', 'ishimwe sunrise', 'sun@gmail.com', 7654356, 'gsny', 236),
(6, 'sdfghj', 'dfghjk', 'dfghjk', 'sdfg@gmail.com', 23456, 'qwertyu', 123),
(6, 'sdfghj', 'dfghjk', 'dfghjk', 'sdfg@gmail.com', 23456, 'qwertyu', 123),
(4, 'penuel', 'irumva', 'irumva penuel', 'penuel@gmail.com', 6543, 'kgl', 234),
(6, 'munyana', 'christella', 'munyana christella', 'munyana@gmail.com', 987654, 'huye', 234),
(12, 'frank', 'breez', 'frank breez', 'frank@gmail.com', 76543, 'musanze', 123);

-- --------------------------------------------------------

--
-- Table structure for table `venue`
--

CREATE TABLE `venue` (
  `venueid` int(11) NOT NULL,
  `venuename` varchar(50) DEFAULT NULL,
  `venueaddress` varchar(40) DEFAULT NULL,
  `venuecapacity` varchar(30) DEFAULT NULL,
  `venuefacilities` varchar(40) DEFAULT NULL,
  `venuecontactinformation` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
