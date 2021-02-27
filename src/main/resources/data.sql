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

INSERT INTO CONTA(ID, DATA, DESCRICAO, NUMERO, TIPO, USUARIO_ID )VALUES(1, DATE '2001-01-01', 'CONTA DE TESTE1', 'teste1', 'CONTA_CREDITO', 1);
INSERT INTO CONTA(ID, DATA, DESCRICAO, NUMERO, TIPO, USUARIO_ID )VALUES(2, DATE '2001-01-01', 'CONTA DE TESTE3', 'teste1', 'CONTA_DEBITO', 1);


INSERT INTO PLANO_CONTA(ID, DESCRICAO, LOGIN, PADRAO, TIPO_MOVIMENTO )VALUES(1, 'Teste de plano de conta1', 'login', 1, 'DESPESA');
INSERT INTO PLANO_CONTA(ID, DESCRICAO, LOGIN, PADRAO, TIPO_MOVIMENTO )VALUES(2, 'Teste de plano de conta2', 'login', 1, 'RECEITA');


INSERT INTO LANCAMENTO(ID, DATA, DESCRICAO, TIPO_MOVIMENTO, VALOR, CONTA_ID, PLANO_CONTA_ID )VALUES(1, DATE '2001-01-01', 'Lançamento de débito', 'DESPESA', 1050.55, 1, 1);
INSERT INTO LANCAMENTO(ID, DATA, DESCRICAO, TIPO_MOVIMENTO, VALOR, CONTA_ID, PLANO_CONTA_ID )VALUES(2, DATE '2001-01-01', 'Lançamento de débito', 'RECEITA', 1050.55, 2, 2);








