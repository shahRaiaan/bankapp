CREATE TABLE `bank`.`login` (
  
`username` VARCHAR(25) NOT NULL,
 
 `password` VARCHAR(25) NOT NULL,
 
 `security_question` VARCHAR(45) NOT NULL,
 
 `security_question_answer` VARCHAR(45) NOT NULL,
  
PRIMARY KEY (`username`));
