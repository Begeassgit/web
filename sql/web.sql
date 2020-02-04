

DROP TABLE IF EXISTS `user_t`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user_t` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_email` varchar(45) DEFAULT NULL,
  `user_password` varchar(45) DEFAULT NULL,
  `user_sex` varchar(2) DEFAULT NULL,
  `user_age` int(3) DEFAULT NULL,
  `user_career` varchar(15) DEFAULT NULL,
  `user_phone` varchar(11) DEFAULT NULL,
  `user_tag1` varchar(45) DEFAULT NULL,
  `user_tag2` varchar(45) DEFAULT NULL,
  `user_tag3` varchar(45) DEFAULT NULL,
  `user_tag4` varchar(45) DEFAULT NULL,
  `user_tag5` varchar(45) DEFAULT NULL,
  `user_tag6` varchar(45) DEFAULT NULL,
  `user_tag7` varchar(45) DEFAULT NULL,
  `user_tag8` varchar(45) DEFAULT NULL,
  `user_tag9` varchar(45) DEFAULT NULL,
  `user_tag10` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_t`
--

LOCK TABLES `user_t` WRITE;
/*!40000 ALTER TABLE `user_t` DISABLE KEYS */;
INSERT INTO `user_t` VALUES (1,'test@qq.com','123456','男',20,'学生','15744775588','个性化标签1','个性化标签2','个性化标签3','个性化标签4','个性化标签5','个性化标签6','个性化标签7','个性化标签8','个性化标签9','个性化标签10');
/*!40000 ALTER TABLE `user_t` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;
