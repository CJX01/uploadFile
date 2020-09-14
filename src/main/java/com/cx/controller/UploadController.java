package com.cx.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UploadController {
    private final Logger LOG = LoggerFactory.getLogger(this.getClass());


    @RequestMapping("upload")
    @ResponseBody
    public Object upLoadFile(@RequestParam(value = "upFile") MultipartFile multipartFile){

        String originalFilename = multipartFile.getOriginalFilename();
        LOG.info(originalFilename);
        return originalFilename;
    }
}
