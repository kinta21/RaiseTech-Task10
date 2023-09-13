package com.student.crudapi.controller;

import com.student.crudapi.entity.Music;
import com.student.crudapi.service.MusicService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


@RestController
public class MusicController {

    private MusicService musicService;


    public  MusicController(MusicService musicService){
        this.musicService = musicService;

    }

    @GetMapping("/musics")
    public List<Music> musics(){
        List<Music> musics = musicService.findAll();
        return musics;
    }
    @GetMapping("/musics/{id}")
    public Optional<Music> findById(@PathVariable int id) throws Exception {
        Optional<Music> musics = musicService.findById(id);
        return musics;
    }
}
