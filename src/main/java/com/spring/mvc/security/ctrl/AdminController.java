package com.spring.mvc.security.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/admin")
public class AdminController
{
    @RequestMapping(value="/home1", method=RequestMethod.GET)
    public String home()
    {
        return "login";
    }

}