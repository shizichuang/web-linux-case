package com.ccdc.hrms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ProjectName: hrms
 * @Package: com.ccdc.hrms.controller
 * @ClassName: HomePageController
 * @Author: zichuangshi
 * @Description: 首页业务控制器
 * @Date: 2020/9/10 19:18
 * @Version: 1.0
 */
@Controller
@RequestMapping("/home")
public class HomePageController {

    @RequestMapping("/index")
    public String index(HttpServletResponse response, HttpServletRequest request){
        return "main/index";
    }

    @RequestMapping("/personal")
    public String personal(HttpServletResponse response, HttpServletRequest request){
        return "main/personal";
    }

    @RequestMapping("/quit")
    public String quit(HttpServletResponse response, HttpServletRequest request){
        return "login/login";
    }
    @RequestMapping("/welcome")
    public String welcome(HttpServletResponse response, HttpServletRequest request){
        return "main/welcome";
    }
}
