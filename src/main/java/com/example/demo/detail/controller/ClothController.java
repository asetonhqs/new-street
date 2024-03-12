package com.example.demo.detail.controller;

import com.example.demo.detail.entity.ClothDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/clothes")
public class ClothController {
    @PostMapping("/post")
    String postClothes(@ModelAttribute ClothDto.Post clothDto){
        clothDto.showFields();
        return "newstreet/main";
    }
    @GetMapping("/getClothes")
    String getClothesPostPage()
    {
        return "newstreet/add_clothes/add_clothes.html";
    }
}
