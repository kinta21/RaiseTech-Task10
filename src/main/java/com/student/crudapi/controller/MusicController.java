package com.student.crudapi.controller;


import com.student.crudapi.entity.Music;
import com.student.crudapi.exception.NotMusicFoundException;
import com.student.crudapi.form.MusicCreateForm;
import com.student.crudapi.form.MusicUpdateForm;
import com.student.crudapi.service.MusicService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Map;

@Validated
@RestController
public class MusicController {

    private MusicService musicService;


    public  MusicController(MusicService musicService){
        this.musicService = musicService;

    }

   @ExceptionHandler (value = NotMusicFoundException.class)
   public  ResponseEntity<Map<String,String>> handleNoResourceFound(
           NotMusicFoundException e, HttpServletRequest request){
        Map<String, String> body = Map.of(
                "timestamp", ZonedDateTime.now().toString(),
                "status", String.valueOf(HttpStatus.NOT_FOUND.value()),
                "error", HttpStatus.NOT_FOUND.getReasonPhrase(),
                "message", e.getMessage(),
                "path", request.getRequestURI());
        return new ResponseEntity<>(body, HttpStatus.NOT_FOUND);
   }
   
    @GetMapping("/musics")
    public List<Music> musics(){
        List<Music> musics = musicService.findAll();
        return musics;
    }

    @GetMapping("/musics/{id}")
    public MusicResponse getMusicById(@PathVariable("id") int id){
        Music music = musicService.findById(id);
        return new MusicResponse(music);
    }

    @PostMapping("/musics")
    public ResponseEntity<Music>createMusic(@RequestBody @Valid MusicCreateForm musicCreateForm, UriComponentsBuilder uriBuilder) {
        Music music = musicService.createMusic(musicCreateForm.getComposer(),musicCreateForm.getRepresentativeSong());
        URI url = uriBuilder
                .path("/musics/" + music.getId())
                .build()
                .toUri();
        return ResponseEntity.created(url).body(music);
    }

    @PatchMapping("/musics/{id}")
    public ResponseEntity<Map<String, String>> updateMusic(@PathVariable int id, @RequestBody MusicUpdateForm musicUpdateForm) throws Exception {
        musicService.updateMusic(id, musicUpdateForm.getComposer(), musicUpdateForm.getRepresentativeSong());
        return ResponseEntity.ok(Map.of("message", "music successfully updated"));
    }

    @DeleteMapping("/musics/{id}")
    public ResponseEntity<Map<String, String>> deleteById(@PathVariable int id) {
        musicService.deleteById(id);
        return ResponseEntity.ok(Map.of("message", "music successfully delete"));
    }
}
