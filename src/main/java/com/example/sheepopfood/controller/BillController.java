package com.example.sheepopfood.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/cart")
public class BillController {
    @GetMapping
    public ModelAndView showCart(){
        ModelAndView view = new ModelAndView("cart");
        return view;
    }
}
