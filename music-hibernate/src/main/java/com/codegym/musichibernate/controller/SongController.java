package com.codegym.musichibernate.controller;

import com.codegym.musichibernate.model.Song;
import com.codegym.musichibernate.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/songs")
public class SongController {

    @Autowired
    private SongService songService;

    /* ================= LIST ================= */
    @GetMapping
    public String list(Model model) {
        model.addAttribute("songs", songService.findAll());
        return "song/list";
    }

    /* ================= CREATE ================= */
    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("song", new Song());
        return "song/create";
    }

    /* ================= SAVE (CREATE + UPDATE) ================= */
    @PostMapping("/save")
    public String save(@ModelAttribute("song") Song song) {
        songService.save(song);
        return "redirect:/songs";
    }

    /* ================= EDIT ================= */
    @GetMapping("/{id}/edit")
    public String showEditForm(@PathVariable Long id, Model model) {
        Song song = songService.findById(id);
        model.addAttribute("song", song);
        return "song/edit";
    }

    /* ================= DELETE ================= */
    @GetMapping("/{id}/delete")
    public String delete(@PathVariable Long id) {
        songService.remove(id);
        return "redirect:/songs";
    }
}
