package com.student.crudapi.controller;

import com.student.crudapi.entity.Music;

public class MusicResponse{
    private  int id;
    private  String composer;
    private String representativeSong;

    public MusicResponse(Music music) {
        this.id = music.getId();
        this.composer = music.getComposer();
        this.representativeSong = music.getRepresentativeSong();
    }

    public int getId() {
        return id;
    }

    public String getComposer() {
        return composer;
    }

    public String getRepresentativeSong() {
        return representativeSong;
    }
}
