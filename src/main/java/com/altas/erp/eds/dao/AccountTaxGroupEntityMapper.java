package com.altas.erp.eds.dao;

import com.altas.erp.eds.entity.AccountTaxGroupEntity;

public interface AccountTaxGroupEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_tax_group
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_tax_group
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insert(AccountTaxGroupEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_tax_group
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insertSelective(AccountTaxGroupEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_tax_group
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    AccountTaxGroupEntity selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_tax_group
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeySelective(AccountTaxGroupEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_tax_group
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(AccountTaxGroupEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_tax_group
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKey(AccountTaxGroupEntity record);
}