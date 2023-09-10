package com.student.crudapi;

public class MusicCreateForm {
    private  int id;
    private String composer;
    private String representative_song;

    public MusicCreateForm(int id, String composer, String representative_song) {
        this.id = id;
        this.composer = composer;
        this.representative_song = representative_song;
    }

    public MusicCreateForm() {
    }

    public int getId() {
        return id;
    }

    public String getComposer() {
        return composer;
    }

    public String getRepresentative_song() {
        return representative_song;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }

    public void setRepresentative_song(String representative_song) {
        this.representative_song = representative_song;
    }
}
