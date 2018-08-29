-- MySQL dump 10.13  Distrib 5.7.17, for macos10.12 (x86_64)
--
-- Host: localhost    Database: jsondb
-- ------------------------------------------------------
-- Server version	5.5.5-10.1.25-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `match_result`
--

DROP TABLE IF EXISTS `match_result`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `match_result` (
  `id` bigint(20) NOT NULL,
  `alternate_name` varchar(255) DEFAULT NULL,
  `country` varchar(255) DEFAULT NULL,
  `draws` int(11) NOT NULL,
  `fifa_code` varchar(255) DEFAULT NULL,
  `games_played` int(11) NOT NULL,
  `goal_differential` int(11) NOT NULL,
  `goals_against` int(11) NOT NULL,
  `goals_for` int(11) NOT NULL,
  `group_id` int(11) NOT NULL,
  `group_letter` varchar(255) DEFAULT NULL,
  `losses` int(11) NOT NULL,
  `points` int(11) NOT NULL,
  `wins` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `match_result`
--

LOCK TABLES `match_result` WRITE;
/*!40000 ALTER TABLE `match_result` DISABLE KEYS */;
INSERT INTO `match_result` VALUES (1,NULL,'Russia',0,'RUS',2,7,1,8,1,'A',0,6,2),(2,NULL,'Saudi Arabia',0,'KSA',2,-6,6,0,1,'A',2,0,0),(3,NULL,'Egypt',0,'EGY',2,-3,4,1,1,'A',2,0,0),(4,NULL,'Uruguay',0,'URU',2,2,0,2,1,'A',0,6,2),(5,NULL,'Portugal',1,'POR',2,1,3,4,2,'B',0,4,1),(6,NULL,'Spain',1,'ESP',2,1,3,4,2,'B',0,4,1),(7,NULL,'Morocco',0,'MAR',2,-2,2,0,2,'B',2,0,0),(8,NULL,'Iran',0,'IRN',2,0,1,1,2,'B',1,3,1),(9,NULL,'France',0,'FRA',1,1,1,2,3,'C',0,3,1),(10,NULL,'Australia',0,'AUS',1,-1,2,1,3,'C',1,0,0),(11,NULL,'Peru',0,'PER',1,-1,1,0,3,'C',1,0,0),(12,NULL,'Denmark',0,'DEN',1,1,0,1,3,'C',0,3,1),(13,NULL,'Argentina',1,'ARG',1,0,1,1,4,'D',0,1,0),(14,NULL,'Iceland',1,'ISL',1,0,1,1,4,'D',0,1,0),(15,NULL,'Croatia',0,'CRO',1,2,0,2,4,'D',0,3,1),(16,NULL,'Nigeria',0,'NGA',1,-2,2,0,4,'D',1,0,0),(17,NULL,'Brazil',1,'BRA',1,0,1,1,5,'E',0,1,0),(18,NULL,'Switzerland',1,'SUI',1,0,1,1,5,'E',0,1,0),(19,NULL,'Costa Rica',0,'CRC',1,-1,1,0,5,'E',1,0,0),(20,NULL,'Serbia',0,'SRB',1,1,0,1,5,'E',0,3,1),(21,NULL,'Germany',0,'GER',1,-1,1,0,6,'F',1,0,0),(22,NULL,'Mexico',0,'MEX',1,1,0,1,6,'F',0,3,1),(23,NULL,'Sweden',0,'SWE',1,1,0,1,6,'F',0,3,1),(24,NULL,'Korea Republic',0,'KOR',1,-1,1,0,6,'F',1,0,0),(25,NULL,'Belgium',0,'BEL',1,3,0,3,7,'G',0,3,1),(26,NULL,'Panama',0,'PAN',1,-3,3,0,7,'G',1,0,0),(27,NULL,'Tunisia',0,'TUN',1,-1,2,1,7,'G',1,0,0),(28,NULL,'England',0,'ENG',1,1,1,2,7,'G',0,3,1),(29,NULL,'Poland',0,'POL',1,-1,2,1,8,'H',1,0,0),(30,NULL,'Senegal',0,'SEN',1,1,1,2,8,'H',0,3,1),(31,NULL,'Colombia',0,'COL',1,-1,2,1,8,'H',1,0,0),(32,NULL,'Japan',0,'JPN',1,1,1,2,8,'H',0,3,1);
/*!40000 ALTER TABLE `match_result` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-08-29 17:21:33
