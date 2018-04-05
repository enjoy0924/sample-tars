package com.altas.erp.eds.dao;

import com.altas.erp.eds.entity.AccountReportGeneralLedgerEntity;
import com.altas.erp.eds.entity.AccountReportGeneralLedgerEntityWithBLOBs;

public interface AccountReportGeneralLedgerEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_report_general_ledger
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_report_general_ledger
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insert(AccountReportGeneralLedgerEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_report_general_ledger
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insertSelective(AccountReportGeneralLedgerEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_report_general_ledger
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    AccountReportGeneralLedgerEntityWithBLOBs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_report_general_ledger
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeySelective(AccountReportGeneralLedgerEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_report_general_ledger
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(AccountReportGeneralLedgerEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table account_report_general_ledger
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKey(AccountReportGeneralLedgerEntity record);
}