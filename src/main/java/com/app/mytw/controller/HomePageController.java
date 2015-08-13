package com.app.mytw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by user on 8/13/2015.
 */

@Controller
@RequestMapping({"/", "home"})
public class HomePageController
{

        @RequestMapping(method = RequestMethod.GET)
        public String getHomepage()
        {
            return "index";
        }
}
