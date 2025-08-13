package com.xxkj.javaaction.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2025年08月13日 上午11:19
 */
@RestController
@RequestMapping("index")
public class IndexController {
    @GetMapping("add")
    public String index(Model model){
        model.addAttribute("title","首页");
        model.addAttribute("body","我是首页");
        return "/index";
    }
}
