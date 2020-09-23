package com.ccdc.hrms.controller;

import com.alibaba.fastjson.JSONObject;
import com.ccdc.hrms.bean.Account;
import com.ccdc.hrms.common.utils.CommonUtil;
import com.ccdc.hrms.service.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * @ProjectName: hrms
 * @Package: com.ccdc.hrms.controller
 * @ClassName: AuthUserController
 * @Author: zichuangshi
 * @Description:
 * @Date: 2020/9/9 17:27
 * @Version: 1.0
 */
@Controller
@RequestMapping("/user")
public class AuthorityController {
    AuthorityService authorityService;

    @Autowired
    public AuthorityController(AuthorityService authorityService){
        this.authorityService = authorityService;
    }

    /*@Autowired
    public void setAuthorityService(AuthorityService authorityService){
        this.authorityService = authorityService;
    }*/

    @RequestMapping("/login")
    public String login(HttpServletResponse response, HttpServletRequest request){
        return "login/login";
    }

    @RequestMapping("/authority")
    @ResponseBody
    public void authority(HttpServletResponse response, Account Account){
        Map<String,Object> result = authorityService.authentication(Account);

        CommonUtil.writerResponse(response, JSONObject.toJSONString(result));
    }

    @RequestMapping("/register")
    public String register(HttpServletResponse response, HttpServletRequest request){
        return "login/register";
    }


}
