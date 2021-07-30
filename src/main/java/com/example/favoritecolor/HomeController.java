package com.example.favoritecolor;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Random;

import javax.validation.Valid;

@Controller
public class HomeController {
    @GetMapping("/userform")
    public String loadUserForm(Model model){
        User user = new User();
        model.addAttribute("question", randomQuestion());
        model.addAttribute("user", user);
        return "userform";
    }
    @PostMapping("/userform")
    public String processUserForm(@Valid User user, BindingResult result) {
        if(result.hasErrors()){
            return "userform";
        }
        return "userconfirm";
    }
    public String randomQuestion(){
        Random rand = new Random();

        int randQuestion1 = rand.nextInt(2);
        if (randQuestion1 == 0) {
            return "What is your favorite color?";
        }
        else {
            return "What is the airspeed velocity of an unladen swallow?";
        }
    }

}
