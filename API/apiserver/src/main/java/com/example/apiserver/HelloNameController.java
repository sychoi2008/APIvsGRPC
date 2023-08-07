package com.example.apiserver;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class HelloNameController {
    @GetMapping("/hello/{index}")
    public String hello(@PathVariable int index){

        return "index: " + index + " weight: " + index*10 + " msg: Hello world";
    }
}
