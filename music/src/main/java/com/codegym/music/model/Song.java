package com.codegym.music.model;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public class Song {
    private String name;
    private String artist;
    private List<String> genres;
    private MultipartFile file;

    private String filePath;

    public Song() {
    }

    public Song(String name, String artist, List<String> genres, String filePath) {
        this.name = name;
        this.artist = artist;
        this.genres = genres;
        this.filePath = filePath;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}
