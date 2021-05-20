/*
Crie um banco de dados para um e commerce, onde o sistema trabalhará com as
informações dos produtos deste ecommerce.
Crie uma tabela produtos e utilizando a habilidade de abstração e determine 5 atributos
relevantes dos produtos para se trabalhar com o serviço deste ecommerce.
Popule esta tabela com até 8 dados;
Faça um select que retorne os produtos com o valor maior do que 500.
Faça um select que retorne os produtos com o valor menor do que 500.
Ao término atualize um dado desta tabela através de uma query de atualização.
*/
CREATE DATABASE db_ecommerce;

USE db_ecommerce;

CREATE TABLE tb_produtos(
	id_produto INT AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    preco DECIMAL(10,2),
    em_estoque BOOLEAN,
    qtdade INT NULL,
    PRIMARY KEY(id_produto)
    
);

INSERT INTO tb_produtos(nome,preco,em_estoque,qtdade) VALUES ("Tenis Vans Old Skool preto/branco", 399.00, true, 100);
INSERT INTO tb_produtos(nome,preco,em_estoque,qtdade) VALUES ("Tenis Nike UltraBoost preto", 799.00, true, 50);
INSERT INTO tb_produtos(nome,preco,em_estoque,qtdade) VALUES ("Tenis Vans Old Skool vermelho", 399.00, true, 50);
INSERT INTO tb_produtos(nome,preco,em_estoque,qtdade) VALUES ("Tenis Vans Mid Old Skool Preto", 399.00, true, 100);
INSERT INTO tb_produtos(nome,preco,em_estoque,qtdade) VALUES ("Tenis Nike Air Force 1", 699.00, true, 200);
INSERT INTO tb_produtos(nome,preco,em_estoque,qtdade) VALUES ("Tenis Nike Air Jordan", 799.00, true, 100);
INSERT INTO tb_produtos(nome,preco,em_estoque,qtdade) VALUES ("Tenis Adidas Yeezy Boost", 1099.00, false,NULL);
INSERT INTO tb_produtos(nome,preco,em_estoque,qtdade) VALUES ("Tenis Vans Ultra", 599.00, true, 50);


SELECT * FROM tb_produtos WHERE preco > 500;

SELECT * FROM tb_produtos WHERE preco < 500;

