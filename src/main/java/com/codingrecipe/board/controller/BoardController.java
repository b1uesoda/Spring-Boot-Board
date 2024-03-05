package com.codingrecipe.board.controller;

import com.codingrecipe.board.dto.BoardDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/board")
public class BoardController {
    @GetMapping("/write")
    public String writeForm() {
        return "write";
    }

    @PostMapping("/write")
    public String save(@ModelAttribute BoardDTO boardDTO) {
        System.out.println("boardDTO = " + boardDTO);
        return null;
    }
}
