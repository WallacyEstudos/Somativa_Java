CREATE TABLE manutencao (
    id SERIAL PRIMARY KEY,
    data_manutencao DATE NOT NULL,
    tipo VARCHAR(50) NOT NULL,
    descricao TEXT NOT NULL,
    status VARCHAR(50) NOT NULL,
    equipamento_id INT REFERENCES equipamento(id) -- Assumindo que você já tenha uma tabela 'equipamento'
);
