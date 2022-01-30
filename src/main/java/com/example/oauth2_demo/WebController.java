package com.example.oauth2_demo;

import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collections;


@Controller
public class WebController {

    @RequestMapping("/securedPage")
    public ModelAndView securedPage(OAuth2AuthenticationToken authentication) {
        return new ModelAndView("securedPage" , Collections.singletonMap("details", authentication.getPrincipal().getAttributes()));
    }

    @RequestMapping("/")
    public String index() {
        return "index";
    }
}

