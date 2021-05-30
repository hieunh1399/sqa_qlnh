-- MySQL dump 10.13  Distrib 8.0.23, for Win64 (x86_64)
--
-- Host: localhost    Database: sqa_qlnh
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
-- Table structure for table `account`
--

DROP TABLE IF EXISTS `account`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `account` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `position` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `account`
--

LOCK TABLES `account` WRITE;
/*!40000 ALTER TABLE `account` DISABLE KEYS */;
INSERT INTO `account` VALUES (1,'admin','12345','Management  System'),(2,'hieu','12345','Employee'),(3,'hieuadmin','123456','CEO');
/*!40000 ALTER TABLE `account` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cauhinh_gui`
--

DROP TABLE IF EXISTS `cauhinh_gui`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cauhinh_gui` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `HinhThucGui` varchar(45) CHARACTER SET latin1 DEFAULT NULL,
  `SoTienGuiToiThieu` float DEFAULT NULL,
  `KyHan` int(11) DEFAULT NULL,
  `PhuongThucTraLai` varchar(45) CHARACTER SET latin1 DEFAULT NULL,
  `LaiSuat` float DEFAULT NULL,
  `SoTienLai` varchar(255) CHARACTER SET latin1 DEFAULT NULL,
  `DonViTienTe` varchar(45) CHARACTER SET latin1 DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cauhinh_gui`
--

LOCK TABLES `cauhinh_gui` WRITE;
/*!40000 ALTER TABLE `cauhinh_gui` DISABLE KEYS */;
INSERT INTO `cauhinh_gui` VALUES (1,'Co ky han',1000000,6,'Tra lai cuoi ky',0.005,'So tien gui * Lai suat * Ky han','VND'),(2,'Tiet kiem huu tri',100000,24,'Tra lai cuoi ky',0.006,'So tien gui * Lai suat * Ky han','VND');
/*!40000 ALTER TABLE `cauhinh_gui` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cauhinh_vay`
--

DROP TABLE IF EXISTS `cauhinh_vay`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cauhinh_vay` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `HinhThucVay` varchar(45) CHARACTER SET latin1 DEFAULT NULL,
  `SoTienVayToiDa` float DEFAULT NULL,
  `ThoiHanVayToiDa` int(11) DEFAULT NULL,
  `LaiSuat` float DEFAULT NULL,
  `SoTienPhaiTraLai` varchar(255) CHARACTER SET latin1 DEFAULT NULL,
  `TongSoTienPhaiTra` varchar(255) CHARACTER SET latin1 DEFAULT NULL,
  `DonViTienTe` varchar(45) CHARACTER SET latin1 DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cauhinh_vay`
--

LOCK TABLES `cauhinh_vay` WRITE;
/*!40000 ALTER TABLE `cauhinh_vay` DISABLE KEYS */;
INSERT INTO `cauhinh_vay` VALUES (1,'Vay kinh doanh',5000000000,72,0.007,'So tien vay* Lai suat * Ky han','Tong so tien lai + Tong so tien da vay','VND'),(2,'Vay mua nha',2000000000,60,0.006,'So tien vay* Lai suat * Ky han','Tong so tien lai + Tong so tien da vay','VND');
/*!40000 ALTER TABLE `cauhinh_vay` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer_loan`
--

DROP TABLE IF EXISTS `customer_loan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer_loan` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `TenKH` varchar(45) CHARACTER SET latin1 DEFAULT NULL,
  `SoCMT` varchar(45) CHARACTER SET latin1 DEFAULT NULL,
  `SoDienThoai` varchar(45) CHARACTER SET latin1 DEFAULT NULL,
  `DiaChi` varchar(45) CHARACTER SET latin1 DEFAULT NULL,
  `Email` varchar(45) CHARACTER SET latin1 DEFAULT NULL,
  `SoHopDongVay` varchar(45) CHARACTER SET latin1 DEFAULT NULL,
  `HinhThucVay` int(11) DEFAULT NULL,
  `SoTienVayNo` float DEFAULT NULL,
  `KyHan` int(11) DEFAULT NULL,
  `TuNgay` date DEFAULT NULL,
  `DenNgay` date DEFAULT NULL,
  PRIMARY KEY (`Id`),
  KEY `hinhthucvay_id_idx` (`HinhThucVay`),
  CONSTRAINT `hinhthucvay_id` FOREIGN KEY (`HinhThucVay`) REFERENCES `cauhinh_vay` (`Id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer_loan`
--

LOCK TABLES `customer_loan` WRITE;
/*!40000 ALTER TABLE `customer_loan` DISABLE KEYS */;
INSERT INTO `customer_loan` VALUES (1,'Nguyen Huy Dong','0123456','0986868896','Xuân Mai.HN','dongvjp99@gmail.com','NHD123',1,100000000,60,'2021-04-01','2026-04-01'),(2,'Bach Duy Hieu','0345','012345','HN','HieuBach@gmail.com','BDH345',2,20000000,24,'2021-04-05','2023-04-05'),(3,'Nguyen Van A','0987','012345','HP','nguyen@gmail.co,','NVA123',1,30000000,60,'2016-05-20','2021-05-20');
/*!40000 ALTER TABLE `customer_loan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer_saving`
--

DROP TABLE IF EXISTS `customer_saving`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer_saving` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `TenKH` varchar(45) CHARACTER SET latin1 DEFAULT NULL,
  `SoCMT` varchar(45) CHARACTER SET latin1 DEFAULT NULL,
  `SoDienThoai` varchar(45) CHARACTER SET latin1 DEFAULT NULL,
  `DiaChi` varchar(45) CHARACTER SET latin1 DEFAULT NULL,
  `Email` varchar(45) CHARACTER SET latin1 DEFAULT NULL,
  `SoHopDongTK` varchar(45) CHARACTER SET latin1 DEFAULT NULL,
  `HinhThucTK` int(11) DEFAULT NULL,
  `SoTienTK` float DEFAULT NULL,
  `KyHan` int(11) DEFAULT NULL,
  `NgayPhatHanh` date DEFAULT NULL,
  `NgayHetHan` date DEFAULT NULL,
  PRIMARY KEY (`Id`),
  KEY `hinhthucgui_id_idx` (`HinhThucTK`),
  CONSTRAINT `hinhthucgui_id` FOREIGN KEY (`HinhThucTK`) REFERENCES `cauhinh_gui` (`Id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer_saving`
--

LOCK TABLES `customer_saving` WRITE;
/*!40000 ALTER TABLE `customer_saving` DISABLE KEYS */;
INSERT INTO `customer_saving` VALUES (1,'Nguyen Huong Giang','12345','012345','Hai Duong','Giang@gmail.com','GTK001',1,50000000,12,'2021-04-02','2022-04-02'),(2,'Bui Nguyen Huy Hoang','0686869','0989898','Hai Phong','hoangbui@gmail.com','NHH003',2,900000000,24,'2019-05-25','2021-05-25');
/*!40000 ALTER TABLE `customer_saving` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-05-30  1:36:49
