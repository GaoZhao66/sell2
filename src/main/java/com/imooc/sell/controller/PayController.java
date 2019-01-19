package com.imooc.sell.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author gaozhao
 * @创建时间 2019/1/16
 * @描述
 **/
@RestController
@RequestMapping("/pay")
public class PayController {

    @GetMapping("/create")
    public ModelAndView create(){
        return new ModelAndView("pay/list");
    }




}
