package com.altas.erp.eds.dao;

import com.altas.erp.eds.entity.AccountFiscalPositionEntity;
import com.altas.erp.eds.entity.AccountFiscalPositionEntityWithBLOBs;

public interface AccountFiscalPositionEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_fiscal_position
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_fiscal_position
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insert(AccountFiscalPositionEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_fiscal_position
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insertSelective(AccountFiscalPositionEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_fiscal_position
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    AccountFiscalPositionEntityWithBLOBs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_fiscal_position
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeySelective(AccountFiscalPositionEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_fiscal_position
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(AccountFiscalPositionEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_fiscal_position
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKey(AccountFiscalPositionEntity record);
}