package com.student.crudapi.service;

import com.student.crudapi.entity.Music;

import java.util.List;

public interface MusicService {

    List<Music> findAll();

    Music findById(int id);

    Music createMusic(String composer, String representativeSong);

    void updateMusic(int id, String composer, String representativeSong) throws Exception;

    void deleteById(int id);


}
