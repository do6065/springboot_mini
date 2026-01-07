package org.example.mini_project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/")
    public String hello() {
        // src/main/resources/static/upload.html 로 포워딩
        return "forward:/upload.html";
    }
}


