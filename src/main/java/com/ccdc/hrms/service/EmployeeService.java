package com.ccdc.hrms.service;

import com.ccdc.hrms.bean.EmployeeVo;

import java.util.List;

/**
 * @ProjectName: hrms
 * @Package: com.ccdc.hrms.service
 * @ClassName: EmployeeService
 * @Author: zichuangshi
 * @Description: 员工业务接口
 * @Date: 2020/9/11 14:28
 * @Version: 1.0
 */
public interface EmployeeService {
    /**
     * 功能描述: 组装用户信息信息
     * 〈〉
     *
     * @Param: [account]
     * @Return: T
     * @Author: shi
     * @Date: 2020/9/10 10:47
     */
    List<EmployeeVo> getEmployeeInfo();
}
