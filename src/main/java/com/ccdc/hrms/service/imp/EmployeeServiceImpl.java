package com.ccdc.hrms.service.imp;

import com.ccdc.hrms.bean.*;
import com.ccdc.hrms.common.constants.CommonConstants;
import com.ccdc.hrms.common.utils.CommonUtil;
import com.ccdc.hrms.dao.DepartmentMapper;
import com.ccdc.hrms.dao.EmployeeMapper;
import com.ccdc.hrms.service.EmployeeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @ProjectName: hrms
 * @Package: com.ccdc.hrms.service.imp
 * @ClassName: EmplyeeServiceImpl
 * @Author: zichuangshi
 * @Description: 员工业务接口实现类
 * @Date: 2020/9/11 14:28
 * @Version: 1.0
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class EmployeeServiceImpl implements EmployeeService {
    EmployeeMapper employeeMapper;
    DepartmentMapper departmentMapper;

    @Autowired
    public EmployeeServiceImpl(EmployeeMapper employeeMapper, DepartmentMapper departmentMapper) {
        this.employeeMapper = employeeMapper;
        this.departmentMapper = departmentMapper;
    }

    public List<EmployeeVo> getEmployeeInfo() {
        List<EmployeeVo> employeeVoList = new ArrayList<>();
        //获取员工信息
        EmployeeExample example = new EmployeeExample();
        example.createCriteria().andStatusEqualTo(CommonConstants.EFFECTIVE_STATUS);
        List<Employee> employeeList = employeeMapper.selectByExample(example);
        if (CommonUtil.isEmpty(employeeList)) {
            return employeeVoList;
        }
        // 将employee值赋给employeeVo
        employeeList.stream().forEach(employee -> {
            EmployeeVo employeeVo = new EmployeeVo();
            BeanUtils.copyProperties(employee,employeeVo);
            employeeVoList.add(employeeVo);
        });
        //组装EmployeeVo
        for (EmployeeVo employeeVo : employeeVoList) {
            DepartmentExample departmentExample = new DepartmentExample();
            departmentExample.createCriteria().andStatusEqualTo(CommonConstants.EFFECTIVE_STATUS)
                    .andDeptCodeEqualTo(employeeVo.getDeptCode());
            List<String> deptNameList = departmentMapper.selectByExample(departmentExample).stream()
                    .map(Department::getDeptName).collect(Collectors.toList());
            employeeVo.setDeptName(deptNameList.stream().findFirst().orElse(null));
        }
        return employeeVoList;
    }
}
