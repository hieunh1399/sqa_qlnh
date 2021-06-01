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
-- Table structure for table `cauhinh_vay`
--

DROP TABLE IF EXISTS `cauhinh_vay`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cauhinh_vay` (
  `Id` int NOT NULL AUTO_INCREMENT,
  `HinhThucVay` varchar(45) CHARACTER SET latin1 COLLATE latin1_swedish_ci DEFAULT NULL,
  `SoTienVayToiDa` float DEFAULT NULL,
  `ThoiHanVayToiDa` int DEFAULT NULL,
  `LaiSuat` float DEFAULT NULL,
  `SoTienPhaiTraLai` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci DEFAULT NULL,
  `TongSoTienPhaiTra` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci DEFAULT NULL,
  `DonViTienTe` varchar(45) CHARACTER SET latin1 COLLATE latin1_swedish_ci DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cauhinh_vay`
--

LOCK TABLES `cauhinh_vay` WRITE;
/*!40000 ALTER TABLE `cauhinh_vay` DISABLE KEYS */;
INSERT INTO `cauhinh_vay` VALUES (1,'Vay kinh doanh',5000000000,72,0.007,'So tien vay* Lai suat * Ky han','Tong so tien lai + Tong so tien da vay','VND'),(2,'Vay mua nha',2000000000,60,0.006,'So tien vay* Lai suat * Ky han','Tong so tien lai + Tong so tien da vay','VND'),(3,'Vay kinh doanh',1500000000,72,0.006,'So tien vay* Lai suat * Ky han','Tong so tien lai + Tong so tien da vay','VND'),(4,'Vay dong hoc phi',500000000,60,0.004,'So tien vay* Lai suat * Ky han','Tong so tien lai + Tong so tien da vay','VND'),(5,'Vay mua oto',300000000,36,0.005,'So tien vay* Lai suat * Ky han','Tong so tien lai + Tong so tien da vay','VND'),(6,'Vay mua dat',2000000000,36,0.005,'So tien vay* Lai suat * Ky han','Tong so tien lai + Tong so tien da vay','VND');
/*!40000 ALTER TABLE `cauhinh_vay` ENABLE KEYS */;
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
