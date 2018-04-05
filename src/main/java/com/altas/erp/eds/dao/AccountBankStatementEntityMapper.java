package com.altas.erp.eds.dao;

import com.altas.erp.eds.entity.AccountBankStatementEntity;
import com.altas.erp.eds.entity.AccountBankStatementEntityWithBLOBs;

public interface AccountBankStatementEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_bank_statement
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_bank_statement
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insert(AccountBankStatementEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_bank_statement
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insertSelective(AccountBankStatementEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_bank_statement
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    AccountBankStatementEntityWithBLOBs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_bank_statement
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeySelective(AccountBankStatementEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_bank_statement
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(AccountBankStatementEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_bank_statement
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKey(AccountBankStatementEntity record);
}