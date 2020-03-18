package com.example.sdnmarvelbasic;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/comics")
public class ComicController {
    private final ComicRepo comicRepo;

    public ComicController(ComicRepo comicRepo){
        this.comicRepo = comicRepo;
    }

    @GetMapping
    public Iterable<ComicIssue> findAll() {
        return comicRepo.findAll();
    }

    @GetMapping("/{name}")
    public ComicIssue getComicIssueByName(@PathVariable String name) {
        return comicRepo.getComicIssueByName(name);
    }
}
