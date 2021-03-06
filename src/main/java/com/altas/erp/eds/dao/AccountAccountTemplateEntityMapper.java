package com.altas.erp.eds.dao;

import com.altas.erp.eds.entity.AccountAccountTemplateEntity;
import com.altas.erp.eds.entity.AccountAccountTemplateEntityWithBLOBs;

public interface AccountAccountTemplateEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_account_template
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_account_template
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insert(AccountAccountTemplateEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_account_template
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insertSelective(AccountAccountTemplateEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_account_template
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    AccountAccountTemplateEntityWithBLOBs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_account_template
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeySelective(AccountAccountTemplateEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_account_template
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(AccountAccountTemplateEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_account_template
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKey(AccountAccountTemplateEntity record);
}