package net.codejava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/panel")

public class PanelController {
    @RequestMapping("/")
    public String panel(){
        return "panel";
    }
}
