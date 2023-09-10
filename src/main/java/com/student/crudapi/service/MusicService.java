package com.student.crudapi.service;

import com.student.crudapi.entity.Music;

import java.util.List;
import java.util.Optional;

public interface MusicService {

    List<Music> findAll();

    Optional<Music> findById(int id) throws Exception;
}
