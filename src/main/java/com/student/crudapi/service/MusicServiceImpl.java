package com.student.crudapi.service;

import com.student.crudapi.entity.Music;
import com.student.crudapi.mapper.MusicMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MusicServiceImpl implements MusicService {

    private MusicMapper musicMapper;

    public MusicServiceImpl(MusicMapper musicMapper) {
        this.musicMapper = musicMapper;
    }

    @Override
    public List<Music> findAll(){
        return  musicMapper.findAll();
    }

    @Override
    public Optional<Music> findById(int id)  {
        return musicMapper.findById(id);
    }
}
