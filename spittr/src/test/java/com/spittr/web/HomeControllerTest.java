package com.spittr.web;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;
import static org.junit.Assert.assertEquals;

/**
 * Created by chun on 2017/3/25.
 */
public class HomeControllerTest {

    @Test
    public void testHomePage() throws Exception{
        HomeContorller contorller = new HomeContorller();
        assertEquals("home",contorller.home());
    }

    @Test
    public void testHomePage1() throws Exception{
        HomeContorller contorller = new HomeContorller();
        //搭建MockMvc
        MockMvc mockmvc = standaloneSetup(contorller).build();
        //执行"/"GET请求
        mockmvc.perform(get("/")).andExpect(view().name("home"));
    }

}
