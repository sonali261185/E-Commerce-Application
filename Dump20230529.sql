-- MySQL dump 10.13  Distrib 8.0.23, for Win64 (x86_64)
--
-- Host: localhost    Database: onlineshopping
-- ------------------------------------------------------
-- Server version	5.7.33-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `cart`
--

DROP TABLE IF EXISTS `cart`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cart` (
  `pid1` int(11) DEFAULT NULL,
  `pname1` varchar(255) DEFAULT NULL,
  `pdep1` varchar(255) DEFAULT NULL,
  `qpur1` int(11) DEFAULT NULL,
  `qprice1` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cart`
--

LOCK TABLES `cart` WRITE;
/*!40000 ALTER TABLE `cart` DISABLE KEYS */;
INSERT INTO `cart` VALUES (103,'Redmi 12 C','6.71 inch HD+Display',8799,1),(103,'Redmi 12 C','6.71 inch HD+Display',8799,1),(104,'Alexandre christie Ac 3039 MAB Mech',' Atomatic Watch for Men',38895,1),(104,'Alexandre christie Ac 3039 MAB Mech',' Atomatic Watch for Men',38895,1),(102,'one plues Mobile','16 gb RAM',34000,1),(107,'LG Machine','5 star 356 liter capacity',33500,1),(107,'LG Machine','5 star 356 liter capacity',33500,1),(106,'lenovo laptop','intel core i3-1115G4 8 gb/256 GB SSD',33990,1),(105,'Casio','Mens Watch',1695,1),(105,'Casio','Mens Watch',1,1695);
/*!40000 ALTER TABLE `cart` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product_details`
--

DROP TABLE IF EXISTS `product_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `product_details` (
  `contain_id` int(11) NOT NULL,
  `PName` varchar(255) DEFAULT NULL,
  `Description` varchar(255) DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL,
  PRIMARY KEY (`contain_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product_details`
--

LOCK TABLES `product_details` WRITE;
/*!40000 ALTER TABLE `product_details` DISABLE KEYS */;
INSERT INTO `product_details` VALUES (101,'Apple MackBook 2020',' 8 gb Ram,256 SSD',89000,88996),(102,'one plues Mobile','16 gb RAM',34000,2),(103,'Redmi 12 C','6.71 inch HD+Display',8799,1),(104,'Alexandre christie Ac 3039 MAB Mech',' Atomatic Watch for Men',38895,0),(105,'Casio','Mens Watch',1695,5),(106,'lenovo laptop','intel core i3-1115G4 8 gb/256 GB SSD',33990,9),(107,'LG Machine','5 star 356 liter capacity',33500,1),(109,'mobile','vivo',45000,5),(110,'mobile','redmi 5',67000,6);
/*!40000 ALTER TABLE `product_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `userdetails`
--

DROP TABLE IF EXISTS `userdetails`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `userdetails` (
  `useremailid` varchar(45) NOT NULL,
  `userfirstname` varchar(45) DEFAULT NULL,
  `userlastname` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `mobileno` varchar(45) DEFAULT NULL,
  `city` varchar(45) DEFAULT NULL,
  `Username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`useremailid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `userdetails`
--

LOCK TABLES `userdetails` WRITE;
/*!40000 ALTER TABLE `userdetails` DISABLE KEYS */;
INSERT INTO `userdetails` VALUES ('fc','fh','g','cg13','124576325','amt',NULL),('ompatil2@gmail.com','ram','kale','root','7456251421','amt',NULL),('priya@gmail.com','priya','munde','Pass@12','8765439834','pune',NULL),('ramj32@gmail.com','ram','kale','r1234556@','7854251245','nag',NULL),('riya@123','riya','munde','Pass@1234','2345678909','pune','riya12'),('shwetajawanjal3@gmail.com','shweta','gawande','root','8406063448','aug',NULL);
/*!40000 ALTER TABLE `userdetails` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `userinfo`
--

DROP TABLE IF EXISTS `userinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `userinfo` (
  `id` int(11) NOT NULL,
  `firstname` varchar(255) DEFAULT NULL,
  `lastname` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `pass_word` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `mail_id` varchar(255) DEFAULT NULL,
  `mobilenumber` mediumtext,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `userinfo`
--

LOCK TABLES `userinfo` WRITE;
/*!40000 ALTER TABLE `userinfo` DISABLE KEYS */;
/*!40000 ALTER TABLE `userinfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `userlogin`
--

DROP TABLE IF EXISTS `userlogin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `userlogin` (
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `userlogin`
--

LOCK TABLES `userlogin` WRITE;
/*!40000 ALTER TABLE `userlogin` DISABLE KEYS */;
INSERT INTO `userlogin` VALUES ('om','om123@'),('bhu','bhu'),('fdg','fh'),('riya12','Pass@1234'),('siya','Pass@123'),('riya12','Pass@1234');
/*!40000 ALTER TABLE `userlogin` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-05-29  0:06:03
