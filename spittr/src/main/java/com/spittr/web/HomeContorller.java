package com.spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by chun on 2017/3/25.
 */
@Controller
@RequestMapping({"/","/homepage"})
public class HomeContorller {

    @RequestMapping(method = GET)
    public String home(){
        return "home";
    }


    public static void main(String[] args) {
        Map map = new HashMap();
        ConcurrentHashMap map1 = new ConcurrentHashMap();
    }
}
