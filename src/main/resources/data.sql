INSERT INTO USUARIO(nome, email, senha) VALUES('Aluno', 'aluno@email.com', '123456');
INSERT INTO USUARIO(nome, email, senha) VALUES('Aluno1', 'aluno1@email.com', '123446');

INSERT INTO CURSO(nome, categoria) VALUES('Criando coisas novas', 'Criatividade');
INSERT INTO CURSO(nome, categoria) VALUES('Inovacao', 'Design Thinking');

INSERT INTO TOPICO(titulo, mensagem, data_criacao, status, autor_id, curso_id) VALUES('Comentario 1', 'Legal, teremos novos modulos?', '2019-05-05 18:00:00', 'NAO_RESPONDIDO', 1, 1);
INSERT INTO TOPICO(titulo, mensagem, data_criacao, status, autor_id, curso_id) VALUES('Comentario 2', 'Criticas, bem confuso', '2019-05-05 19:00:00', 'NAO_RESPONDIDO', 1, 1);
INSERT INTO TOPICO(titulo, mensagem, data_criacao, status, autor_id, curso_id) VALUES('Comentario 3', 'Entendi, mas podemos conversar?', '2019-05-05 20:00:00', 'NAO_RESPONDIDO', 1, 2);


INSERT INTO LIVRO(nome, nomeUsuario, plano, senha) VALUES('Chapeuzinho vermelho em realidade aumentada','Ketlin', 'Premium', '123456');

INSERT INTO LIVRO(nome, nomeUsuario, plano, senha) VALUES('Ilustracoes e historias infantis com animacoes','Lari', 'Vip', '123356');