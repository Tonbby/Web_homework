package com.zyt.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: zyt
 * @Date: 2023/12/29 15:02
 * @Description:
 */
@Controller
@RequestMapping("/manager/error")
public class ErrorController {
    @RequestMapping("/error403")
    public String error403(){
        return "/manager/error/error403";
    }
}
