/*
Crie um banco de dados para um serviço de um açougue ou uma quitanda, o nome do
banco deverá ter o seguinte nome db_cidade_das_carnes ou db_cidade_das_frutas, onde o
sistema trabalhará com as informações dos produtos desta empresa.

O sistema trabalhará com 2 tabelas tb_produto e tb_categoria.

siga exatamente esse passo a passo:

Crie uma tabela de categorias utilizando a habilidade de abstração e determine 3 atributos
relevantes do tb_categoria para se trabalhar com o serviço desse açougue.

Crie uma tabela de tb_produto e utilize a habilidade de abstração e determine 5 atributos
relevantes dos tb_produto para se trabalhar com o serviço desse açougue(não esqueça de
criar a foreign key de tb_categoria nesta tabela).

Popule esta tabela Categoria com até 5 dados.

Popule esta tabela Produto com até 8 dados.

Faça um select que retorne os Produtos com o valor maior do que 50 reais.

Faça um select trazendo os Produtos com valor entre 3 e 60 reais.

Faça um select utilizando LIKE buscando os Produtos com a letra C.

Faça um um select com Inner join entre tabela categoria e produto.

Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos
os produtos que são aves ou legumes).
*/

CREATE DATABASE db_cidade_das_carnes;
USE db_cidade_das_carnes;

CREATE TABLE tb_categoria (
	id_categoria INT AUTO_INCREMENT,
    nome_categoria VARCHAR(255),
    nr_freezer INT,
    PRIMARY KEY (id_categoria)
);

CREATE TABLE tb_produto (
	id_produto INT AUTO_INCREMENT,
    nome_prod VARCHAR(255),
    preco DECIMAL(6,2),
    qtdade_estoque INT,
    categoria INT NOT NULL,
    PRIMARY KEY (id_produto),
    FOREIGN KEY(categoria) REFERENCES tb_categoria(id_categoria)
    );
    
INSERT INTO tb_categoria (nome_categoria, nr_freezer)
	VALUES ('Aves',5),
    ('Suínos',2),
    ('Cortes Nobres Bovinos',1),
    ('Acessórios para churrasco',NULL),
    ('Cortes normais Bovinos',6);
    
INSERT INTO tb_produto(nome_prod,preco,qtdade_estoque,categoria)
	VALUES ('T-bone Wagyu KG',410.00, 5, 3),
    ('Costela bovina KG',30.00, 30, 5),
    ('Costeleta suína KG',25.00, 25, 2),
    ('Galeto KG ',20.00, 45, 1),
    ('Carvao 5 KG',18.00, 20, 4),
    ('Picanha KG',60.00, 15, 5),
    ('Panceta suina KG',22.00, 18, 2),
    ('Alcatra KG',55.00, 12, 5);
    
    
SELECT * FROM tb_produto WHERE preco > 50;
SELECT * FROM tb_produto WHERE preco BETWEEN 3 AND 60;
SELECT * FROM tb_produto WHERE nome_prod LIKE 'c%';
SELECT * FROM tb_produto INNER JOIN tb_categoria ON categoria = id_categoria;

SELECT * FROM tb_produto 
INNER JOIN tb_categoria 
ON categoria = id_categoria
WHERE nome_categoria = 'Aves';


    
    
