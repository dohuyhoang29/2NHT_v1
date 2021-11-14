-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               10.4.20-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win64
-- HeidiSQL Version:             11.3.0.6295
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Dumping database structure for 2nht
DROP DATABASE IF EXISTS `2nht`;
CREATE DATABASE IF NOT EXISTS `2nht` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE `2nht`;

-- Dumping structure for table 2nht.account
DROP TABLE IF EXISTS `account`;
CREATE TABLE IF NOT EXISTS `account` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` text NOT NULL,
  `email` text NOT NULL,
  `password` text NOT NULL,
  `type` text NOT NULL,
  `address` text DEFAULT NULL,
  `phone_number` text DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4;

-- Dumping data for table 2nht.account: ~7 rows (approximately)
/*!40000 ALTER TABLE `account` DISABLE KEYS */;
INSERT INTO `account` (`id`, `username`, `email`, `password`, `type`, `address`, `phone_number`) VALUES
	(1, 'admin', 'admin@gmail.com', 'password', 'ADMIN', 'VN', '012345678'),
	(2, 'staff', 'staff@gmail.com', '1234', 'STAFF', 'VN', '098765432'),
	(3, 'hoang', 'hoang@gmail.com', '1234', 'USER', '', '012345678'),
	(5, 'hoang123', 'hoang@gmail.com', '1234', 'USER', 'VN', '012345678'),
	(6, 'nhilon', 'nhilon@gmail.com', '123', 'USER', 'Chuong Lon', '098765432'),
	(7, 'tututu', 'tu@gmail.com', '12', 'USER', 'HN', '012'),
	(8, 'sadf', 'asdf@afas.adf', '01', 'USER', 'faf', '0123123123');
/*!40000 ALTER TABLE `account` ENABLE KEYS */;

-- Dumping structure for table 2nht.cart
DROP TABLE IF EXISTS `cart`;
CREATE TABLE IF NOT EXISTS `cart` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `quantity` int(11) NOT NULL DEFAULT 0,
  `color_id` int(11) DEFAULT NULL,
  `product_id` int(11) DEFAULT NULL,
  `account_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_cart_color` (`color_id`),
  KEY `FK_cart_product` (`product_id`),
  KEY `FK_cart_account` (`account_id`),
  CONSTRAINT `FK_cart_account` FOREIGN KEY (`account_id`) REFERENCES `account` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_cart_color` FOREIGN KEY (`color_id`) REFERENCES `color` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK_cart_product` FOREIGN KEY (`product_id`) REFERENCES `product` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Dumping data for table 2nht.cart: ~0 rows (approximately)
/*!40000 ALTER TABLE `cart` DISABLE KEYS */;
/*!40000 ALTER TABLE `cart` ENABLE KEYS */;

-- Dumping structure for table 2nht.categories
DROP TABLE IF EXISTS `categories`;
CREATE TABLE IF NOT EXISTS `categories` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL DEFAULT '0',
  `description` text DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4;

-- Dumping data for table 2nht.categories: ~4 rows (approximately)
/*!40000 ALTER TABLE `categories` DISABLE KEYS */;
INSERT INTO `categories` (`id`, `name`, `description`) VALUES
	(1, 'Laptop', 'lkdf;asldkfjads;lkf'),
	(2, 'Phone', 'adfasfadsfadsf'),
	(3, 'Tablet', 'adfasdfsfasfsda');
/*!40000 ALTER TABLE `categories` ENABLE KEYS */;

-- Dumping structure for table 2nht.feedback
DROP TABLE IF EXISTS `feedback`;
CREATE TABLE IF NOT EXISTS `feedback` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `account_id` int(11) NOT NULL DEFAULT 0,
  `product_id` int(11) NOT NULL DEFAULT 0,
  `feedback` text NOT NULL,
  `point` int(11) NOT NULL DEFAULT 0,
  `date` date NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK1_Account_Feedback` (`account_id`),
  KEY `FK2_Product_Feedback` (`product_id`),
  CONSTRAINT `FK1_Account_Feedback` FOREIGN KEY (`account_id`) REFERENCES `account` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK2_Product_Feedback` FOREIGN KEY (`product_id`) REFERENCES `product` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Dumping data for table 2nht.feedback: ~0 rows (approximately)
/*!40000 ALTER TABLE `feedback` DISABLE KEYS */;
/*!40000 ALTER TABLE `feedback` ENABLE KEYS */;

-- Dumping structure for table 2nht.order
DROP TABLE IF EXISTS `order`;
CREATE TABLE IF NOT EXISTS `order` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `account_id` int(11) NOT NULL DEFAULT 0,
  `total_price` int(11) NOT NULL DEFAULT 0,
  `create_date` date NOT NULL,
  `status` text NOT NULL,
  `address` text NOT NULL,
  `phone_number` text NOT NULL,
  `note` text NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK1_Account_Order` (`account_id`),
  CONSTRAINT `FK1_Account_Order` FOREIGN KEY (`account_id`) REFERENCES `account` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Dumping data for table 2nht.order: ~0 rows (approximately)
/*!40000 ALTER TABLE `order` DISABLE KEYS */;
/*!40000 ALTER TABLE `order` ENABLE KEYS */;

-- Dumping structure for table 2nht.order_detail
DROP TABLE IF EXISTS `order_detail`;
CREATE TABLE IF NOT EXISTS `order_detail` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `quantity` int(11) NOT NULL DEFAULT 0,
  `status` text NOT NULL,
  `color_id` int(11) NOT NULL DEFAULT 0,
  `product_id` int(11) NOT NULL DEFAULT 0,
  `account_id` int(11) NOT NULL DEFAULT 0,
  PRIMARY KEY (`id`),
  KEY `FK__color` (`color_id`),
  KEY `FK__product` (`product_id`),
  KEY `FK__account` (`account_id`),
  CONSTRAINT `FK__account` FOREIGN KEY (`account_id`) REFERENCES `account` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK__color` FOREIGN KEY (`color_id`) REFERENCES `color` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `FK__product` FOREIGN KEY (`product_id`) REFERENCES `product` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Dumping data for table 2nht.order_detail: ~0 rows (approximately)
/*!40000 ALTER TABLE `order_detail` DISABLE KEYS */;
/*!40000 ALTER TABLE `order_detail` ENABLE KEYS */;

-- Dumping structure for table 2nht.product
DROP TABLE IF EXISTS `product`;
CREATE TABLE IF NOT EXISTS `product` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `category_id` int(11) DEFAULT NULL,
  `code` text DEFAULT NULL,
  `name` text DEFAULT NULL,
  `warranty_period` text DEFAULT NULL,
  `import_price` int(11) DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  `hard_drive` text DEFAULT NULL,
  `origin` text DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL,
  `color` varchar(50) DEFAULT NULL,
  `img_src` text DEFAULT NULL,
  `screen` text DEFAULT NULL,
  `cpu` text DEFAULT NULL,
  `gpu` text DEFAULT NULL,
  `ram` text DEFAULT NULL,
  `operating_system` text DEFAULT NULL,
  `rear_camera` text DEFAULT NULL,
  `selfie_camera` text DEFAULT NULL,
  `battery_capacity` text DEFAULT NULL,
  `sim` text DEFAULT NULL,
  `weight` text DEFAULT NULL,
  `dimensions` text DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK1_Catergories` (`category_id`),
  CONSTRAINT `FK1_Catergories` FOREIGN KEY (`category_id`) REFERENCES `categories` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4;

-- Dumping data for table 2nht.product: ~2 rows (approximately)
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` (`id`, `category_id`, `code`, `name`, `warranty_period`, `import_price`, `price`, `hard_drive`, `origin`, `quantity`, `color`, `img_src`, `screen`, `cpu`, `gpu`, `ram`, `operating_system`, `rear_camera`, `selfie_camera`, `battery_capacity`, `sim`, `weight`, `dimensions`) VALUES
	(5, 1, 'adsf', 'adfads', '2021-11-10', 4253, 452, 'sfg', 'sfg', 5, 'sfdgsdg', 'Screenshot (9).png', 'asdfasdfa', 'asdf', 'adfas', 'fasdf', 'adfasdfadf', 'f', 'adfads', 'adfad', 'fafasd', 'fasdfasdf', 'sdfas'),
	(7, 2, 'afdas', 'dfasdf', '2021-11-10', 45, 45, 'asfd', 'afsdf', 14, 'adf', 'Screenshot (9).png', 'kkjh', 'khj', 'kj', 'h', 'jh', 'jh', 'jh', 'jh', 'jh', 'hj', 'hj');
/*!40000 ALTER TABLE `product` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
