ALTER TABLE contract 
ADD CONSTRAINT idClient
  FOREIGN KEY (Client)
  REFERENCES client (id);

ALTER TABLE contract 
ADD CONSTRAINT idManager
  FOREIGN KEY (Manager)
  REFERENCES manager (id);

ALTER TABLE account 
ADD CONSTRAINT idContract
  FOREIGN KEY (Contract)
  REFERENCES contract (id);

ALTER TABLE operation_type
ADD CONSTRAINT idAccount
  FOREIGN KEY (Account)
  REFERENCES account (id);
