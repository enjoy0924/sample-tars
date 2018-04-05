package com.altas.erp.eds.entity;

import java.util.Date;

public class AccountingReportEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column accounting_report.id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column accounting_report.create_uid
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer createUid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column accounting_report.enable_filter
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Boolean enableFilter;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column accounting_report.date_from
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Date dateFrom;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column accounting_report.date_to
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Date dateTo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column accounting_report.company_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer companyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column accounting_report.date_to_cmp
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Date dateToCmp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column accounting_report.write_date
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Date writeDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column accounting_report.date_from_cmp
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Date dateFromCmp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column accounting_report.create_date
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column accounting_report.account_report_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer accountReportId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column accounting_report.write_uid
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer writeUid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column accounting_report.debit_credit
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Boolean debitCredit;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column accounting_report.id
     *
     * @return the value of accounting_report.id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column accounting_report.id
     *
     * @param id the value for accounting_report.id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column accounting_report.create_uid
     *
     * @return the value of accounting_report.create_uid
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getCreateUid() {
        return createUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column accounting_report.create_uid
     *
     * @param createUid the value for accounting_report.create_uid
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setCreateUid(Integer createUid) {
        this.createUid = createUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column accounting_report.enable_filter
     *
     * @return the value of accounting_report.enable_filter
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Boolean getEnableFilter() {
        return enableFilter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column accounting_report.enable_filter
     *
     * @param enableFilter the value for accounting_report.enable_filter
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setEnableFilter(Boolean enableFilter) {
        this.enableFilter = enableFilter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column accounting_report.date_from
     *
     * @return the value of accounting_report.date_from
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Date getDateFrom() {
        return dateFrom;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column accounting_report.date_from
     *
     * @param dateFrom the value for accounting_report.date_from
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column accounting_report.date_to
     *
     * @return the value of accounting_report.date_to
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Date getDateTo() {
        return dateTo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column accounting_report.date_to
     *
     * @param dateTo the value for accounting_report.date_to
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column accounting_report.company_id
     *
     * @return the value of accounting_report.company_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getCompanyId() {
        return companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column accounting_report.company_id
     *
     * @param companyId the value for accounting_report.company_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column accounting_report.date_to_cmp
     *
     * @return the value of accounting_report.date_to_cmp
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Date getDateToCmp() {
        return dateToCmp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column accounting_report.date_to_cmp
     *
     * @param dateToCmp the value for accounting_report.date_to_cmp
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setDateToCmp(Date dateToCmp) {
        this.dateToCmp = dateToCmp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column accounting_report.write_date
     *
     * @return the value of accounting_report.write_date
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Date getWriteDate() {
        return writeDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column accounting_report.write_date
     *
     * @param writeDate the value for accounting_report.write_date
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column accounting_report.date_from_cmp
     *
     * @return the value of accounting_report.date_from_cmp
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Date getDateFromCmp() {
        return dateFromCmp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column accounting_report.date_from_cmp
     *
     * @param dateFromCmp the value for accounting_report.date_from_cmp
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setDateFromCmp(Date dateFromCmp) {
        this.dateFromCmp = dateFromCmp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column accounting_report.create_date
     *
     * @return the value of accounting_report.create_date
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column accounting_report.create_date
     *
     * @param createDate the value for accounting_report.create_date
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column accounting_report.account_report_id
     *
     * @return the value of accounting_report.account_report_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getAccountReportId() {
        return accountReportId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column accounting_report.account_report_id
     *
     * @param accountReportId the value for accounting_report.account_report_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setAccountReportId(Integer accountReportId) {
        this.accountReportId = accountReportId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column accounting_report.write_uid
     *
     * @return the value of accounting_report.write_uid
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getWriteUid() {
        return writeUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column accounting_report.write_uid
     *
     * @param writeUid the value for accounting_report.write_uid
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setWriteUid(Integer writeUid) {
        this.writeUid = writeUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column accounting_report.debit_credit
     *
     * @return the value of accounting_report.debit_credit
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Boolean getDebitCredit() {
        return debitCredit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column accounting_report.debit_credit
     *
     * @param debitCredit the value for accounting_report.debit_credit
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setDebitCredit(Boolean debitCredit) {
        this.debitCredit = debitCredit;
    }
}