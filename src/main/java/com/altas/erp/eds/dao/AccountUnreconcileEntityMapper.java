package com.altas.erp.eds.dao;

import com.altas.erp.eds.entity.AccountUnreconcileEntity;

public interface AccountUnreconcileEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_unreconcile
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_unreconcile
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insert(AccountUnreconcileEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_unreconcile
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insertSelective(AccountUnreconcileEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_unreconcile
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    AccountUnreconcileEntity selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_unreconcile
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeySelective(AccountUnreconcileEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_unreconcile
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKey(AccountUnreconcileEntity record);
}