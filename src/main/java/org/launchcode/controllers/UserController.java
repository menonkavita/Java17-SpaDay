package org.launchcode.controllers;

import org.launchcode.data.UserData;
import org.launchcode.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {

    // will be available at localhost:8080/user (will get path from @RequestMapping on line 12)
    @GetMapping("")
    public String displayAddUserForm(){
        return "/user/add";
    }

    // will be available at localhost:8080/user
    @PostMapping("")
    public String processAddUserForm(Model model, @ModelAttribute User user, String verify){
        if(!user.getPassword().contains(verify)){
            System.out.println("Verifying if the passwords match");
            model.addAttribute("username", user.getUserName());
            model.addAttribute("email", user.getEmail());
            model.addAttribute("errorMsg", "Passwords do not match! Please enter correct passwords!");
            return "/user/add";
        } // early return without else statement

            UserData.add(user);             // Adding user objects to UserData Collections Map to get them using UserData.getAll()

            model.addAttribute("userObj", user);
            model.addAttribute("users", UserData.getAll());
            return "/user/index";
    }

    @GetMapping("/details/{id}")
    public String displayUserDetails(@PathVariable int id, Model model){
        model.addAttribute("user", UserData.getById(id));
        return "/user/details";
    }

}
