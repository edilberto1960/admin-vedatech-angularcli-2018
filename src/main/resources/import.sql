/* Populate tabla clientes */
INSERT INTO bank_account (name_bank, account_number, create_at, email, phone, balance) VALUES('Banorte', '99669944','2018-01-01', 'banorte@banorte.com','11111','10352,36' );
INSERT INTO bank_account (name_bank, account_number, create_at, email, phone, balance) VALUES('Banamex', '85229566','2018-05-11', 'banamez@banamex.com.mx','4555666','12456.75' );
INSERT INTO bank_account (name_bank, account_number, create_at, email, phone, balance) VALUES('ScotianBank', '36633550','2018-06-09', 'scotian@scotianbank.com','33366555','15600' );
INSERT INTO bank_account (name_bank, account_number, create_at, email, phone, balance) VALUES('Santander', '77111222','2018-07-12', 'santander@santander.com','1222555','18950.35' );

/* Populate Tabla Customers Account */
INSERT INTO customer_account (name_customer, account_number, create_at, email, phone, balance) VALUES('Tiendas Soriana S.A.', '6556','2018-01-01', 'general@cia.com','456666','15666.36');
INSERT INTO customer_account (name_customer, account_number, create_at, email, phone, balance) VALUES('Supermercados Int. HEB S.A.', '455','2018-01-01', 'bolsas@delta.com','669999','12659.36');
INSERT INTO customer_account (name_customer, account_number, create_at, email, phone, balance) VALUES('Walmart de Mexico S.A.', '369','2018-01-01', 'supplier@carton.com','2522233','20456.36');
INSERT INTO customer_account (name_customer, account_number, create_at, email, phone, balance) VALUES('Grains & Co.', '156','2018-01-01', 'grains@food.com','69996644','9065.36' );
INSERT INTO customer_account (name_customer, account_number, create_at, email, phone, balance) VALUES('Foods & Grains Co.', '233','2018-01-01', 'food@fg.com','5666444','11000.36');


/* Populate Table Supplier Account*/
INSERT INTO supplier_account (name_supplier, account_number, create_at, email, phone, balance) VALUES('Cia Genaral de Viveres S.A.', '6556','2018-01-01', 'general@cia.com','456666','12896.36');
INSERT INTO supplier_account (name_supplier, account_number, create_at, email, phone, balance) VALUES('Bolsas Delta Int. HEB S.A.', '455','2018-01-01', 'bolsas@delta.com','669999','22689.36');
INSERT INTO supplier_account (name_supplier, account_number, create_at, email, phone, balance) VALUES('Machinery de Mexico S.A.', '369','2018-01-01', 'supplier@carton.com','2522233','26456.36');
INSERT INTO supplier_account (name_supplier, account_number, create_at, email, phone, balance) VALUES('Grains & Co.', '156','2018-01-01', 'grains@food.com','69996644','19065.36' );
INSERT INTO supplier_account (name_supplier, account_number, create_at, email, phone, balance) VALUES('Foods & Grains Co.', '233','2018-01-01', 'food@fg.com','5666444','21000.36');

/* Populate Table Transactions */
INSERT INTO transactions (balance, check_amount, date, deposit_amount, description, expanded_to, operation_date, reference, status, id_bank) VALUES('2000', '6556','2018-01-01', '1000','varios','Mantenimiento','2018-01-01', '111','val','1');
INSERT INTO transactions (balance, check_amount, date, deposit_amount, description, expanded_to, operation_date, reference, status, id_bank) VALUES('8000', '6556','2018-01-01', '5000','varios','Mantenimiento','2018-01-01', '111','val','1');

