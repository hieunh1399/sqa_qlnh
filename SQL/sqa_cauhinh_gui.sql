-- MySQL dump 10.13  Distrib 8.0.21, for macos10.15 (x86_64)
--
-- Host: 127.0.0.1    Database: sqa
-- ------------------------------------------------------
-- Server version	8.0.25

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
-- Table structure for table `cauhinh_gui`
--

DROP TABLE IF EXISTS `cauhinh_gui`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cauhinh_gui` (
  `Id` int NOT NULL AUTO_INCREMENT,
  `HinhThucGui` varchar(45) CHARACTER SET latin1 COLLATE latin1_swedish_ci DEFAULT NULL,
  `SoTienGuiToiThieu` float DEFAULT NULL,
  `KyHan` int DEFAULT NULL,
  `PhuongThucTraLai` varchar(45) CHARACTER SET latin1 COLLATE latin1_swedish_ci DEFAULT NULL,
  `LaiSuat` float DEFAULT NULL,
  `SoTienLai` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci DEFAULT NULL,
  `DonViTienTe` varchar(45) CHARACTER SET latin1 COLLATE latin1_swedish_ci DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cauhinh_gui`
--

LOCK TABLES `cauhinh_gui` WRITE;
/*!40000 ALTER TABLE `cauhinh_gui` DISABLE KEYS */;
INSERT INTO `cauhinh_gui` VALUES (1,'Co ky han',1000000,6,'Tra lai cuoi ky',0.005,'So tien gui * Lai suat * Ky han','VND'),(2,'Tiet kiem huu tri',100000,24,'Tra lai cuoi ky',0.006,'So tien gui * Lai suat * Ky han','VND'),(3,'Khong ki han',230000000,12,'Tra lai cuoi ki',0.0055,'So tien gui * Lai suat * Ky han','VND'),(4,'Bac thang',1500000,6,'Tra lai cuoi ki',0.005,'So tien gui * Lai suat * Ky han','VND'),(5,'Tra lai dinh ki',2500000,9,'Tra lai cuoi ki',0.006,'So tien gui * Lai suat * Ky han','VND'),(6,'Tra lai truoc',3600000,1,'Tra lai cuoi ki',0.0065,'So tien gui * Lai suat * Ky han','VND'),(7,'Luy tien',8900000,3,'Tra lai cuoi ki',0.007,'So tien gui * Lai suat * Ky han','VND');
/*!40000 ALTER TABLE `cauhinh_gui` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-06-01 14:43:24
