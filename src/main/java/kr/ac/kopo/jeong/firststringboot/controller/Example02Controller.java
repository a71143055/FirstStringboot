package kr.ac.kopo.jeong.firststringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Example02Controller {
    @RequestMapping(value = "Exam02", method = RequestMethod.GET)
    public String requestMethod() {
        return "@RestController 연습중입니다.";
    }
}