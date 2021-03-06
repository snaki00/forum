package com.project.forum.controller;

import com.project.forum.model.Section;
import com.project.forum.repository.SectionRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MainController {
    private SectionRepository sectionRepository;

    public MainController(SectionRepository sectionRepository){ this.sectionRepository = sectionRepository; }

    @GetMapping("")
    public String getData(){
        return "Api main route, go to /section /posts or /user";
    }
}
