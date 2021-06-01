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
-- Table structure for table `customer_loan`
--

DROP TABLE IF EXISTS `customer_loan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer_loan` (
  `Id` int NOT NULL AUTO_INCREMENT,
  `TenKH` varchar(45) CHARACTER SET latin1 COLLATE latin1_swedish_ci DEFAULT NULL,
  `SoCMT` varchar(45) CHARACTER SET latin1 COLLATE latin1_swedish_ci DEFAULT NULL,
  `SoDienThoai` varchar(45) CHARACTER SET latin1 COLLATE latin1_swedish_ci DEFAULT NULL,
  `DiaChi` varchar(45) CHARACTER SET latin1 COLLATE latin1_swedish_ci DEFAULT NULL,
  `Email` varchar(45) CHARACTER SET latin1 COLLATE latin1_swedish_ci DEFAULT NULL,
  `SoHopDongVay` varchar(45) CHARACTER SET latin1 COLLATE latin1_swedish_ci DEFAULT NULL,
  `HinhThucVay` int DEFAULT NULL,
  `SoTienVayNo` float DEFAULT NULL,
  `KyHan` int DEFAULT NULL,
  `TuNgay` date DEFAULT NULL,
  `DenNgay` date DEFAULT NULL,
  PRIMARY KEY (`Id`),
  KEY `hinhthucvay_id_idx` (`HinhThucVay`),
  CONSTRAINT `hinhthucvay_id` FOREIGN KEY (`HinhThucVay`) REFERENCES `cauhinh_vay` (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer_loan`
--

LOCK TABLES `customer_loan` WRITE;
/*!40000 ALTER TABLE `customer_loan` DISABLE KEYS */;
INSERT INTO `customer_loan` VALUES (1,'Nguyen Huy Dong','0123456','0986868896','Xuân Mai.HN','dongvjp99@gmail.com','NHD123',1,100000000,60,'2021-04-01','2026-04-01'),(2,'Bach Duy Hieu','0345','012345','HN','HieuBach@gmail.com','BDH345',2,20000000,24,'2021-04-05','2023-04-05'),(3,'Nguyen Van A','0987','012345','HP','nguyen@gmail.co,','NVA123',1,30000000,60,'2016-05-20','2021-05-20'),(4,'Nguyen Huu Hieu','5641123','036984656','Van Mieu, Ha Noi','hieuvjppro@gmail.com','NHH123',3,600000000,36,'2021-05-31','2024-05-31'),(5,'Cao Viet Hoang','5421366','0314897614','HN','hoangdz@gmail.com','CVH123',4,200000000,12,'2021-05-31','2022-05-31'),(6,'Le Vu Nam','3199876','0179861564','HN','namxxx@gmail.com','LVN123',2,450000000,24,'2021-05-31','2023-05-31');
/*!40000 ALTER TABLE `customer_loan` ENABLE KEYS */;
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
