package com.codegym.music.service;

import com.codegym.music.model.Song;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SongService implements ISongService {
    private static final List<Song> songs = new ArrayList<>();

    @Override
    public void save(Song song) {
        songs.add(song);
    }

    @Override
    public List<Song> findAll() {
        return songs;
    }
}
