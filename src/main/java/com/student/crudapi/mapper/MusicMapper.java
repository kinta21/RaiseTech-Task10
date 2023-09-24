package com.student.crudapi.mapper;

import com.student.crudapi.entity.Music;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Optional;

@Mapper
public interface MusicMapper {
    @Select("SELECT * FROM musics")
    List<Music> findAll();

    @Select("SELECT * FROM musics WHERE id = #{id}")
    Optional<Music> findById(int id);


    @Insert("INSERT INTO musics (composer, representativeSong) VALUES (#{composer},#{representativeSong})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void createMusic (Music createMusic);


    @Update("UPDATE musics SET musics = #{composer}, #{representativeSong} WHERE id = #{id}")
    void setUpdateMusic(Music updateMusic);

    @Delete("DELETE FROM names WHERE id = #{id}")
    void deleteById(int id);
}

