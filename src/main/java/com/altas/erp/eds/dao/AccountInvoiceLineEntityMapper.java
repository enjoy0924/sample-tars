package com.altas.erp.eds.dao;

import com.altas.erp.eds.entity.AccountInvoiceLineEntity;
import com.altas.erp.eds.entity.AccountInvoiceLineEntityWithBLOBs;

public interface AccountInvoiceLineEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_invoice_line
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_invoice_line
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insert(AccountInvoiceLineEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_invoice_line
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insertSelective(AccountInvoiceLineEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_invoice_line
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    AccountInvoiceLineEntityWithBLOBs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_invoice_line
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeySelective(AccountInvoiceLineEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_invoice_line
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(AccountInvoiceLineEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_invoice_line
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKey(AccountInvoiceLineEntity record);
}