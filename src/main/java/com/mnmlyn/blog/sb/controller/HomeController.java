package com.mnmlyn.blog.sb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * description
 *
 * @author mnmlyn
 * @date 2019/10/14
 */
@Controller
public class HomeController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return "hello spring boot";
    }

    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
