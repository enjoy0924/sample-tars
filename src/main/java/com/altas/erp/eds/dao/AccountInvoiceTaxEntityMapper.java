package com.altas.erp.eds.dao;

import com.altas.erp.eds.entity.AccountInvoiceTaxEntity;

public interface AccountInvoiceTaxEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_invoice_tax
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_invoice_tax
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insert(AccountInvoiceTaxEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_invoice_tax
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insertSelective(AccountInvoiceTaxEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_invoice_tax
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    AccountInvoiceTaxEntity selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_invoice_tax
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeySelective(AccountInvoiceTaxEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_invoice_tax
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(AccountInvoiceTaxEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_invoice_tax
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKey(AccountInvoiceTaxEntity record);
}