package com.altas.erp.eds.dao;

import com.altas.erp.eds.entity.AccountFiscalPositionAccountTemplateEntity;

public interface AccountFiscalPositionAccountTemplateEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_fiscal_position_account_template
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_fiscal_position_account_template
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insert(AccountFiscalPositionAccountTemplateEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_fiscal_position_account_template
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insertSelective(AccountFiscalPositionAccountTemplateEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_fiscal_position_account_template
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    AccountFiscalPositionAccountTemplateEntity selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_fiscal_position_account_template
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeySelective(AccountFiscalPositionAccountTemplateEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_fiscal_position_account_template
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKey(AccountFiscalPositionAccountTemplateEntity record);
}