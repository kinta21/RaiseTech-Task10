package com.student.crudapi.mapper;

import com.student.crudapi.entity.Music;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Optional;

@Mapper
public interface MusicMapper {
    @Select("SELECT * FROM musics")
    List<Music> findAll();

    @Select("SELECT * FROM musics WHERE id = #{id}")
    Optional<Music> findById(int id);
}
