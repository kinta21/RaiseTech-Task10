package com.student.crudapi.controller;

import com.student.crudapi.entity.Music;
import lombok.Data;

@Data
public class MusicResponse {

    private int id;
    private String composer;
    private String representativeSong;
    public MusicResponse(Music music) {
    }
}
