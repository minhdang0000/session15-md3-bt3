package com.example.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/milk-tea")
public class MilkTeaController {

    @GetMapping("/menu")
    public String getMenu() {
        return "Đây là menu quán trà sữa. Chỉ người có Token hợp lệ mới xem được!";
    }
}
