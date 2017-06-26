package com.nju.iTeach.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Ewei on 2017/6/24.
 */
@Controller
public class indexController {
    @RequestMapping(value={"/","/index"})
    public String index(){
        return "index";
    }
}
