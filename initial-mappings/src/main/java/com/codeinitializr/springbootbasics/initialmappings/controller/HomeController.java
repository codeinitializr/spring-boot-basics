package com.codeinitializr.springbootbasics.initialmappings.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * HomeController
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "This is the index page.");
        mv.setViewName("index");
        return mv;
    }

    @RequestMapping(value = "/submit", method = RequestMethod.POST)
    public ModelAndView submit() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "This is the form submission successfull page.");
        mv.setViewName("submit");
        return mv;
    }

}