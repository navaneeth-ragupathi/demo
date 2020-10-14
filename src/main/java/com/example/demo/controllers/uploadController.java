package com.example.demo.controllers;

import java.io.File;
import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class uploadController {

    @GetMapping("/upload")
    public String upload() {
        return "upload";
    }

    @PostMapping("/upload_successfull")
    public String uploadFile(@RequestParam("file") MultipartFile file) throws IllegalStateException, IOException {
        String directory = "/home/navaneeth/Documents/springBoot/demo/src/main/resources/static/upload/";
        file.transferTo(new File(directory + file.getOriginalFilename()));
        return "redirect:/upload";
    }
}
