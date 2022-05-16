package com.example.shopspringjsp.index.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * \* Created with IntelliJ IDEA.
 * \* @author: kim-dong-wan
 * \* Date: 2022/05/16
 * \* Time: 9:37 오후
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */

@Controller
public class IndexController {
    @RequestMapping(value ="/")
    public String Index(){
        return "index/index";
    }
}
