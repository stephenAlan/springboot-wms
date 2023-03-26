package com.stephen.wms.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ssc on 2023-03-26 11:14 .
 * Description:
 */
@RestController
public class HelloController {

    @RequestMapping
    public String hello() {
        return "hello";
    }


}
