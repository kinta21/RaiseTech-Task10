package com.student.crudapi.form;

import lombok.Data;

@Data
public class MusicUpdateForm {
    private int id;
    private String composer;
    private String representativeSong;

}
