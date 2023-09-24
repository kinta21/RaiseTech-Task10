package com.student.crudapi.form;

import lombok.Data;

@Data
public class MusicCreateForm {
    private String composer;
    private String representativeSong;

    public MusicCreateForm() {
    }
}
