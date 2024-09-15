package com.example.demo.board.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
//게시글 작성, 수정 요청 dto
public class PostBoardRequest {
    private String title;
    private String content;
}
