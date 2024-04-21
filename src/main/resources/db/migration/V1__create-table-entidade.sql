CREATE TABLE tb_entidade (
	id SERIAL PRIMARY KEY,
	nome VARCHAR(100) NOT NULL,
	cpf_cnpj VARCHAR(18) NOT NULL,
	in_ativo CHAR(1) CHECK (in_ativo IN ('S', 'N')) NOT NULL,
	email VARCHAR(255) NOT NULL
);