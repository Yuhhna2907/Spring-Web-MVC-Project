package com.codegym.musichibernate.service;

import com.codegym.musichibernate.model.Song;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class SongService {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Song> findAll() {
        return entityManager
                .createQuery("select s from Song s", Song.class)
                .getResultList();
    }

    public Song findById(Long id) {
        return entityManager.find(Song.class, id);
    }

    public void save(Song song) {
        if (song.getId() == null) {
            entityManager.persist(song);
        } else {
            entityManager.merge(song);
        }
    }

    public void remove(Long id) {
        Song song = findById(id);
        if (song != null) {
            entityManager.remove(song);
        }
    }
}

