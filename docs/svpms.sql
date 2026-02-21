-- MySQL dump 10.13  Distrib 8.0.41, for Win64 (x86_64)
--
-- Host: localhost    Database: spvms_db
-- ------------------------------------------------------
-- Server version	8.0.41

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
-- Table structure for table `approval_history`
--

DROP TABLE IF EXISTS `approval_history`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `approval_history` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `pr_id` bigint NOT NULL,
  `approver_id` bigint NOT NULL,
  `action` varchar(255) NOT NULL,
  `comments` varchar(255) DEFAULT NULL,
  `created_at` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `action_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  KEY `fk_approval_pr` (`pr_id`),
  KEY `fk_approval_user` (`approver_id`),
  CONSTRAINT `fk_approval_pr` FOREIGN KEY (`pr_id`) REFERENCES `purchase_requisitions` (`id`) ON DELETE CASCADE,
  CONSTRAINT `fk_approval_user` FOREIGN KEY (`approver_id`) REFERENCES `users` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `approval_history`
--

LOCK TABLES `approval_history` WRITE;
/*!40000 ALTER TABLE `approval_history` DISABLE KEYS */;
INSERT INTO `approval_history` VALUES (1,3,2,'APPROVED','done','2026-01-02 14:42:27','2026-01-02 14:42:27'),(2,4,2,'REJECTED','failed','2026-01-02 14:44:38','2026-01-02 14:44:39'),(3,5,2,'APPROVED','done','2026-01-02 15:40:49','2026-01-02 15:40:49'),(5,14,7,'APPROVED','done','2026-01-10 16:23:44','2026-01-10 16:23:44'),(6,16,7,'APPROVED','done','2026-01-10 16:30:31','2026-01-10 16:30:31'),(9,19,7,'APPROVED','done','2026-01-12 14:24:10','2026-01-12 14:24:10'),(10,20,8,'APPROVED','done','2026-01-12 15:02:05','2026-01-12 15:02:06'),(11,21,7,'APPROVED','done','2026-01-12 15:48:09','2026-01-12 15:48:10'),(12,22,1,'APPROVED','Approved','2026-01-13 16:30:01','2026-01-13 16:30:02'),(13,23,1,'APPROVED','Approved','2026-01-16 09:05:09','2026-01-16 09:05:10'),(14,24,1,'APPROVED','Approved','2026-01-16 10:23:26','2026-01-16 10:23:27'),(17,27,1,'APPROVED','Approved','2026-01-16 10:40:43','2026-01-16 10:40:43'),(18,32,1,'APPROVED','Approved','2026-01-16 15:14:16','2026-01-16 15:14:17'),(19,33,1,'APPROVED','Approved','2026-01-19 15:05:01','2026-01-19 15:05:02');
/*!40000 ALTER TABLE `approval_history` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `flyway_schema_history`
--

DROP TABLE IF EXISTS `flyway_schema_history`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `flyway_schema_history` (
  `installed_rank` int NOT NULL,
  `version` varchar(50) DEFAULT NULL,
  `description` varchar(200) NOT NULL,
  `type` varchar(20) NOT NULL,
  `script` varchar(1000) NOT NULL,
  `checksum` int DEFAULT NULL,
  `installed_by` varchar(100) NOT NULL,
  `installed_on` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `execution_time` int NOT NULL,
  `success` tinyint(1) NOT NULL,
  PRIMARY KEY (`installed_rank`),
  KEY `flyway_schema_history_s_idx` (`success`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `flyway_schema_history`
--

LOCK TABLES `flyway_schema_history` WRITE;
/*!40000 ALTER TABLE `flyway_schema_history` DISABLE KEYS */;
INSERT INTO `flyway_schema_history` VALUES (1,'1','init spvms schema','SQL','V1__init_spvms_schema.sql',-1447787,'spvms_user','2025-12-19 14:43:21',265,1),(2,'2','roles and userroles','SQL','V2__roles_and_userroles.sql',1804077334,'spvms_user','2025-12-19 14:43:21',18,1),(3,'3','add description to roles','SQL','V3__add_description_to_roles.sql',735496262,'spvms_user','2025-12-19 14:57:36',169,1),(4,'4','add vendor search fields','SQL','V4__add_vendor_search_fields.sql',155404354,'spvms_user','2025-12-25 07:58:02',238,1),(5,'5','create approval history table','SQL','V5__create_approval_history_table.sql',1569013382,'spvms_user','2026-01-02 14:02:01',247,1),(6,'6','add action at to approval history','SQL','V6__add_action_at_to_approval_history.sql',-496195621,'spvms_user','2026-01-02 14:07:45',136,1),(7,'12','add gst fields to po','SQL','V12__add_gst_fields_to_po.sql',981159576,'spvms_user','2026-01-16 08:59:25',250,1);
/*!40000 ALTER TABLE `flyway_schema_history` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `purchase_orders`
--

DROP TABLE IF EXISTS `purchase_orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `purchase_orders` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `po_number` varchar(255) NOT NULL,
  `pr_id` bigint NOT NULL,
  `status` varchar(255) NOT NULL,
  `total_amount` decimal(38,2) DEFAULT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `base_amount` decimal(38,2) DEFAULT NULL,
  `delivered_quantity` int NOT NULL DEFAULT '0',
  `items_json` varchar(1000) DEFAULT NULL,
  `quantity_json` varchar(1000) DEFAULT NULL,
  `total_quantity` int NOT NULL DEFAULT '0',
  `cgst_percent` decimal(38,2) DEFAULT NULL,
  `sgst_percent` decimal(38,2) DEFAULT NULL,
  `igst_percent` decimal(38,2) DEFAULT NULL,
  `cgst_amount` decimal(38,2) DEFAULT NULL,
  `sgst_amount` decimal(38,2) DEFAULT NULL,
  `igst_amount` decimal(38,2) DEFAULT NULL,
  `total_gst_amount` decimal(38,2) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `po_number` (`po_number`),
  KEY `pr_id` (`pr_id`),
  CONSTRAINT `purchase_orders_ibfk_1` FOREIGN KEY (`pr_id`) REFERENCES `purchase_requisitions` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `purchase_orders`
--

LOCK TABLES `purchase_orders` WRITE;
/*!40000 ALTER TABLE `purchase_orders` DISABLE KEYS */;
INSERT INTO `purchase_orders` VALUES (1,'PO-1766158826154',1,'RECEIVED',500000000.00,'2025-12-19 15:40:26','2026-01-12 14:45:36',NULL,0,NULL,NULL,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(2,'PO-1766598517080',2,'DRAFT',0.00,'2025-12-24 17:48:37','2026-01-12 14:45:36',NULL,0,NULL,NULL,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(3,'PO-1767364947038',3,'DRAFT',25000.00,'2026-01-02 14:42:27','2026-01-12 14:45:36',NULL,0,NULL,NULL,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(4,'PO-1767368449096',5,'DRAFT',500000.00,'2026-01-02 15:40:49','2026-01-12 14:45:36',NULL,0,NULL,NULL,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(5,'PO-1768062224665',14,'DRAFT',309000.00,'2026-01-10 16:23:45','2026-01-12 14:45:36',NULL,0,NULL,NULL,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(6,'PO-1768062631399',16,'DRAFT',150000.00,'2026-01-10 16:30:31','2026-01-12 14:45:36',NULL,0,NULL,NULL,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(7,'PO-1768066583182',16,'CLOSED',177000.00,'2026-01-10 17:36:23','2026-01-10 17:44:21',150000.00,2,'[\"laptop\",\"iPhone\"]','[1,1]',2,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(8,'PO-1768067193659',14,'CLOSED',386250.00,'2026-01-10 17:46:34','2026-01-10 17:49:26',309000.00,6,'[\"macbook\",\"mouse\"]','[3,3]',6,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(9,'PO-1768227967538',17,'CLOSED',157500.00,'2026-01-12 14:26:08','2026-01-12 14:55:35',125000.00,5,'[\"Motorola\"]','[5]',5,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(10,'PO-1768230211689',20,'CLOSED',33000.00,'2026-01-12 15:03:32','2026-01-12 15:05:35',30000.00,2,'[\"oppo\"]','[2]',2,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(11,'PO-1768232981050',14,'CREATED',355350.00,'2026-01-12 15:49:41','2026-01-12 15:49:41',309000.00,0,'[\"macbook\",\"mouse\"]','[3,3]',6,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(12,'PO-1768233018466',21,'CLOSED',41400.00,'2026-01-12 15:50:18','2026-01-13 16:38:50',36000.00,4,'[\"phones\",\"charger\"]','[2,2]',4,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(13,'PO-1768321832186',22,'CLOSED',30900.00,'2026-01-13 16:30:32','2026-01-15 16:32:36',30000.00,2,'[\"mobiles\"]','[2]',2,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(14,'PO-1768321852363',21,'CLOSED',43200.00,'2026-01-13 16:30:52','2026-01-13 16:38:42',36000.00,4,'[\"phones\",\"charger\"]','[2,2]',4,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(15,'PO-1768322307574',22,'CLOSED',36000.00,'2026-01-13 16:38:28','2026-01-13 16:39:57',30000.00,2,'[\"mobiles\"]','[2]',2,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(16,'PO-1768322407910',22,'CLOSED',33000.00,'2026-01-13 16:40:08','2026-01-13 16:40:21',30000.00,2,'[\"mobiles\"]','[2]',2,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(17,'PO-1768554350653',23,'CLOSED',36000.00,'2026-01-16 09:05:51','2026-01-16 09:06:34',30000.00,2,'[\"mobiles \"]','[2]',2,9.00,9.00,2.00,2700.00,2700.00,600.00,6000.00),(18,'PO-1768560104144',27,'CLOSED',2950.00,'2026-01-16 10:41:44','2026-01-16 10:45:07',2500.00,1,'[\"seats\"]','[1]',1,9.00,9.00,0.00,225.00,225.00,0.00,450.00),(19,'PO-1768560342085',26,'CLOSED',1000.00,'2026-01-16 10:45:42','2026-01-16 10:47:08',1000.00,2,'[\"oil\"]','[2]',2,0.00,0.00,0.00,0.00,0.00,0.00,0.00),(20,'PO-1768564426261',25,'CREATED',1635.00,'2026-01-16 11:53:46','2026-01-16 11:53:46',1500.00,0,'[\"lights\"]','[1]',1,9.00,0.00,0.00,135.00,0.00,0.00,135.00),(21,'PO-1768564470594',25,'CREATED',1500.00,'2026-01-16 11:54:31','2026-01-16 11:54:31',1500.00,0,'[\"lights\"]','[1]',1,0.00,0.00,0.00,0.00,0.00,0.00,0.00),(22,'PO-1768564740492',25,'CREATED',1599.00,'2026-01-16 11:59:00','2026-01-16 11:59:00',1500.00,0,'[\"lights\"]','[1]',1,5.00,1.60,0.00,75.00,24.00,0.00,99.00),(23,'PO-1768576595404',32,'CLOSED',1800.00,'2026-01-16 15:16:35','2026-01-16 15:17:51',1500.00,1,'[\"Ilights\"]','[1]',1,10.00,10.00,0.00,150.00,150.00,0.00,300.00),(24,'PO-1768576719743',32,'CLOSED',1905.00,'2026-01-16 15:18:40','2026-01-16 15:19:04',1500.00,1,'[\"Ilights\"]','[1]',1,9.00,9.00,9.00,135.00,135.00,135.00,405.00),(25,'PO-1768835264385',33,'CLOSED',1770.00,'2026-01-19 15:07:44','2026-01-19 15:13:19',1500.00,1,'[\"spare parts\"]','[1]',1,9.00,9.00,0.00,135.00,135.00,0.00,270.00);
/*!40000 ALTER TABLE `purchase_orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `purchase_requisitions`
--

DROP TABLE IF EXISTS `purchase_requisitions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `purchase_requisitions` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `pr_number` varchar(255) NOT NULL,
  `requester_id` bigint NOT NULL,
  `vendor_id` bigint DEFAULT NULL,
  `status` varchar(255) NOT NULL,
  `total_amount` decimal(38,2) DEFAULT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `items_json` varchar(1000) DEFAULT NULL,
  `quantity_json` varchar(1000) DEFAULT NULL,
  `item_amount_json` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `pr_number` (`pr_number`),
  KEY `requester_id` (`requester_id`),
  KEY `vendor_id` (`vendor_id`),
  CONSTRAINT `purchase_requisitions_ibfk_1` FOREIGN KEY (`requester_id`) REFERENCES `users` (`id`),
  CONSTRAINT `purchase_requisitions_ibfk_2` FOREIGN KEY (`vendor_id`) REFERENCES `vendors` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `purchase_requisitions`
--

LOCK TABLES `purchase_requisitions` WRITE;
/*!40000 ALTER TABLE `purchase_requisitions` DISABLE KEYS */;
INSERT INTO `purchase_requisitions` VALUES (1,'pr_101',1,5,'APPROVED',500000000.00,'2025-12-19 15:37:50','2025-12-19 15:40:26',NULL,NULL,NULL),(2,'string',1,6,'REJECTED',0.00,'2025-12-24 17:46:24','2025-12-24 17:49:19',NULL,NULL,NULL),(3,'pr-005',1,5,'APPROVED',25000.00,'2026-01-02 14:36:59','2026-01-02 14:42:27',NULL,NULL,NULL),(4,'pr-006',2,6,'REJECTED',28000.00,'2026-01-02 14:43:48','2026-01-02 14:44:39',NULL,NULL,NULL),(5,'pr-007',1,6,'APPROVED',500000.00,'2026-01-02 15:36:20','2026-01-02 15:40:49',NULL,NULL,NULL),(6,'pr-008',1,7,'DRAFT',500000.00,'2026-01-02 15:39:42','2026-01-02 15:39:42',NULL,NULL,NULL),(7,'001',1,7,'DRAFT',65000.00,'2026-01-07 16:02:27','2026-01-07 16:02:27',NULL,NULL,NULL),(8,'pr009',2,7,'DRAFT',150000.00,'2026-01-07 17:28:08','2026-01-07 17:28:08','[\"laptop\"]','[2]',NULL),(9,'pr0010',2,8,'DRAFT',50000.00,'2026-01-07 17:44:22','2026-01-07 17:44:22','[\"laptop\"]','[2]','[25000]'),(10,'pr0011',2,8,'DRAFT',75000.00,'2026-01-07 17:46:36','2026-01-07 17:46:36','[\"mobile\"]','[3]','[25000]'),(11,'pr0012',2,7,'DRAFT',75000.00,'2026-01-07 17:47:23','2026-01-07 17:47:23','[\"mobile\"]','[3]','[25000]'),(12,'pr0013',2,7,'DRAFT',75000.00,'2026-01-07 17:48:31','2026-01-07 17:48:31','[\"mobile\"]','[3]','[25000]'),(13,'pr00013',2,8,'DRAFT',110000.00,'2026-01-07 18:09:56','2026-01-07 18:09:56','[\"iphone\"]','[2]','[55000]'),(14,'PR-1768058586479',2,8,'APPROVED',309000.00,'2026-01-10 15:23:07','2026-01-10 16:23:44','[\"macbook\",\"mouse\"]','[3,3]','[88000,15000]'),(15,'PR-1768058671125',2,8,'APPROVED',303000.00,'2026-01-10 15:24:31','2026-01-10 16:16:54','[\"macbooks\",\"mouses\"]','[3,2]','[89000,18000]'),(16,'PR-1768062426296',3,7,'APPROVED',150000.00,'2026-01-10 16:27:06','2026-01-10 16:30:31','[\"laptop\",\"iPhone\"]','[1,1]','[60000,90000]'),(17,'PR-1768227355852',3,8,'APPROVED',125000.00,'2026-01-12 14:15:56','2026-01-12 14:19:08','[\"Motorola\"]','[5]','[25000]'),(18,'PR-1768227665263',3,8,'APPROVED',130000.00,'2026-01-12 14:21:05','2026-01-12 14:22:16','[\"vivo\"]','[5]','[26000]'),(19,'PR-1768227792481',4,7,'APPROVED',156000.00,'2026-01-12 14:23:12','2026-01-12 14:24:10','[\"vivo\"]','[6]','[26000]'),(20,'PR-1768230074693',2,8,'APPROVED',30000.00,'2026-01-12 15:01:15','2026-01-12 15:02:06','[\"oppo\"]','[2]','[15000]'),(21,'PR-1768232381235',2,8,'APPROVED',36000.00,'2026-01-12 15:39:41','2026-01-12 15:48:10','[\"phones\",\"charger\"]','[2,2]','[15000,3000]'),(22,'PR-1768321779893',3,8,'APPROVED',30000.00,'2026-01-13 16:29:40','2026-01-13 16:30:02','[\"mobiles\"]','[2]','[15000]'),(23,'PR-1768554284437',2,7,'APPROVED',30000.00,'2026-01-16 09:04:44','2026-01-16 09:05:10','[\"mobiles \"]','[2]','[15000]'),(24,'PR-1768558268148',2,11,'APPROVED',3000.00,'2026-01-16 10:11:08','2026-01-16 10:23:27','[\"disk\"]','[2]','[1500]'),(25,'PR-1768559568575',2,11,'APPROVED',1500.00,'2026-01-16 10:32:49','2026-01-16 10:33:27','[\"lights\"]','[1]','[1500]'),(26,'PR-1768559752413',2,11,'APPROVED',1000.00,'2026-01-16 10:35:52','2026-01-16 10:36:03','[\"oil\"]','[2]','[500]'),(27,'PR-1768560031151',2,11,'APPROVED',2500.00,'2026-01-16 10:40:31','2026-01-16 10:40:43','[\"seats\"]','[1]','[2500]'),(28,'PR-1768565011762',2,6,'DRAFT',1.00,'2026-01-16 12:03:32','2026-01-16 12:03:32','[\"Item\"]','[1]','[1]'),(29,'PR-1768575089588',2,6,'DRAFT',1.00,'2026-01-16 14:51:30','2026-01-16 14:51:30','[\"Item\"]','[1]','[1]'),(30,'PR-1768575131335',2,5,'DRAFT',100.00,'2026-01-16 14:52:11','2026-01-16 14:52:11','[\"Item\"]','[1]','[100]'),(31,'PR-1768575808767',2,7,'DRAFT',100.00,'2026-01-16 15:03:29','2026-01-16 15:03:29','[\"Item\"]','[1]','[100]'),(32,'PR-1768576423344',2,12,'APPROVED',1500.00,'2026-01-16 15:13:43','2026-01-16 15:14:17','[\"Ilights\"]','[1]','[1500]'),(33,'PR-1768835065655',2,13,'APPROVED',1500.00,'2026-01-19 15:04:26','2026-01-19 15:05:02','[\"spare parts\"]','[1]','[1500]');
/*!40000 ALTER TABLE `purchase_requisitions` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `roles`
--

DROP TABLE IF EXISTS `roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `roles` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `roles`
--

LOCK TABLES `roles` WRITE;
/*!40000 ALTER TABLE `roles` DISABLE KEYS */;
INSERT INTO `roles` VALUES (1,'ADMIN','Administrator'),(2,'PROCUREMENT','Procurement team'),(3,'FINANCE','Finance team'),(4,'VENDOR','Vendor');
/*!40000 ALTER TABLE `roles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_roles`
--

DROP TABLE IF EXISTS `user_roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user_roles` (
  `user_id` bigint NOT NULL,
  `role_id` bigint NOT NULL,
  PRIMARY KEY (`user_id`,`role_id`),
  KEY `role_id` (`role_id`),
  CONSTRAINT `user_roles_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`),
  CONSTRAINT `user_roles_ibfk_2` FOREIGN KEY (`role_id`) REFERENCES `roles` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_roles`
--

LOCK TABLES `user_roles` WRITE;
/*!40000 ALTER TABLE `user_roles` DISABLE KEYS */;
INSERT INTO `user_roles` VALUES (1,1),(10,1),(12,1),(13,1),(8,2),(4,3),(9,3),(11,3),(3,4),(7,4),(14,4);
/*!40000 ALTER TABLE `user_roles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `username` varchar(100) NOT NULL,
  `password` varchar(255) NOT NULL,
  `email` varchar(150) NOT NULL,
  `is_active` tinyint(1) NOT NULL DEFAULT '1',
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `username` (`username`),
  UNIQUE KEY `email` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'admin','$2a$10$s9YuuTbj/XVUFhslxWi6n.VFGe6oFp1sJMFIXKWR77b14ZLjmV5..','admin@local',1,'2025-12-19 14:57:41','2025-12-19 14:57:41'),(2,'ganesh','djkcnkxjjhe','xvd@dvmail',1,'2025-12-19 15:45:51','2025-12-19 15:45:51'),(3,'pavan','$2a$10$XERwpTBDiq0oKLU7ZYYf3uHKKTpfs/dpBktycvVmEomajEiYanSnm','pavan@gmail.com',1,'2025-12-19 15:49:26','2025-12-19 15:49:26'),(4,'raju','$2a$10$fapE958aMR01UxCNnwyAbe6aWl0YZWpItYDXRF3lS2ErSxUl5dxNi','raju@gmail.com',1,'2025-12-19 15:50:57','2025-12-19 15:50:57'),(5,'pncjIG3qqbaFit9Owf8qM3o93.2O7UeBDZksTLm3XEm0h0xotD','string','user@example.com',1,'2025-12-24 17:44:32','2025-12-24 17:44:32'),(7,'Ganesh_kumar','$2a$10$YTofbG.rSKOWp.2.3Mjb5eIJ7pJb6it4P1jksNdfcdaAcNGjbxJkq','gans@example.com',1,'2025-12-31 15:53:35','2025-12-31 15:53:35'),(8,'Kumar_swamy','$2a$10$2GZo70Rahag1FC.EBv9xY.ojkeRYk3fPCh1F3ZIMTMpwy0P/E/cqu','Kumu@example.com',1,'2025-12-31 16:08:08','2025-12-31 16:08:08'),(9,'GANESH_RAO','$2a$10$iMYDIjxtuu6UYXHcWu4IS.BEHYQPA3YpQoOKONfgoiJ9zi/.dIwwa','GANESH@example.com',1,'2026-01-02 15:32:30','2026-01-02 15:32:30'),(10,'gane','$2a$10$4qwsqqdgO2Zz89n.9XuxKOH2KJ/V1b0ceKjK2ZHnN.sofQYWscWSm','gan@gmail.com',1,'2026-01-13 17:46:19','2026-01-13 17:46:19'),(11,'gan','$2a$10$9tya0C0dJRTVlhgojI4L/ehAAFvc3nIz37H79bO3cmdOGLLo2iKBC','gan@gan.com',1,'2026-01-13 17:48:49','2026-01-13 17:48:49'),(12,'kumar','$2a$10$/z8wgtostqDva5JLGMlzmO15FC.EfUcVfRj3NcceZQezmFJHFq5yq','kumar@gmail.com',1,'2026-01-16 15:24:13','2026-01-16 15:24:13'),(13,'manoj','$2a$10$toty6W.lzkBfGsHizKgfOuVJ/vbd6uWsl4crOnnL/Oa50jhrU0UUG','manoj@gmail.com',1,'2026-01-19 14:56:34','2026-01-19 14:56:34'),(14,'demo1','$2a$10$jEkdgztWCTOtIaGPPjpsZe5ighioDsKsN2JiLJ4lqX4Q3YZr8hy66','demo@gmail.com',1,'2026-01-19 14:59:47','2026-01-19 14:59:47');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vendors`
--

DROP TABLE IF EXISTS `vendors`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vendors` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `contact_name` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `gst_number` varchar(255) DEFAULT NULL,
  `is_active` tinyint(1) NOT NULL DEFAULT '1',
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `updated_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `rating` double DEFAULT NULL,
  `location` varchar(255) DEFAULT NULL,
  `category` varchar(255) DEFAULT NULL,
  `compliant` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vendors`
--

LOCK TABLES `vendors` WRITE;
/*!40000 ALTER TABLE `vendors` DISABLE KEYS */;
INSERT INTO `vendors` VALUES (5,'string','string','user@example.com','6869445530','string','45ASDFG1243S4Z6',0,'2025-12-19 15:31:46','2026-01-16 14:51:56',1,'ballari','it',1),(6,'kumar','kumu','kumu@example.com','7287090300','hb halli','38XYXXR63',0,'2025-12-24 17:41:53','2026-01-13 16:18:49',NULL,NULL,NULL,NULL),(7,'string','string','user@example.com','8092769011','string','43FXXTX6617VZZA',1,'2025-12-25 08:02:08','2026-01-16 12:13:31',1,'bellary','supplying',1),(8,'demo','demouser','demo@example.com','8528828390','gandhinager','43TWHJM7798LDZV',1,'2025-12-25 15:27:31','2026-01-16 12:02:47',4,'banglore','hardware',1),(9,'K Ganesh Kumar Rao','gane','gane@gmail.com','7026290560','Bapuji nagar ballari','46IPDZW7514C1Z5',1,'2026-01-13 16:12:08','2026-01-16 09:44:57',5,'bellary','hardware',1),(10,'gan','ganesh kumar','gan@gmail.com','9380494472','Bapuji nagar ballari','29ABCDE1234F1Z5',1,'2026-01-16 09:43:44','2026-01-16 09:43:44',2,'ballari','software solutions',1),(11,'kumu','kumar Swamy','kumu@gmail.com','7234567890','Bapuji nagar ballari','12SDFCG1254S2Z6',1,'2026-01-16 10:09:29','2026-01-16 10:09:29',2,'ballari ','spare parts',1),(12,'demo','demo1','demo@gmail.com','6234567890','sp circle','45ASDFG1234A1Z7',1,'2026-01-16 15:11:12','2026-01-16 15:12:00',3,'ballari','software',1),(13,'pavan','pavan kumar','pavan@gmail.com','8963456812','kawadi street belgam','12ASDFG1452S8Z5',1,'2026-01-19 14:44:24','2026-01-19 14:44:39',5,'belgam','it',1),(14,'demo','demo1','demo@gmail.com','8635241789','gandhi nagar banglore','12ASDCF1254A8Z5',0,'2026-01-19 15:01:45','2026-01-19 15:03:06',5,'banglore','it',1);
/*!40000 ALTER TABLE `vendors` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2026-01-20 20:56:56
