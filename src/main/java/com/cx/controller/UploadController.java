package com.cx.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UploadController {


    @RequestMapping("upload")
    @ResponseBody
    public Object upLoadFile(@RequestParam(value = "upFile") MultipartFile multipartFile){

        String originalFilename = multipartFile.getOriginalFilename();

        return originalFilename;
    }
}
