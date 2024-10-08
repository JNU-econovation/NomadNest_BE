
package com.example.demo.board.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
@NoArgsConstructor
//게시글 작성, 수정, 조회 응답 dto
public class PostBoardResponse {
    private Long id;
    private String title;
    private String nickname;
    private String content;
    private LocalDate date;
}
