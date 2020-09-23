package com.ccdc.hrms.bean;

/**
 * @ProjectName: hrms
 * @Package: com.ccdc.hrms.bean
 * @ClassName: EmployeeVo
 * @Author: zichuangshi
 * @Description: 员工信息展示实体
 * @Date: 2020/9/11 14:32
 * @Version: 1.0
 */
public class EmployeeVo extends Employee{
    private String deptName;

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
