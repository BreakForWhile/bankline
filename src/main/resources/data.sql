INSERT INTO cliente(id, name) VALUES (100000, 'Cristiano');
INSERT INTO cliente(id, name) VALUES (100001, 'Luana');
INSERT INTO cliente(id, name) VALUES (100002, 'André');
INSERT INTO cliente(id, name) VALUES (100003, 'Rodrigo');
INSERT INTO cliente(id, name) VALUES (100004, 'Rafael');
INSERT INTO cliente(id, name) VALUES (100005, 'Erika');
INSERT INTO cliente(id, name) VALUES (100006, 'Sumido'); 

INSERT INTO USUARIO (id, cpf, login, nome, redefinir_senha, senha, senha_temporaria) VALUES(1, '54545454', 'teste', 'nome', '1', '123', '');
INSERT INTO USUARIO (id, cpf, login, nome, redefinir_senha, senha, senha_temporaria) VALUES(2, '54545454', 'teste', 'nome', '1', '123', '');
INSERT INTO USUARIO (id, cpf, login, nome, redefinir_senha, senha, senha_temporaria) VALUES(3, '54545454', 'teste', 'nome', '1', '123', '');
INSERT INTO USUARIO (id, cpf, login, nome, redefinir_senha, senha, senha_temporaria) VALUES(4, '54545454', 'teste', 'nome', '1', '123', '');

INSERT INTO CONTA(ID, DATA, DESCRICAO, NUMERO, USUARIO_ID )VALUES(1, DATE '2001-01-01', 'CONTA DE TESTE1', 'teste1', 1);
INSERT INTO CONTA(ID, DATA, DESCRICAO, NUMERO, USUARIO_ID )VALUES(2, DATE '2001-01-01', 'CONTA DE TESTE2', 'teste2', 2);


INSERT INTO CONTA_CREDITO(ID)VALUES(1);
INSERT INTO CONTA_DEBITO (ID)VALUES(2);


INSERT INTO PLANO_CONTA(ID, DESCRICAO, LOGIN, PADRAO )VALUES(1, 'Teste de plano de conta1', 'login', 1);
INSERT INTO PLANO_CONTA_DESPESA(ID)VALUES(1);


INSERT INTO PLANO_CONTA(ID, DESCRICAO, LOGIN, PADRAO )VALUES(2, 'Teste de plano de conta2', 'login', 1);
INSERT INTO PLANO_CONTA_RECEITA(ID)VALUES(2);

INSERT INTO LANCAMENTO(ID, DATA, DESCRICAO, VALOR, CONTA_ID, PLANO_CONTA_ID )VALUES(1, DATE '2001-01-01', 'Pagamento de luz',  80.66, 2,  1);
INSERT INTO LANCAMENTO(ID, DATA, DESCRICAO, VALOR, CONTA_ID, PLANO_CONTA_ID )VALUES(2, DATE '2001-01-01', 'Salário', 1055.66, 1, 2);








