/*
Crie um banco de dados para um serviço de pizzaria de uma empresa, o nome do banco
deverá ter o seguinte nome db_pizzaria_legal, onde o sistema trabalhará com as
informações dos produtos desta empresa.

O sistema trabalhará com 2 tabelas tb_pizza e tb_categoria.

siga exatamente esse passo a passo:

Crie uma tabela de categorias utilizando a habilidade de abstração e determine 3 atributos
relevantes do tb_categoria para se trabalhar com o serviço dessa pizzaria.

Crie uma tabela de tb_pizza e utilizando a habilidade de abstração e determine 5 atributos
relevantes dos tb_produto para se trabalhar com o serviço dessa pizzaria(não esqueça de
criar a foreign key de tb_categoria nesta tabela).

Popule esta tabela Categoria com até 5 dados.

Popule esta tabela pizza com até 8 dados.

Faça um select que retorne os Produtos com o valor maior do que 45 reais.

Faça um select trazendo os Produtos com valor entre 29 e 60 reais.

Faça um select utilizando LIKE buscando os Produtos com a letra C.

Faça um um select com Inner join entre tabela categoria e pizza.

Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos
os produtos que são pizza doce).
*/

CREATE DATABASE db_pizzaria_legal;
USE db_pizzaria_legal;
CREATE TABLE tb_categoria(
id_categoria INT AUTO_INCREMENT NOT NULL,
nome_categoria VARCHAR(255),
preco DECIMAL(5,2),
PRIMARY KEY (id_categoria)
);
CREATE TABLE tb_pizza(
id_pizza INT AUTO_INCREMENT,
nome_pizza VARCHAR(255),
em_estoque BOOLEAN,
vegetariana BOOLEAN,
categoria INT NOT NULL,
PRIMARY KEY (id_pizza),
FOREIGN KEY (categoria) REFERENCES tb_categoria(id_categoria)
);

INSERT INTO tb_categoria(nome_categoria,preco)
VALUES ('Salgada Grande',55.00),
('Salgada Media',45.00),
('Salgada Pequena',28.00),
('Doce Grande',50.00),
('Doce Pequena',30.00);

INSERT INTO tb_pizza(nome_pizza,em_estoque,vegetariana,categoria)
VALUES ('Calabresa',true,false,1),
('Calabresa',true,false,2),
('Calabresa',true,false,3),
('Chocolate',true,true,4),
('Chocolate',true,true,5),
('Frango com Catupiry',false,false,1),
('Frango com Catupiry',true,false,2),
('Tomate com Rúcula',true,true,1);

SELECT * FROM tb_categoria
INNER JOIN tb_pizza ON tb_categoria.id_categoria = tb_pizza.categoria
WHERE preco > 45.00;

SELECT * FROM tb_categoria
INNER JOIN tb_pizza ON tb_categoria.id_categoria = tb_pizza.categoria
WHERE preco BETWEEN 29.00 AND 60.00;

SELECT * FROM tb_categoria
INNER JOIN tb_pizza ON tb_categoria.id_categoria = tb_pizza.categoria
WHERE nome_pizza LIKE 'c%';

SELECT * FROM tb_categoria
INNER JOIN tb_pizza ON tb_categoria.id_categoria = tb_pizza.categoria
WHERE nome_categoria LIKE '%doce%';









