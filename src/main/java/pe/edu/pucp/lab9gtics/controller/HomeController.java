package pe.edu.pucp.lab9gtics.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {
    @GetMapping("/")
    public String inicio() {
        return "inicio";
    }
}
