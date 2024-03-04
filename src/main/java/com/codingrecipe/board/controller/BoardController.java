package com.codingrecipe.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/board")
public class BoardController {
    @GetMapping("/write")
    public String writeForm() {
        return "write";
    }

    @PostMapping("/write")
    public String save() {
        return null;
    }
}
