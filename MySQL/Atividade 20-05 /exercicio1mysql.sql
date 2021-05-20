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