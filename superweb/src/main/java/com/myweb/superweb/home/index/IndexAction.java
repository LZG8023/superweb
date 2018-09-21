package com.myweb.superweb.home.index;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class IndexAction {
	
	@RequestMapping("/hello")
    public String hello(){
        return "Greetings from Spring Boot!";
    }
}
