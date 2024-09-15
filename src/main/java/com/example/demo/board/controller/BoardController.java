package com.example.demo.board.controller;

import com.example.demo.board.dto.PostBoardRequest;
import com.example.demo.board.dto.PostBoardResponse;
import com.example.demo.board.dto.ReadBoardListResponse;
import com.example.demo.utils.ApiResponse;
import com.example.demo.utils.ApiResponseGenerator;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class BoardController {
//   게시글 목록 조회
    @GetMapping("/api/posts")
    @Operation(summary = "게시글 목록 조회", description = "offset부터 limit만큼 게시글을 조회합니다.")
    public ApiResponse<ApiResponse.CustomBody<List<ReadBoardListResponse>>> readBoardList(@RequestParam("offset") int offset, @RequestParam("limit") int limit) {
        List<ReadBoardListResponse> response = new ArrayList<>();//타입추론
        return ApiResponseGenerator.success(response, HttpStatus.OK);

    }

//    게시글 조회
    @GetMapping("/api/posts/{postId}")
    public ApiResponse<ApiResponse.CustomBody<PostBoardResponse>> readBoard(@PathVariable("postId") int postId) {
        PostBoardResponse response = new PostBoardResponse();
        return ApiResponseGenerator.success(response, HttpStatus.OK);
    }

//   게시글 수정
    @PutMapping("/api/posts/{postId}")
    public ApiResponse<ApiResponse.CustomBody<PostBoardResponse>> updateBoard(@PathVariable("postId") int postId, @RequestBody PostBoardRequest request) {
        //request 저장 생략
        PostBoardResponse response = new PostBoardResponse();
        return ApiResponseGenerator.success(response, HttpStatus.OK);
    }

//    게시글 삭제
    @DeleteMapping("/api/posts/{postId}")
    public ApiResponse<ApiResponse.CustomBody<Void>> deleteBoard(@PathVariable("postId") int postId) {
        return ApiResponseGenerator.success(HttpStatus.OK);
    }

//    게시글 작성
    @PostMapping("/api/posts")
    public ApiResponse<ApiResponse.CustomBody<PostBoardResponse>> postBoard(@RequestBody PostBoardRequest request) {
        PostBoardResponse response = new PostBoardResponse();
        return ApiResponseGenerator.success(response, HttpStatus.OK);
    }



}
