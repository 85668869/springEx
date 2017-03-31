package com.spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by chun on 2017/3/25.
 */
@Controller
@RequestMapping("/spitter")
public class SpitterController {

    @RequestMapping(value = "/register", method = GET)
    public String showRegistrationForm(){
        return "registerForm";
    }
}
