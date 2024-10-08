package com.example.demo.login.controller;

import com.example.demo.login.dto.LoginRequest;
import com.example.demo.login.dto.LoginResponse;
import com.example.demo.login.dto.RegisterRequest;
import com.example.demo.utils.ApiResponse;
import com.example.demo.utils.ApiResponseGenerator;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class LoginController {

    @PostMapping("/api/register")
    public ApiResponse<ApiResponse.CustomBody<Void>> register(@RequestBody RegisterRequest RegisterRequest) {
        return ApiResponseGenerator.success(HttpStatus.OK);
    }
    @PostMapping("/api/login")
    public ApiResponse<ApiResponse.CustomBody<LoginResponse>> login(@RequestBody LoginRequest LoginRequest) {
        LoginResponse LoginResponse = new LoginResponse();
        return ApiResponseGenerator.success(LoginResponse, HttpStatus.OK);
    }
    @PostMapping("/api/logout")
    public ApiResponse<ApiResponse.CustomBody<Void>> logout(@RequestBody LoginRequest LoginRequest) {
        return ApiResponseGenerator.success(HttpStatus.OK);
    }
}
