package org.xiyoulinux.recruitment.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class test {

    @ResponseBody
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public static String test(){
        return "Test is success!";
    }
}
