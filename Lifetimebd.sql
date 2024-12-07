USE LifeTimeDB;

 SELECT * FROM Configuracao_Notificacao;

-- CREATE TABLE Usuario (
--    id INT AUTO_INCREMENT PRIMARY KEY,
--    nome_completo VARCHAR(255) NOT NULL,
--    usuario VARCHAR(100) NOT NULL UNIQUE,
--    cpf VARCHAR(14) NOT NULL UNIQUE,
--    senha VARCHAR(255) NOT NULL,
--    email VARCHAR(255) NOT NULL,
--    cargo VARCHAR(100),
--    empresa VARCHAR(100),
--    carga_horaria INT,
--    idade INT,
--    peso DECIMAL(5,2),
--    usa_oculos BOOLEAN,
--    faz_uso_remedio BOOLEAN,
--    deficiencia_fisica BOOLEAN,
--    transtorno_mental BOOLEAN,
--    atividade_fisica BOOLEAN
-- );

-- CREATE TABLE status_diario (
--    id INT AUTO_INCREMENT PRIMARY KEY,
--    usuario_id INT NOT NULL,
--    data_registro DATE NOT NULL,
--    humor ENUM('Muito Bom', 'Bom', 'Ruim', 'Muito Ruim') NOT NULL,
--    sono ENUM('Muito Bom', 'Bom', 'Ruim', 'Muito Ruim') NOT NULL,
--    fisico ENUM('Muito Bom', 'Bom', 'Ruim', 'Muito Ruim') NOT NULL,
--    estresse ENUM('Muito Bom', 'Bom', 'Ruim', 'Muito Ruim') NOT NULL,
--    FOREIGN KEY (usuario_id) REFERENCES Usuario(id)
-- );



-- CREATE TABLE Configuracao_Notificacao (
--    id INT AUTO_INCREMENT PRIMARY KEY,
--    usuario_id INT NOT NULL,
--    ativar_notificacoes BOOLEAN NOT NULL DEFAULT FALSE,
--    notificacao_postura BOOLEAN NOT NULL DEFAULT FALSE,
--    notificacao_visao BOOLEAN NOT NULL DEFAULT FALSE,
--    notificacao_beber_agua BOOLEAN NOT NULL DEFAULT FALSE,
--    notificacao_pausa BOOLEAN NOT NULL DEFAULT FALSE,
--    intervalo_tempo ENUM('15 min', '30 min', '1H', '1:30H') DEFAULT NULL,
--    FOREIGN KEY (usuario_id) REFERENCES Usuario(id)
-- );