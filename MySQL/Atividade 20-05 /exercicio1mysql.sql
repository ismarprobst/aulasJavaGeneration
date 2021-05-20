/*
Crie um banco de dados para um serviço de RH de uma empresa, onde o sistema
trabalhará com as informações dos funcionaries desta empresa.
Crie uma tabela de funcionaries e utilizando a habilidade de abstração e determine 5
atributos relevantes dos funcionaries para se trabalhar com o serviço deste RH.
Popule esta tabela com até 5 dados;
Faça um select que retorne os funcionaries com o salário maior do que 2000.
Faça um select que retorne os funcionaries com o salário menor do que 2000.
Ao término atualize um dado desta tabela através de uma query de atualização.
*/

CREATE DATABASE db_rh;

USE db_rh;

CREATE TABLE tb_funcionarios (
	id_func INT AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    sobrenome VARCHAR(255) NOT NULL,
    cargo VARCHAR(255) NOT NULL,
    salario VARCHAR(255),
    PRIMARY KEY (id_func)
);

INSERT INTO tb_funcionarios(nome,sobrenome,cargo,salario)
VALUES ('Joao','Silva',"auxiliar administrativo",1500.00),
('Joao','Santos',"auxiliar administrativo",1600.00),
('Alberto','Casanova',"auxiliar administrativo",1500.00),
('Maria','Oliveira',"Gerente",3000.00),
('Ana','Barbosa',"estagiária",1100.00);

SELECT * FROM tb_funcionarios;

ALTER TABLE tb_funcionarios MODIFY COLUMN salario DECIMAL(10,2); -- tive que alterar a coluna salario pois cometi um erro

SELECT * FROM tb_funcionarios WHERE salario > 2000;

SELECT * FROM tb_funcionarios WHERE salario < 2000;

UPDATE tb_funcionarios SET cargo = 'Gerente' WHERE id_func = 2;

SELECT * FROM tb_funcionarios;