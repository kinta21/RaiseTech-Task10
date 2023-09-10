DROP TABLE IF EXISTS musics;

CREATE TABLE musics (
  id int unsigned AUTO_INCREMENT,
  composer VARCHAR(20) NOT NULL,
  representative_song VARCHAR(20)NOT NULL,
  PRIMARY KEY(id)
);

INSERT INTO musics (composer, representative_song) VALUES ("ショパン", "幻想のポロネーズ");
INSERT INTO musics (composer, representative_song) VALUES ("バッハ", "G線上のアリア");
INSERT INTO musics (composer, representative_song) VALUES ("ベートーヴェン", "交響曲第７番");
