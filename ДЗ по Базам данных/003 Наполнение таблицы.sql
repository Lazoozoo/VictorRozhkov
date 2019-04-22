INSERT INTO `BANK_DB`.`client` (`ФИО`, `Пасспорт(серия/номер)`, `Телефон`) VALUES ('Жук Иван Иванович', 'НВ7563498', '80447224536');
INSERT INTO `BANK_DB`.`client` (`ФИО`, `Пасспорт(серия/номер)`, `Телефон`) VALUES ('Герасимова Галина Павловна', 'HB4567234', '80445446789');
INSERT INTO `BANK_DB`.`client` (`ФИО`, `Пасспорт(серия/номер)`, `Телефон`) VALUES ('Тесёлкин Олег Олегович', 'HB7634784', '80293243645');
INSERT INTO `BANK_DB`.`client` (`ФИО`, `Пасспорт(серия/номер)`, `Телефон`) VALUES ('Самураева Анна Сергеевна', 'HB3456998', '80293457856');
INSERT INTO `BANK_DB`.`client` (`ФИО`, `Пасспорт(серия/номер)`, `Телефон`) VALUES ('Иванов Фёдор Фёдорович', 'HB2355678', '80447644568');
INSERT INTO `BANK_DB`.`client` (`ФИО`, `Пасспорт(серия/номер)`, `Телефон`) VALUES ('Медведев Михаил Потапович', 'HB2355667', '80291243256');
INSERT INTO `BANK_DB`.`client` (`ФИО`, `Пасспорт(серия/номер)`, `Телефон`) VALUES ('Джигитов Сосо Иосифович', 'HB2345423', '80447893345');


INSERT INTO `bank_db`.`contract` (`Клиент`, `Менеджер`, `Дата_Создания`) VALUES ('1', '101', '2016-01-01');
INSERT INTO `bank_db`.`contract` (`Клиент`, `Менеджер`, `Дата_Создания`) VALUES ('2', '101', '2016-01-01');
INSERT INTO `bank_db`.`contract` (`Клиент`, `Менеджер`, `Дата_Создания`) VALUES ('3', '103', '2017-11-06');
INSERT INTO `bank_db`.`contract` (`Клиент`, `Менеджер`, `Дата_Создания`) VALUES ('4', '102', '2017-11-11');
INSERT INTO `bank_db`.`contract` (`Клиент`, `Менеджер`, `Дата_Создания`) VALUES ('5', '103', '2016-09-11');
INSERT INTO `bank_db`.`contract` (`Клиент`, `Менеджер`, `Дата_Создания`) VALUES ('6', '101', '2018-09-17');
INSERT INTO `bank_db`.`contract` (`Клиент`, `Менеджер`, `Дата_Создания`) VALUES ('7', '102', '2017-05-07');


INSERT INTO `BANK_DB`.`manager` (`ФИО`) VALUES ('Банкиров Дмитрий Эдуардович');
INSERT INTO `BANK_DB`.`manager` (`ФИО`) VALUES ('Стольникова Анна Альбертовна');
INSERT INTO `BANK_DB`.`manager` (`ФИО`) VALUES ('Самусенко Анатолий Валерьевич');


INSERT INTO `BANK_DB`.`account` (`Баланс`, `idДоговора`) VALUES ('0', '1000001');
INSERT INTO `BANK_DB`.`account` (`Баланс`, `idДоговора`) VALUES ('1200.56', '1000002');
INSERT INTO `BANK_DB`.`account` (`Баланс`, `idДоговора`) VALUES ('567.99', '1000003');
INSERT INTO `BANK_DB`.`account` (`Баланс`, `idДоговора`) VALUES ('4578.5', '1000004');
INSERT INTO `BANK_DB`.`account` (`Баланс`, `idДоговора`) VALUES ('35', '1000005');
INSERT INTO `BANK_DB`.`account` (`Баланс`, `idДоговора`) VALUES ('2000.78', '1000006');
INSERT INTO `BANK_DB`.`account` (`Баланс`, `idДоговора`) VALUES ('0', '1000007');


INSERT INTO `BANK_DB`.`operation` (`Сумма`, `Операция`, `idСчета`) VALUES ('1000', 'Пополнение', '10001');
INSERT INTO `BANK_DB`.`operation` (`Сумма`, `Операция`, `idСчета`) VALUES ('2100', 'Пополнение', '10003');
INSERT INTO `BANK_DB`.`operation` (`Сумма`, `Операция`, `idСчета`) VALUES ('25', 'Снятие', '10004');
INSERT INTO `BANK_DB`.`operation` (`Сумма`, `Операция`, `idСчета`) VALUES ('75', 'Перевод', '10002');
INSERT INTO `BANK_DB`.`operation` (`Сумма`, `Операция`, `idСчета`) VALUES ('65.90', 'Оплата', '10005');
INSERT INTO `BANK_DB`.`operation` (`Сумма`, `Операция`, `idСчета`) VALUES ('45.87', 'Оплата', '10001');
INSERT INTO `BANK_DB`.`operation` (`Сумма`, `Операция`, `idСчета`) VALUES ('35.67', 'Оплата', '10007');
INSERT INTO `BANK_DB`.`operation` (`Сумма`, `Операция`, `idСчета`) VALUES ('15', 'Снятие', '10006');
INSERT INTO `BANK_DB`.`operation` (`Сумма`, `Операция`, `idСчета`) VALUES ('10', 'Перевод', '10004');
INSERT INTO `BANK_DB`.`operation` (`Сумма`, `Операция`, `idСчета`) VALUES ('5', 'Снятие', '10007');
