package com.foin.conterllor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/ssm")
public class SSMController {

    @RequestMapping(value = "login",method = RequestMethod.GET)
    public String testSSMLogin(){
        return "/login";
    }


}
