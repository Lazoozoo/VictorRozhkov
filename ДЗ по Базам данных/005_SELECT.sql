/*Выборка 'Клиенты с нулевым балансом.'*/
SELECT cl.Full_Name, acc.Ballance FROM contract AS c, account AS acc, client AS cl 
    WHERE acc.Ballance = 0 AND acc.Contract = c.id AND c.Client = cl.id;

/*Выборка 'Cумма по операции "Снятие" каждым клиентом'*/
SELECT cl.Full_Name, op.Operation_Type, SUM(op.Amount) FROM operation_type AS op, account AS acc, contract AS c, client AS cl
	WHERE cl.id = c.Client AND c.id = acc.Contract AND acc.id = op.Account AND op.Operation_Type LIKE '%Снятие%'
	GROUP BY Full_Name;

/*Выборка 'Самый богатый клиент из категории баланса счета от 100 до 1000'*/
SELECT b.Full_Name AS 'Person', MAX(b.Ballance) AS 'Max ballance' FROM
	(SELECT cl.Full_Name, acc.Ballance FROM account AS acc, client AS cl, contract AS c
	 WHERE acc.Ballance BETWEEN 100 AND 1000 AND acc.Contract = c.id AND c.Client = cl.id) AS b; 