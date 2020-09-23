package com.ccdc.hrms.security;

import com.ccdc.hrms.bean.Account;
import com.ccdc.hrms.common.utils.CommonUtil;
import com.ccdc.hrms.service.AuthorityService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @ProjectName: hrms
 * @Package: com.ccdc.hrms.security
 * @ClassName: AuthorizingRealm
 * @Author: zichuangshi
 * @Description: 自定义的授权
 * @Date: 2020/9/13 22:26
 * @Version: 1.0
 */
public class MyRealm extends org.apache.shiro.realm.AuthorizingRealm {
    AuthorityService authorityService;
    @Autowired
    public MyRealm(AuthorityService authorityService){
        this.authorityService = authorityService;
    }

    public MyRealm() {

    }

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) authenticationToken.getPrincipal();
        Account param = new Account();
        param.setPhone(usernamePasswordToken.getUsername());
        Account account = authorityService.getAccount(param);
        if(CommonUtil.isNotEmpty(account)){
            if(usernamePasswordToken.getPassword().equals(account.getUserPassword())){
                return new SimpleAuthenticationInfo(account,usernamePasswordToken.getPassword(),getName());
            }
        }
        return null;
    }
}
