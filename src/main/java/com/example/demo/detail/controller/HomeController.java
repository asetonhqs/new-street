package com.example.demo.detail.controller;


import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import static com.fasterxml.jackson.databind.type.LogicalType.DateTime;

@Controller
@RequestMapping("/home")
public class HomeController {
    @GetMapping("")
    String getHome() {

    return "newstreet/main";
    }
    }

