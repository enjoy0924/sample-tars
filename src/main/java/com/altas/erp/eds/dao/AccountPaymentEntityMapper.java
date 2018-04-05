package com.altas.erp.eds.dao;

import com.altas.erp.eds.entity.AccountPaymentEntity;
import com.altas.erp.eds.entity.AccountPaymentEntityWithBLOBs;

public interface AccountPaymentEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_payment
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_payment
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insert(AccountPaymentEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_payment
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insertSelective(AccountPaymentEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_payment
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    AccountPaymentEntityWithBLOBs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_payment
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeySelective(AccountPaymentEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_payment
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(AccountPaymentEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_payment
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKey(AccountPaymentEntity record);
}