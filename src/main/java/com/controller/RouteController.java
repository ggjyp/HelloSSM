package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author   : jyp
 * Date     : 2017/3/7 15:59
 * Describe : 路由控制
 */
@Controller
@RequestMapping(value = "")
public class RouteController {
    @RequestMapping(value = "")
    public String index() {
        return "index";
    }

}
