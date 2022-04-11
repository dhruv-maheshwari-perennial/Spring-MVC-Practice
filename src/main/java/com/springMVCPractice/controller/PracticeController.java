package com.springMVCPractice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PracticeController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
//    @ResponseBody
    public String mainPage() {
        return "index";
    }
}
