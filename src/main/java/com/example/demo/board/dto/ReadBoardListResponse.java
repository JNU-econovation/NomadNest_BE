
package com.example.demo.board.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
@NoArgsConstructor
//게시글 작성, 수정 응답 dto
public class ReadBoardListResponse {
    private String title;
    private String nickname;
    private LocalDate date;
}
