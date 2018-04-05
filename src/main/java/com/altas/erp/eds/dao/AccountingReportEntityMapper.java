package com.altas.erp.eds.dao;

import com.altas.erp.eds.entity.AccountingReportEntity;
import com.altas.erp.eds.entity.AccountingReportEntityWithBLOBs;

public interface AccountingReportEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table accounting_report
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table accounting_report
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insert(AccountingReportEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table accounting_report
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insertSelective(AccountingReportEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table accounting_report
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    AccountingReportEntityWithBLOBs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table accounting_report
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeySelective(AccountingReportEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table accounting_report
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(AccountingReportEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table accounting_report
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKey(AccountingReportEntity record);
}