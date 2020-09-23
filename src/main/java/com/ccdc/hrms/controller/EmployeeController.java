package com.ccdc.hrms.controller;

import com.ccdc.hrms.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ProjectName: hrms
 * @Package: com.ccdc.hrms.controller
 * @ClassName: EmployeeController
 * @Author: zichuangshi
 * @Description: 员工业务控制器
 * @Date: 2020/9/11 13:06
 * @Version: 1.0
 */
@Controller
@RequestMapping("/employee")
public class EmployeeController {
    EmployeeService employeeService;
    @Autowired
    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @RequestMapping("/getEmployeeInfo")
    public String welcome(Model model){
        model.addAttribute("employeeList",employeeService.getEmployeeInfo());
        return "main/employee";
    }
}
