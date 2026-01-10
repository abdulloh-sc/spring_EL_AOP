package uz.pdp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Homecontroller {

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/homeModel")
    public ModelAndView homeModel() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("homeModel");
        modelAndView.addObject("name", "John Doe");
        return modelAndView;
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
