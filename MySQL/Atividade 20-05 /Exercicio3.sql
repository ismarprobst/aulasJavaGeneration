 /*
	Crie um banco de dados para um registro de uma escola, onde o sistema trabalhará com as
informações dos alunos deste registro dessa escola.
	Crie uma tabela alunos/a/e e utilizando a habilidade de abstração e determine 5 atributos
relevantes dos alunos/a/e para se trabalhar com o serviço dessa escola.
	Popule esta tabela com até 8 dados;
	Faça um select que retorne o/as alunos/a/e com a nota maior do que 7.
	Faça um select que retorne o/as alunos/a/e com a nota menor do que 7.
	Ao término atualize um dado desta tabela através de uma query de atualização.
 */


CREATE DATABASE db_escola;
USE db_escola;
CREATE TABLE tb_alunos(
	id_aluno INT UNIQUE AUTO_INCREMENT,
    nome VARCHAR(255),
    sobrenome VARCHAR(255),
    data_nasc DATE,
    turma VARCHAR(255),
    PRIMARY KEY(id_aluno)
);

ALTER TABLE tb_alunos DROP COLUMN turma; -- nao queria mais essa coluna
ALTER TABLE tb_alunos ADD COLUMN nota DECIMAL(2,2); -- criada coluna de notas no lugar
ALTER TABLE tb_alunos MODIFY COLUMN nota DECIMAL(10,2); -- alterado o tipo de dado

INSERT INTO tb_alunos (nome, sobrenome,data_nasc,nota)
VALUES ('Joaozinho','Silveira','2000-05-01','9.0'),
('Maria','Antonieta','2001-06-30','8.5'),
('Ricardo','Gonzales','2000-12-10','7.1'),
('Juliana','Batista','2002-01-27','8.3'),
('Carlos','Deschamps','2000-02-28','10'),
('Silvia','Moreira','2000-07-20','9.8'),
('Ana','Santos','2000-05-11','9.1'),
('Andre','Silva','2000-04-03','8.6');



SELECT * FROM tb_alunos WHERE nota > 7.0;

SELECT * FROM tb_alunos WHERE nota < 7.0;

UPDATE tb_alunos set nota = 10.0 WHERE id_aluno = 2;

SELECT * FROM tb_alunos;





