INSERT INTO Produto (cod_produto, des_produto,sta_status) VALUES ('1', 'Produto teste 1','A');
INSERT INTO Produto (cod_produto, des_produto,sta_status) VALUES ('2', 'teste02','A');
INSERT INTO PRODUTO_COSIF (COD_PRODUTO, COD_COSIF,COD_CLASSSIFICACAO,STA_STATUS) VALUES ('1', '0.0.0.00.01','01.01','A');
INSERT INTO PRODUTO_COSIF (COD_PRODUTO, COD_COSIF,COD_CLASSSIFICACAO,STA_STATUS) VALUES ('1', '0.0.0.00.02','01.02','A');
INSERT INTO PRODUTO_COSIF (COD_PRODUTO, COD_COSIF,COD_CLASSSIFICACAO,STA_STATUS) VALUES ('1', '0.0.0.00.03','01.03','A');
INSERT INTO PRODUTO_COSIF (COD_PRODUTO, COD_COSIF,COD_CLASSSIFICACAO,STA_STATUS) VALUES ('1', '0.0.0.00.04','01.04','A');
INSERT INTO PRODUTO_COSIF (COD_PRODUTO, COD_COSIF,COD_CLASSSIFICACAO,STA_STATUS) VALUES ('2', '0.0.0.10.01','02.01','A');
INSERT INTO PRODUTO_COSIF (COD_PRODUTO, COD_COSIF,COD_CLASSSIFICACAO,STA_STATUS) VALUES ('2', '0.0.0.10.02','02.02','A');
INSERT INTO PRODUTO_COSIF (COD_PRODUTO, COD_COSIF,COD_CLASSSIFICACAO,STA_STATUS) VALUES ('2', '0.0.0.10.03','02.03','A');
INSERT INTO PRODUTO_COSIF (COD_PRODUTO, COD_COSIF,COD_CLASSSIFICACAO,STA_STATUS) VALUES ('2', '0.0.0.10.04','02.04','A');
INSERT INTO MOVIMENTO_MANUAL (DAT_MES, DAT_ANO,NUM_LANCAMENTO,COD_PRODUTO,COD_COSIF,DAT_MOVIMENTO,VAL_VALOR,DES_DESCRICAO,COD_USUARIO) VALUES (02, 2020,1,'1','0.0.0.00.01','2020-01-01',20,'TESTE 0101','USUARIO');
INSERT INTO MOVIMENTO_MANUAL (DAT_MES, DAT_ANO,NUM_LANCAMENTO,COD_PRODUTO,COD_COSIF,DAT_MOVIMENTO,VAL_VALOR,DES_DESCRICAO,COD_USUARIO) VALUES (02, 2020,2,'1','0.0.0.00.02','2020-01-01',20,'TESTE 0101','USUARIO');
