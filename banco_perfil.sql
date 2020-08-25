
CREATE TABLE perfil
(
id_perfil serial NOT NULL, 
nome_perfil character varying(150), 
cota integer,
visitante boolean, 
bonus boolean, 
lotacao integer, 
tempo_turno int, 
CONSTRAINT pk_id_perfil PRIMARY KEY (id_perfil)
);

CREATE TABLE perfil_laboratorio
(
id_perfil_laboratorio serial NOT NULL,
id_perfil integer NOT NULL, 
id_laboratorio integer NOT NULL,
CONSTRAINT pk_perfil_laboratorio PRIMARY KEY (id_perfil_laboratorio),
CONSTRAINT fk_id_perfil FOREIGN KEY (id_perfil) REFERENCES perfil (id_perfil) MATCH SIMPLE ON UPDATE NO ACTION ON DELETE NO ACTION, 
CONSTRAINT fk_id_laboratorio FOREIGN KEY (id_laboratorio) REFERENCES laboratorio(id_laboratorio) MATCH SIMPLE ON UPDATE NO ACTION ON DELETE NO ACTION
);