package com.spittr.web;

import com.spittr.data.SpittleRepository;
import com.spittr.model.Spittle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by chun on 2017/3/25.
 */
@Controller
@RequestMapping("/spittles")
public class SpittleController {
    private static final String MAX_LONG_AS_STRING = "9223372036854775807";
    private SpittleRepository spittleRepository;

    //注入SpittleRepository
    @Autowired
    public SpittleController(SpittleRepository spittleRepository){
        this.spittleRepository = spittleRepository;
    }

    /*@RequestMapping(method = RequestMethod.GET)
    public String spittles(Model model){
        model.addAttribute(spittleRepository.findSpittles(Long.MAX_VALUE, 20));
        return "spittles";
    }*/

    @RequestMapping(method = RequestMethod.GET)
    public List<Spittle> spittles(@RequestParam(value = "max", defaultValue = MAX_LONG_AS_STRING) long max,
                                  @RequestParam(value = "count", defaultValue = "20") int count){
        return spittleRepository.findSpittles(max, count);
    }

    @RequestMapping(value = "/{spittleId}", method = RequestMethod.GET)
    public String spittle(@PathVariable long spittleId, Model model){
        model.addAttribute(spittleRepository.findOne(spittleId));
        return "spittle";
    }
}
