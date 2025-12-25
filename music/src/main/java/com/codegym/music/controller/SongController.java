package com.codegym.music.controller;

import com.codegym.music.model.Song;
import com.codegym.music.service.ISongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/songs")
public class SongController {

    private static final List<String> ALLOWED_EXT =
            Arrays.asList("mp3", "wav", "ogg", "m4p");

    private static final String UPLOAD_DIR = "D:/upload/";

    @Autowired
    private ISongService songService;

    @GetMapping("/upload")
    public String showUploadForm(Model model) {
        model.addAttribute("song", new Song());
        return "upload";
    }

    @PostMapping("/upload")
    public String uploadSong(@ModelAttribute Song song, Model model) {

        MultipartFile file = song.getFile();
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());

        String ext = fileName.substring(fileName.lastIndexOf(".") + 1);

        if (!ALLOWED_EXT.contains(ext)) {
            model.addAttribute("error", "File không hợp lệ!");
            return "upload";
        }

        try {
            File uploadDir = new File(UPLOAD_DIR);
            if (!uploadDir.exists()) {
                uploadDir.mkdirs();
            }

            File dest = new File(UPLOAD_DIR + fileName);
            file.transferTo(dest);

            song.setFilePath(fileName);
            songService.save(song);

        } catch (IOException e) {
            model.addAttribute("error", "Upload thất bại!");
            return "upload";
        }

        return "redirect:/songs/list";
    }

    @GetMapping("/list")
    public String showList(Model model) {
        model.addAttribute("songs", songService.findAll());
        return "list";
    }
}
