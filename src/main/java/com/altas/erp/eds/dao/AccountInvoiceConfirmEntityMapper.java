package com.altas.erp.eds.dao;

import com.altas.erp.eds.entity.AccountInvoiceConfirmEntity;

public interface AccountInvoiceConfirmEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_invoice_confirm
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_invoice_confirm
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insert(AccountInvoiceConfirmEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_invoice_confirm
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insertSelective(AccountInvoiceConfirmEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_invoice_confirm
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    AccountInvoiceConfirmEntity selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_invoice_confirm
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeySelective(AccountInvoiceConfirmEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_invoice_confirm
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKey(AccountInvoiceConfirmEntity record);
}