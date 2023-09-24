package com.student.crudapi.entity;

public class Music {
    private int id;
    private String composer;
    private String representativeSong;

    public Music(String composer, String representativeSong) {
        this.composer = composer;
        this.representativeSong = representativeSong;
    }

    public Music(int id, String composer, String representativeSong) {
        this.id = id;
        this.composer = composer;
        this.representativeSong = representativeSong;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getComposer() {
        return composer;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }

    public String getRepresentativeSong() {
        return representativeSong;
    }

    public void setRepresentativeSong(String representativeSong) {
        this.representativeSong = representativeSong;
    }
}
