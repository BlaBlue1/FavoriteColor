package com.example.favoritecolor;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class HomeController {
    @GetMapping("/userform")
    public String loadUserForm(Model model){
        model.addAttribute("user", new User());
        return "userform";
    }
    @PostMapping("/userform")
    public String processUserForm(@Valid User user, BindingResult result) {
        if(result.hasErrors()){
            return "userform";
        }
        return "userconfirm";
    }
}
