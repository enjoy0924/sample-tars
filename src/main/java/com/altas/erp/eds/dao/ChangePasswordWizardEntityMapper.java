package com.altas.erp.eds.dao;

import com.altas.erp.eds.entity.ChangePasswordWizardEntity;

public interface ChangePasswordWizardEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table change_password_wizard
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table change_password_wizard
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insert(ChangePasswordWizardEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table change_password_wizard
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insertSelective(ChangePasswordWizardEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table change_password_wizard
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    ChangePasswordWizardEntity selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table change_password_wizard
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeySelective(ChangePasswordWizardEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table change_password_wizard
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKey(ChangePasswordWizardEntity record);
}