package uz.pdp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class Homecontroller {

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @PostMapping("/home")
    public String homePost() {
        return "<h1>Welcome to Home Page</h1>";
    }

    @DeleteMapping("/home")
    public String homeDelete() {
        return "<h1>Welcome to Home Page</h1>";
    }
    @PutMapping("/home")
    public String homePut() {
        return "<h1>Welcome to Home Page</h1>";
    }

}
