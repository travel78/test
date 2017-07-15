package com.shpyrna.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Юра on 14.07.2017.
 */
@Controller
public class MainController {

    @GetMapping("/")
    public String mainPage() {
        return "index";
    }

}
