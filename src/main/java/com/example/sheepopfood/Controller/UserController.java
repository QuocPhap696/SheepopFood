package com.example.sheepopfood.Controller;
import com.example.sheepopfood.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
@AllArgsConstructor
public class UserController {
    private UserService userService;

    @GetMapping
    public String home(){
        return "home";
    }
}
