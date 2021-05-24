package com.spinachMarket.spinachMarket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/index")
    public String moveToindex() {
        System.out.println("Index 화면으로 이동합니다");
        return "index.html";
    }

}
