package com.ccdc.hrms.service.imp;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ccdc.hrms.bean.Account;
import com.ccdc.hrms.bean.AccountExample;
import com.ccdc.hrms.common.constants.CommonConstants;
import com.ccdc.hrms.common.constants.LoginStatusConstants;
import com.ccdc.hrms.common.utils.CommonUtil;
import com.ccdc.hrms.dao.AccountMapper;
import com.ccdc.hrms.service.AuthorityService;
import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ProjectName: hrms
 * @Package: com.ccdc.hrms.service.imp
 * @ClassName: AuthorityImpl
 * @Author: zichuangshi
 * @Description: 用户管理业务实现类
 * @Date: 2020/9/10 12:33
 * @Version: 1.0
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class AuthorityServiceImpl implements AuthorityService {
    Logger logger = Logger.getLogger(AuthorityServiceImpl.class);

    AccountMapper accountMapper;

    @Autowired
    public AuthorityServiceImpl(AccountMapper accountMapper) {
        this.accountMapper = accountMapper;
    }

    @Override
    public Map<String, Object> authentication(Account account) {
        Map<String, Object> result = new HashMap<>();
        result.put("code", LoginStatusConstants.LOGIN_FAIL);

        if (CommonUtil.isEmpty(account.getPhone()) || CommonUtil.isEmpty(account.getUserPassword())) {
            return result;
        }

        String methodName = this.getClass().getName() + ".authentication";
        logger.info(methodName + "用户信息校验入参：phone：" + account.getPhone() + "password:" + account.getUserPassword());

        int hashIterations = 2;
        String password = new Md5Hash(account.getUserPassword(), account.getPhone(), hashIterations).toString();
        UsernamePasswordToken token = new UsernamePasswordToken(account.getPhone(), password);
        Subject subject = SecurityUtils.getSubject();
        try{
            subject.login(token);
        }catch(AuthenticationException exception){
            logger.error(methodName+"用户："+account.getPhone()+",账户名或密码错误！");
            return result;
        }
        Account UserAccount = (Account) subject.getPrincipal();




        AccountExample example = new AccountExample();
        example.createCriteria().andPhoneEqualTo(account.getPhone()).andUserPasswordEqualTo(account.getUserPassword()).andStatusEqualTo(CommonConstants.EFFECTIVE_STATUS);
        List<Account> accountList = accountMapper.selectByExample(example);
        if (CommonUtil.isEmpty(accountList)) {
            logger.error(methodName+"用户："+account.getPhone()+",账户名或密码错误！");
            return result;
        }
        result.put("code", LoginStatusConstants.LOGIN_SUCCESS);
        result.put("accountList", accountList);

        logger.info(methodName + "用户信息校验结束！");
        return result;
    }

    @Override
    public Account getAccount(Account account) {
        if(CommonUtil.isEmpty(account)){
            return new Account();
        }
        AccountExample accountExample = new AccountExample();
        accountExample.createCriteria().andStatusEqualTo(CommonConstants.EFFECTIVE_STATUS)
                .andPhoneEqualTo(account.getPhone()).andUserPasswordEqualTo(account.getUserPassword())
                .andBindingMachineCodeEqualTo(account.getBindingMachineCode()).andMailEqualTo(account.getMail())
                .andGenderEqualTo(account.getGender());
        List<Account> accountList = accountMapper.selectByExample(accountExample);
        if(CommonUtil.isEmpty(accountList)){
            return new Account();
        }
        return accountList.get(0);
    }
}
