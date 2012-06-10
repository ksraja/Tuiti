-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.1.44


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema tuiti
--

CREATE DATABASE IF NOT EXISTS tuiti;
USE tuiti;

--
-- Definition of table `tuiti`.`contents`
--
CREATE TABLE  `tuiti`.`contents` (
  `content_id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`content_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tuiti`.`contents`
--

--
-- Definition of table `tuiti`.`steps`
--
CREATE TABLE  `tuiti`.`steps` (
  `step_id` int(11) NOT NULL AUTO_INCREMENT,
  `step_definition` text,
  `tutorial_id` int(11) NOT NULL,
  `heading` tinyint(1) NOT NULL DEFAULT '0',
  `ordering` int(11) NOT NULL DEFAULT '1',
  PRIMARY KEY (`step_id`),
  KEY `fk_step_tutorial_id` (`tutorial_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tuiti`.`steps`
--

--
-- Definition of table `tuiti`.`tutorials`
--
CREATE TABLE  `tuiti`.`tutorials` (
  `tutorial_id` int(5) NOT NULL AUTO_INCREMENT,
  `tutorial_name` varchar(100) DEFAULT NULL,
  `tutorial_desc` varchar(200) DEFAULT NULL,
  `user_id` int(11) NOT NULL,
  PRIMARY KEY (`tutorial_id`),
  KEY `fk_tutorial_user_id` (`user_id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tuiti`.`tutorials`
--
INSERT INTO `tuiti`.`tutorials` (`tutorial_id`,`tutorial_name`,`tutorial_desc`,`user_id`) VALUES 
 (1,'recipie','egg',0);

--
-- Definition of table `tuiti`.`users`
--
CREATE TABLE  `tuiti`.`users` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `newcolumn` int(11) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tuiti`.`users`
--



/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
