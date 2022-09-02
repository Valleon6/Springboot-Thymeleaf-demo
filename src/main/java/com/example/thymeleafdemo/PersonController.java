package com.example.thymeleafdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;

@Controller
public class PersonController {

    @GetMapping
       String getPeople(Model model){
        model.addAttribute("something", "this is coming from the controller");
        model.addAttribute("people", Arrays.asList(
                new Person("Chisom", 23),
                new Person("Oge", 24),
                new Person("Onyinye", 26)

        ));
        return "people";
    }
}
