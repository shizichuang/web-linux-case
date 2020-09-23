package com.ccdc.hrms.bean;

import java.util.Date;

public class Account {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_account.ID
     *
     * @mbg.generated Thu Sep 10 14:08:32 CST 2020
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_account.USER_NAME
     *
     * @mbg.generated Thu Sep 10 14:08:32 CST 2020
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_account.USER_PASSWORD
     *
     * @mbg.generated Thu Sep 10 14:08:32 CST 2020
     */
    private String userPassword;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_account.GENDER
     *
     * @mbg.generated Thu Sep 10 14:08:32 CST 2020
     */
    private String gender;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_account.PHONE
     *
     * @mbg.generated Thu Sep 10 14:08:32 CST 2020
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_account.TRUE_NAME
     *
     * @mbg.generated Thu Sep 10 14:08:32 CST 2020
     */
    private String trueName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_account.MAIL
     *
     * @mbg.generated Thu Sep 10 14:08:32 CST 2020
     */
    private String mail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_account.DOCUMENT_TYPE
     *
     * @mbg.generated Thu Sep 10 14:08:32 CST 2020
     */
    private String documentType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_account.DOCUMENT_NUMBER
     *
     * @mbg.generated Thu Sep 10 14:08:32 CST 2020
     */
    private String documentNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_account.BINDING_MACHINE_CODE
     *
     * @mbg.generated Thu Sep 10 14:08:32 CST 2020
     */
    private String bindingMachineCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_account.CREATE_DATE
     *
     * @mbg.generated Thu Sep 10 14:08:32 CST 2020
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_account.CREATE_USER
     *
     * @mbg.generated Thu Sep 10 14:08:32 CST 2020
     */
    private String createUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_account.UPDATE_DATE
     *
     * @mbg.generated Thu Sep 10 14:08:32 CST 2020
     */
    private Date updateDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_account.UPDATE_USER
     *
     * @mbg.generated Thu Sep 10 14:08:32 CST 2020
     */
    private String updateUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_account.STATUS
     *
     * @mbg.generated Thu Sep 10 14:08:32 CST 2020
     */
    private String status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_account.REMARK_ONE
     *
     * @mbg.generated Thu Sep 10 14:08:32 CST 2020
     */
    private String remarkOne;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_account.REMARK_TWO
     *
     * @mbg.generated Thu Sep 10 14:08:32 CST 2020
     */
    private String remarkTwo;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_account.ID
     *
     * @return the value of sys_account.ID
     *
     * @mbg.generated Thu Sep 10 14:08:32 CST 2020
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_account.ID
     *
     * @param id the value for sys_account.ID
     *
     * @mbg.generated Thu Sep 10 14:08:32 CST 2020
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_account.USER_NAME
     *
     * @return the value of sys_account.USER_NAME
     *
     * @mbg.generated Thu Sep 10 14:08:32 CST 2020
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_account.USER_NAME
     *
     * @param userName the value for sys_account.USER_NAME
     *
     * @mbg.generated Thu Sep 10 14:08:32 CST 2020
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_account.USER_PASSWORD
     *
     * @return the value of sys_account.USER_PASSWORD
     *
     * @mbg.generated Thu Sep 10 14:08:32 CST 2020
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_account.USER_PASSWORD
     *
     * @param userPassword the value for sys_account.USER_PASSWORD
     *
     * @mbg.generated Thu Sep 10 14:08:32 CST 2020
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_account.GENDER
     *
     * @return the value of sys_account.GENDER
     *
     * @mbg.generated Thu Sep 10 14:08:32 CST 2020
     */
    public String getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_account.GENDER
     *
     * @param gender the value for sys_account.GENDER
     *
     * @mbg.generated Thu Sep 10 14:08:32 CST 2020
     */
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_account.PHONE
     *
     * @return the value of sys_account.PHONE
     *
     * @mbg.generated Thu Sep 10 14:08:32 CST 2020
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_account.PHONE
     *
     * @param phone the value for sys_account.PHONE
     *
     * @mbg.generated Thu Sep 10 14:08:32 CST 2020
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_account.TRUE_NAME
     *
     * @return the value of sys_account.TRUE_NAME
     *
     * @mbg.generated Thu Sep 10 14:08:32 CST 2020
     */
    public String getTrueName() {
        return trueName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_account.TRUE_NAME
     *
     * @param trueName the value for sys_account.TRUE_NAME
     *
     * @mbg.generated Thu Sep 10 14:08:32 CST 2020
     */
    public void setTrueName(String trueName) {
        this.trueName = trueName == null ? null : trueName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_account.MAIL
     *
     * @return the value of sys_account.MAIL
     *
     * @mbg.generated Thu Sep 10 14:08:32 CST 2020
     */
    public String getMail() {
        return mail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_account.MAIL
     *
     * @param mail the value for sys_account.MAIL
     *
     * @mbg.generated Thu Sep 10 14:08:32 CST 2020
     */
    public void setMail(String mail) {
        this.mail = mail == null ? null : mail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_account.DOCUMENT_TYPE
     *
     * @return the value of sys_account.DOCUMENT_TYPE
     *
     * @mbg.generated Thu Sep 10 14:08:32 CST 2020
     */
    public String getDocumentType() {
        return documentType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_account.DOCUMENT_TYPE
     *
     * @param documentType the value for sys_account.DOCUMENT_TYPE
     *
     * @mbg.generated Thu Sep 10 14:08:32 CST 2020
     */
    public void setDocumentType(String documentType) {
        this.documentType = documentType == null ? null : documentType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_account.DOCUMENT_NUMBER
     *
     * @return the value of sys_account.DOCUMENT_NUMBER
     *
     * @mbg.generated Thu Sep 10 14:08:32 CST 2020
     */
    public String getDocumentNumber() {
        return documentNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_account.DOCUMENT_NUMBER
     *
     * @param documentNumber the value for sys_account.DOCUMENT_NUMBER
     *
     * @mbg.generated Thu Sep 10 14:08:32 CST 2020
     */
    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber == null ? null : documentNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_account.BINDING_MACHINE_CODE
     *
     * @return the value of sys_account.BINDING_MACHINE_CODE
     *
     * @mbg.generated Thu Sep 10 14:08:32 CST 2020
     */
    public String getBindingMachineCode() {
        return bindingMachineCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_account.BINDING_MACHINE_CODE
     *
     * @param bindingMachineCode the value for sys_account.BINDING_MACHINE_CODE
     *
     * @mbg.generated Thu Sep 10 14:08:32 CST 2020
     */
    public void setBindingMachineCode(String bindingMachineCode) {
        this.bindingMachineCode = bindingMachineCode == null ? null : bindingMachineCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_account.CREATE_DATE
     *
     * @return the value of sys_account.CREATE_DATE
     *
     * @mbg.generated Thu Sep 10 14:08:32 CST 2020
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_account.CREATE_DATE
     *
     * @param createDate the value for sys_account.CREATE_DATE
     *
     * @mbg.generated Thu Sep 10 14:08:32 CST 2020
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_account.CREATE_USER
     *
     * @return the value of sys_account.CREATE_USER
     *
     * @mbg.generated Thu Sep 10 14:08:32 CST 2020
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_account.CREATE_USER
     *
     * @param createUser the value for sys_account.CREATE_USER
     *
     * @mbg.generated Thu Sep 10 14:08:32 CST 2020
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_account.UPDATE_DATE
     *
     * @return the value of sys_account.UPDATE_DATE
     *
     * @mbg.generated Thu Sep 10 14:08:32 CST 2020
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_account.UPDATE_DATE
     *
     * @param updateDate the value for sys_account.UPDATE_DATE
     *
     * @mbg.generated Thu Sep 10 14:08:32 CST 2020
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_account.UPDATE_USER
     *
     * @return the value of sys_account.UPDATE_USER
     *
     * @mbg.generated Thu Sep 10 14:08:32 CST 2020
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_account.UPDATE_USER
     *
     * @param updateUser the value for sys_account.UPDATE_USER
     *
     * @mbg.generated Thu Sep 10 14:08:32 CST 2020
     */
    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_account.STATUS
     *
     * @return the value of sys_account.STATUS
     *
     * @mbg.generated Thu Sep 10 14:08:32 CST 2020
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_account.STATUS
     *
     * @param status the value for sys_account.STATUS
     *
     * @mbg.generated Thu Sep 10 14:08:32 CST 2020
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_account.REMARK_ONE
     *
     * @return the value of sys_account.REMARK_ONE
     *
     * @mbg.generated Thu Sep 10 14:08:32 CST 2020
     */
    public String getRemarkOne() {
        return remarkOne;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_account.REMARK_ONE
     *
     * @param remarkOne the value for sys_account.REMARK_ONE
     *
     * @mbg.generated Thu Sep 10 14:08:32 CST 2020
     */
    public void setRemarkOne(String remarkOne) {
        this.remarkOne = remarkOne == null ? null : remarkOne.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_account.REMARK_TWO
     *
     * @return the value of sys_account.REMARK_TWO
     *
     * @mbg.generated Thu Sep 10 14:08:32 CST 2020
     */
    public String getRemarkTwo() {
        return remarkTwo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_account.REMARK_TWO
     *
     * @param remarkTwo the value for sys_account.REMARK_TWO
     *
     * @mbg.generated Thu Sep 10 14:08:32 CST 2020
     */
    public void setRemarkTwo(String remarkTwo) {
        this.remarkTwo = remarkTwo == null ? null : remarkTwo.trim();
    }
}