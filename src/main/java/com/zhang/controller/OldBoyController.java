package com.zhang.controller;

import com.zhang.annotation.Oldboy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OldBoyController {

    @Oldboy
    @GetMapping("/oldboy")
    public void getLog(){
        System.out.println("oldboy is coming");
    }

}
