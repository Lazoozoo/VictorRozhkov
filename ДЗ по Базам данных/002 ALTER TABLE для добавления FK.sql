ALTER TABLE `bank_db`.`contract` 
ADD CONSTRAINT `idКлиент`
  FOREIGN KEY (`id`)
  REFERENCES `bank_db`.`client` (`id`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;

ALTER TABLE `bank_db`.`contract` 
ADD CONSTRAINT `idМенеджер`
  FOREIGN KEY (`id`)
  REFERENCES `bank_db`.`manager` (`id`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;

ALTER TABLE `bank_db`.`account` 
ADD CONSTRAINT `idДоговор`
  FOREIGN KEY (`id`)
  REFERENCES `bank_db`.`contract` (`id`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;

ALTER TABLE `bank_db`.`operation` 
ADD CONSTRAINT `idСчет`
  FOREIGN KEY (`id`)
  REFERENCES `bank_db`.`account` (`id`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;
