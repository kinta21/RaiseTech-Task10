DROP TABLE IF EXISTS musics;

CREATE TABLE musics (
  id int unsigned AUTO_INCREMENT,
  composer VARCHAR(20) NOT NULL,
  representativeSong VARCHAR(20)NOT NULL,
  PRIMARY KEY(id)
);

INSERT INTO musics (composer, representativeSong) VALUES ("ショパン", "幻想のポロネーズ");
INSERT INTO musics (composer, representativeSong) VALUES ("バッハ", "G線上のアリア");
INSERT INTO musics (composer, representativeSong) VALUES ("ベートーヴェン", "交響曲第７番");
