/*
Crie um banco de dados para um serviço de farmácia de uma empresa, o nome do banco
deverá ter o seguinte nome db_farmacia_do_bem, onde o sistema trabalhará com as
informações dos produtos desta empresa.

O sistema trabalhará com 2 tabelas tb_produto e tb_categoria.

siga exatamente esse passo a passo:

Crie uma tabela de categorias utilizando a habilidade de abstração e determine 3 atributos
relevantes do tb_categoria para se trabalhar com o serviço desta farmacia.

Crie uma tabela de tb_produto e utilizando a habilidade de abstração e determine 5
atributos relevantes dos tb_produto para se trabalhar com o serviço deste farmacia(não
esqueça de criar a foreign key de tb_categoria nesta tabela).

Popule esta tabela Categoria com até 5 dados.

Popule esta tabela Produto com até 8 dados.

Faça um select que retorne os Produtos com o valor maior do que 50 reais.

Faça um select trazendo os Produtos com valor entre 3 e 60 reais.

Faça um select utilizando LIKE buscando os Produtos com a letra B.

Faça um um select com Inner join entre tabela categoria e produto.

Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos
os produtos que são cosméticos).
*/

CREATE DATABASE db_farmacia_do_bem;
USE db_farmacia_do_bem;

CREATE TABLE tb_categoria(
	id_categoria INT AUTO_INCREMENT,
    nome_cat VARCHAR(255) NOT NULL,
    comissao DECIMAL(4,2) NULL,
    PRIMARY KEY (id_categoria)
);

CREATE TABLE tb_produto(
	id_produto INT AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    preco DECIMAL(7,2) NOT NULL,
    em_estoque BOOLEAN NOT NULL,
    categoria INT NOT NULL,
    PRIMARY KEY(id_produto),
    FOREIGN KEY(categoria) REFERENCES tb_categoria(id_categoria)	
);

INSERT INTO tb_categoria(nome_cat,comissao)
VALUES ('Cosméticos',0.20),
('Medicamentos',0.1),
('Produtos de Higiene',0.15),
('Suplementos',0.18),
('Conveniência',0.12);

INSERT INTO tb_produto(nome, preco, em_estoque, categoria)
VALUES ('Novalgina 500mg 12 cp',12.90,true,2),
('BCAA Integralmedica 240g',89.00,true,4),
('Pasta de dente Colgate',8.90,true,3),
('Hidratante de Rosto',22.0,true,1),
('Protetor Solar Nivea',30.90,false,1),
('Coca Cola 2 L',10.0,true,5),
('Ibuprofeno 600mg',15.90,true,2),
('Chicletes Trident menta',2.90,true,5);

SELECT * FROM tb_produto WHERE preco > 50;
SELECT * FROM tb_produto WHERE preco BETWEEN 3 AND 60;

SELECT * FROM tb_produto WHERE nome LIKE 'b%';

SELECT * FROM tb_produto INNER JOIN tb_categoria
ON tb_produto.categoria = tb_categoria.id_categoria;

SELECT nome, nome_cat FROM tb_produto INNER JOIN tb_categoria
ON tb_produto.categoria = tb_categoria.id_categoria
WHERE nome_cat = 'Cosméticos';
