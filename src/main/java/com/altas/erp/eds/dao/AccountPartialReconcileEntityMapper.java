package com.altas.erp.eds.dao;

import com.altas.erp.eds.entity.AccountPartialReconcileEntity;

public interface AccountPartialReconcileEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_partial_reconcile
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_partial_reconcile
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insert(AccountPartialReconcileEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_partial_reconcile
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insertSelective(AccountPartialReconcileEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_partial_reconcile
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    AccountPartialReconcileEntity selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_partial_reconcile
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeySelective(AccountPartialReconcileEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_partial_reconcile
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKey(AccountPartialReconcileEntity record);
}