package com.ccdc.hrms.service;

import com.ccdc.hrms.bean.Account;
import com.ccdc.hrms.bean.AccountExample;

import java.util.List;
import java.util.Map;

/**
 * @ProjectName: hrms
 * @Package: com.ccdc.hrms.service
 * @ClassName: AuthorityInterface
 * @Author: zichuangshi
 * @Description: 用户管理业务
 * @Date: 2020/9/10 12:31
 * @Version: 1.0
 */
public interface AuthorityService {
    /**
     * 功能描述: 验证用户身份信息
     * 〈〉
     *
     * @Param: [account]
     * @Return: T
     * @Author: shi
     * @Date: 2020/9/10 10:47
     */
    Map<String,Object> authentication(Account account);

    Account getAccount(Account account);
}
