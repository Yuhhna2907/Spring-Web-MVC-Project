package com.codegym.music.service;

import com.codegym.music.model.Song;

import java.util.List;

public interface ISongService {
    void save(Song song);
    List<Song> findAll();
}
