package com.spinachMarket.spinachMarket.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/info")
    public String getProjectInfo() {
        String info = "-------- 시금치 마켓 ----------";
        return info;
    }
}
