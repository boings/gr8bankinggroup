-- MySQL dump 10.13  Distrib 8.0.22, for Linux (x86_64)
--
-- Host: localhost    Database: Gr8BankingGroup
-- ------------------------------------------------------
-- Server version	8.0.22-0ubuntu0.20.04.3

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Account`
--

DROP TABLE IF EXISTS `Account`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Account` (
  `id` int NOT NULL,
  `owner_id` int NOT NULL,
  `balance` double DEFAULT NULL,
  `interest_rate` double DEFAULT NULL,
  `type` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `Account_UN` (`owner_id`),
  CONSTRAINT `Account_FK` FOREIGN KEY (`owner_id`) REFERENCES `Customer` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Account`
--

LOCK TABLES `Account` WRITE;
/*!40000 ALTER TABLE `Account` DISABLE KEYS */;
/*!40000 ALTER TABLE `Account` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Credit_Card`
--

DROP TABLE IF EXISTS `Credit_Card`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Credit_Card` (
  `CCNumber` int NOT NULL,
  `customer_id` int NOT NULL,
  `issuer_id` int DEFAULT NULL,
  `limit` double DEFAULT NULL,
  `date_requested` date DEFAULT NULL,
  `date_verdict` date DEFAULT NULL,
  `date_expiration` date DEFAULT NULL,
  `Region` varchar(100) DEFAULT NULL,
  `Status` varchar(100) DEFAULT NULL,
  `Type` varchar(100) DEFAULT NULL,
  `Statements` varchar(100) DEFAULT NULL,
  `payment_history` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`CCNumber`),
  UNIQUE KEY `CCNUmber` (`CCNumber`),
  UNIQUE KEY `Credit_Card_UN` (`customer_id`,`issuer_id`),
  KEY `Credit_Card_FK_1` (`issuer_id`),
  CONSTRAINT `Credit_Card_FK` FOREIGN KEY (`customer_id`) REFERENCES `Customer` (`user_id`),
  CONSTRAINT `Credit_Card_FK_1` FOREIGN KEY (`issuer_id`) REFERENCES `head_credit` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Credit_Card`
--

LOCK TABLES `Credit_Card` WRITE;
/*!40000 ALTER TABLE `Credit_Card` DISABLE KEYS */;
/*!40000 ALTER TABLE `Credit_Card` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Customer`
--

DROP TABLE IF EXISTS `Customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Customer` (
  `user_id` int NOT NULL,
  `billing_address` varchar(100) NOT NULL,
  `Profession` varchar(100) NOT NULL,
  `Classification` varchar(100) DEFAULT NULL,
  `DOB` date DEFAULT NULL,
  `Sex` char(1) DEFAULT NULL,
  `region` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`user_id`),
  CONSTRAINT `Customer_FK` FOREIGN KEY (`user_id`) REFERENCES `User` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Customer`
--

LOCK TABLES `Customer` WRITE;
/*!40000 ALTER TABLE `Customer` DISABLE KEYS */;
/*!40000 ALTER TABLE `Customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Loan`
--

DROP TABLE IF EXISTS `Loan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Loan` (
  `id` int NOT NULL,
  `issuer_id` int NOT NULL,
  `customer_id` int NOT NULL,
  `amount` double DEFAULT NULL,
  `interest` double DEFAULT NULL,
  `loan_received` date DEFAULT NULL,
  `status` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `Loan_UN` (`issuer_id`,`customer_id`),
  KEY `Loan_FK_1` (`customer_id`),
  CONSTRAINT `Loan_FK` FOREIGN KEY (`issuer_id`) REFERENCES `head_loan` (`user_id`),
  CONSTRAINT `Loan_FK_1` FOREIGN KEY (`customer_id`) REFERENCES `Customer` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Loan`
--

LOCK TABLES `Loan` WRITE;
/*!40000 ALTER TABLE `Loan` DISABLE KEYS */;
/*!40000 ALTER TABLE `Loan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Purchase`
--

DROP TABLE IF EXISTS `Purchase`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Purchase` (
  `cc_number` int NOT NULL,
  `amount` double DEFAULT NULL,
  `date` date DEFAULT NULL,
  `type` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`cc_number`),
  CONSTRAINT `Purchase_FK` FOREIGN KEY (`cc_number`) REFERENCES `Credit_Card` (`CCNumber`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Purchase`
--

LOCK TABLES `Purchase` WRITE;
/*!40000 ALTER TABLE `Purchase` DISABLE KEYS */;
/*!40000 ALTER TABLE `Purchase` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `User`
--

DROP TABLE IF EXISTS `User`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `User` (
  `id` int NOT NULL AUTO_INCREMENT,
  `Name` varchar(100) NOT NULL,
  `Password` varchar(100) NOT NULL,
  `Role` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `User`
--

LOCK TABLES `User` WRITE;
/*!40000 ALTER TABLE `User` DISABLE KEYS */;
/*!40000 ALTER TABLE `User` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bank_manager`
--

DROP TABLE IF EXISTS `bank_manager`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bank_manager` (
  `user_id` int NOT NULL,
  PRIMARY KEY (`user_id`),
  CONSTRAINT `bank_manager_FK` FOREIGN KEY (`user_id`) REFERENCES `User` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bank_manager`
--

LOCK TABLES `bank_manager` WRITE;
/*!40000 ALTER TABLE `bank_manager` DISABLE KEYS */;
/*!40000 ALTER TABLE `bank_manager` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `head_credit`
--

DROP TABLE IF EXISTS `head_credit`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `head_credit` (
  `user_id` int NOT NULL,
  UNIQUE KEY `head_credit_UN` (`user_id`),
  CONSTRAINT `head_credit_FK` FOREIGN KEY (`user_id`) REFERENCES `User` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `head_credit`
--

LOCK TABLES `head_credit` WRITE;
/*!40000 ALTER TABLE `head_credit` DISABLE KEYS */;
/*!40000 ALTER TABLE `head_credit` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `head_loan`
--

DROP TABLE IF EXISTS `head_loan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `head_loan` (
  `user_id` int NOT NULL,
  UNIQUE KEY `head_loan_UN` (`user_id`),
  CONSTRAINT `head_loan_FK` FOREIGN KEY (`user_id`) REFERENCES `User` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `head_loan`
--

LOCK TABLES `head_loan` WRITE;
/*!40000 ALTER TABLE `head_loan` DISABLE KEYS */;
/*!40000 ALTER TABLE `head_loan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'Gr8BankingGroup'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-12-30 14:02:06