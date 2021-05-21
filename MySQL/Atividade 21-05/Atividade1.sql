/*
Crie um banco de dados para um serviço de um game Online , o nome do banco deverá ter
o seguinte nome db_generation_game_online, onde, o sistema trabalhará com as
informações dos personagens desse game.

O sistema trabalhará com 2 tabelas tb_personagem e tb_classe.

Crie uma tabela tb_classe utilizando a habilidade de abstração e determine 3 atributos
relevantes da classe para se trabalhar com o serviço desse game Online.

Crie uma tabela tb_personagem e utilizando a habilidade de abstração e determine 5
atributos relevantes dos funcionários para se trabalhar com o serviço desse game Online
(não esqueça de criar a foreign key de tb_classe nesta tabela).

Popule esta tabela classe com até 5 dados.

Popule esta tabela personagem com até 8 dados.

Faça um select que retorne os personagens com o poder de ataque maior do que 2000.

Faça um select trazendo os personagens com poder de defesa entre 1000 e 2000.

Faça um select utilizando LIKE buscando os personagens com a letra C.

Faça um um select com Inner join entre tabela classe e personagem.

Faça um select onde traga todos os personagem de uma classe específica (exemplo todos
os personagens que são arqueiros).
*/
CREATE DATABASE db_generation_game_online;
USE db_generation_game_online;
CREATE TABLE tb_classe(
	classe_id INT AUTO_INCREMENT NOT NULL,
    nome_classe VARCHAR(255) NOT NULL,
    role_classe VARCHAR(255) NOT NULL, -- Papel da classe(tanque,suporte ou DANO)
    PRIMARY KEY (classe_id)
);
CREATE TABLE tb_personagem (
	id_personagem INT AUTO_INCREMENT NOT NULL,
    nome VARCHAR(255) NOT NULL,
    poder_atq INT NOT NULL,
    poder_def INT NOT NULL,
    classe_id INT NOT NULL,
    PRIMARY KEY(id_personagem),
    FOREIGN KEY(classe_id) REFERENCES tb_classe(classe_id)
);

INSERT INTO tb_classe (nome_classe,role_classe)
	VALUES ('Mago','Dano'),
    ('Cavaleiro','Tanque'),
    ('Assassino','Dano'),
    ('Druida','Suporte'),
    ('Sacerdote','Suporte');
    
INSERT INTO tb_personagem(nome,poder_atq,poder_def,classe_id)
	VALUES ('Shaolin Matador de Porco',5000,2500,3),
    ('Bixao Taca Runa',6000,1000,1),
    ('Levador de Porrada',1800,6000,2),
    ('Ventania Goodvibes',2500,3000,4),
    ('Padre Quemedo',4000,1800,5),
    ('Buneco de Academia',1900,6000,1),
    ('Rabino Bombado',4100,1900,5),
    ('Ninja da Quebrada',4900,2400,3);
    
UPDATE tb_personagem SET nome = 'Chunin da Quebrada' WHERE id_personagem = 8; -- correcao, esqueci de colocar um nome com C
    
SELECT * FROM tb_personagem WHERE poder_atq > 2000;

SELECT * FROM tb_personagem WHERE poder_def BETWEEN 1000 AND 2000;

SELECT * FROM tb_personagem WHERE nome LIKE 'c%';

SELECT * FROM tb_personagem 
INNER JOIN tb_classe 
ON tb_personagem.classe_id = tb_classe.classe_id;

SELECT tb_personagem.nome,tb_classe.nome_classe AS Classe
 FROM tb_personagem
INNER JOIN tb_classe
ON tb_personagem.classe_id = tb_classe.classe_id
WHERE nome_classe = 'Assassino';




    
    
