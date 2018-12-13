package com.mifan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @auther wangbinlei
 * @create 2018/12/13
 */
@Controller
@RequestMapping("/banner")
public class BannerController {

    @RequestMapping("list")
    public String bannerList(){
        return "hello";
    }
}
