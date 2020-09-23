package com.ccdc.hrms.dao;

import com.ccdc.hrms.bean.Account;
import com.ccdc.hrms.bean.AccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccountMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_account
     *
     * @mbg.generated Thu Sep 10 14:08:32 CST 2020
     */
    long countByExample(AccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_account
     *
     * @mbg.generated Thu Sep 10 14:08:32 CST 2020
     */
    int deleteByExample(AccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_account
     *
     * @mbg.generated Thu Sep 10 14:08:32 CST 2020
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_account
     *
     * @mbg.generated Thu Sep 10 14:08:32 CST 2020
     */
    int insert(Account record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_account
     *
     * @mbg.generated Thu Sep 10 14:08:32 CST 2020
     */
    int insertSelective(Account record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_account
     *
     * @mbg.generated Thu Sep 10 14:08:32 CST 2020
     */
    List<Account> selectByExample(AccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_account
     *
     * @mbg.generated Thu Sep 10 14:08:32 CST 2020
     */
    Account selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_account
     *
     * @mbg.generated Thu Sep 10 14:08:32 CST 2020
     */
    int updateByExampleSelective(@Param("record") Account record, @Param("example") AccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_account
     *
     * @mbg.generated Thu Sep 10 14:08:32 CST 2020
     */
    int updateByExample(@Param("record") Account record, @Param("example") AccountExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_account
     *
     * @mbg.generated Thu Sep 10 14:08:32 CST 2020
     */
    int updateByPrimaryKeySelective(Account record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_account
     *
     * @mbg.generated Thu Sep 10 14:08:32 CST 2020
     */
    int updateByPrimaryKey(Account record);
}