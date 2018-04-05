package com.altas.erp.eds.dao;

import com.altas.erp.eds.entity.PaymentTokenEntity;
import com.altas.erp.eds.entity.PaymentTokenEntityWithBLOBs;

public interface PaymentTokenEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment_token
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment_token
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insert(PaymentTokenEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment_token
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insertSelective(PaymentTokenEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment_token
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    PaymentTokenEntityWithBLOBs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment_token
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeySelective(PaymentTokenEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment_token
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(PaymentTokenEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment_token
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKey(PaymentTokenEntity record);
}