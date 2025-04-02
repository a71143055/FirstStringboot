package kr.ac.kopo.jeong.firststringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Example06Controller {
    @GetMapping("/exam06")
    public String requestMethod(Model model) {
        model.addAttribute("data1","Model 예제");
        model.addAttribute("data2", "웹 요청할 때 URL은 http://localhost:8080/exam06 입니다.");
        return "viewPage06";
    }

    @GetMapping("/exam07")
    public String requestMethod2(ModelMap modelMap) {
        modelMap.addAttribute("message1", "ModelMap 클래스는 Model 인터페이스를 상속 받아서 구현되었다.");
        modelMap.addAttribute("message2", "ModelMap 클래스는 Model 인터페이스의 기능과 동일 하거나 더 확장된 기능을 사용할 수 있다.");

        List<String> list = new ArrayList<String>();
        list.add("오렌지");
        list.add("딸기");
        list.add("참외");

        modelMap.addAttribute("list", list);

        return "viewPageModelMap";
    }
}