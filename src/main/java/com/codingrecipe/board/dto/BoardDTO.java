package com.codingrecipe.board.dto;

import java.time.LocalDateTime;

// DTO(Data Transfer Object), VO, Bean
public class BoardDTO {
    private Long id;
    private String boardWriter;
    private String boardPass;
    private String boardTitle;
    private String boardContents;
    private int boardHits;
    private LocalDateTime boardCreateTime;
    private LocalDateTime boardUpdqtedTime;
}
