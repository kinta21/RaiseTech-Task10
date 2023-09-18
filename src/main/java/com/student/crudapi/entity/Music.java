package com.student.crudapi.entity;

import lombok.Data;

@Data
public class Music {
    private int id;
    private String composer;
    private String representativeSong;

    public Music(String composer, String representativeSong) {
    }
}
