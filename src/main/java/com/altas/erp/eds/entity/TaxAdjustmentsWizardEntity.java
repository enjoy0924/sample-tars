package com.altas.erp.eds.entity;

import java.util.Date;

public class TaxAdjustmentsWizardEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tax_adjustments_wizard.id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tax_adjustments_wizard.create_uid
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer createUid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tax_adjustments_wizard.credit_account_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer creditAccountId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tax_adjustments_wizard.journal_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer journalId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tax_adjustments_wizard.write_uid
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer writeUid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tax_adjustments_wizard.company_currency_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer companyCurrencyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tax_adjustments_wizard.amount
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Double amount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tax_adjustments_wizard.write_date
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Date writeDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tax_adjustments_wizard.date
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Date date;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tax_adjustments_wizard.create_date
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tax_adjustments_wizard.debit_account_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer debitAccountId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tax_adjustments_wizard.tax_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer taxId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tax_adjustments_wizard.reason
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String reason;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tax_adjustments_wizard.id
     *
     * @return the value of tax_adjustments_wizard.id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tax_adjustments_wizard.id
     *
     * @param id the value for tax_adjustments_wizard.id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tax_adjustments_wizard.create_uid
     *
     * @return the value of tax_adjustments_wizard.create_uid
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getCreateUid() {
        return createUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tax_adjustments_wizard.create_uid
     *
     * @param createUid the value for tax_adjustments_wizard.create_uid
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setCreateUid(Integer createUid) {
        this.createUid = createUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tax_adjustments_wizard.credit_account_id
     *
     * @return the value of tax_adjustments_wizard.credit_account_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getCreditAccountId() {
        return creditAccountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tax_adjustments_wizard.credit_account_id
     *
     * @param creditAccountId the value for tax_adjustments_wizard.credit_account_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setCreditAccountId(Integer creditAccountId) {
        this.creditAccountId = creditAccountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tax_adjustments_wizard.journal_id
     *
     * @return the value of tax_adjustments_wizard.journal_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getJournalId() {
        return journalId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tax_adjustments_wizard.journal_id
     *
     * @param journalId the value for tax_adjustments_wizard.journal_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setJournalId(Integer journalId) {
        this.journalId = journalId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tax_adjustments_wizard.write_uid
     *
     * @return the value of tax_adjustments_wizard.write_uid
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getWriteUid() {
        return writeUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tax_adjustments_wizard.write_uid
     *
     * @param writeUid the value for tax_adjustments_wizard.write_uid
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setWriteUid(Integer writeUid) {
        this.writeUid = writeUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tax_adjustments_wizard.company_currency_id
     *
     * @return the value of tax_adjustments_wizard.company_currency_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getCompanyCurrencyId() {
        return companyCurrencyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tax_adjustments_wizard.company_currency_id
     *
     * @param companyCurrencyId the value for tax_adjustments_wizard.company_currency_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setCompanyCurrencyId(Integer companyCurrencyId) {
        this.companyCurrencyId = companyCurrencyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tax_adjustments_wizard.amount
     *
     * @return the value of tax_adjustments_wizard.amount
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tax_adjustments_wizard.amount
     *
     * @param amount the value for tax_adjustments_wizard.amount
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tax_adjustments_wizard.write_date
     *
     * @return the value of tax_adjustments_wizard.write_date
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Date getWriteDate() {
        return writeDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tax_adjustments_wizard.write_date
     *
     * @param writeDate the value for tax_adjustments_wizard.write_date
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tax_adjustments_wizard.date
     *
     * @return the value of tax_adjustments_wizard.date
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Date getDate() {
        return date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tax_adjustments_wizard.date
     *
     * @param date the value for tax_adjustments_wizard.date
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tax_adjustments_wizard.create_date
     *
     * @return the value of tax_adjustments_wizard.create_date
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tax_adjustments_wizard.create_date
     *
     * @param createDate the value for tax_adjustments_wizard.create_date
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tax_adjustments_wizard.debit_account_id
     *
     * @return the value of tax_adjustments_wizard.debit_account_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getDebitAccountId() {
        return debitAccountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tax_adjustments_wizard.debit_account_id
     *
     * @param debitAccountId the value for tax_adjustments_wizard.debit_account_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setDebitAccountId(Integer debitAccountId) {
        this.debitAccountId = debitAccountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tax_adjustments_wizard.tax_id
     *
     * @return the value of tax_adjustments_wizard.tax_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getTaxId() {
        return taxId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tax_adjustments_wizard.tax_id
     *
     * @param taxId the value for tax_adjustments_wizard.tax_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setTaxId(Integer taxId) {
        this.taxId = taxId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tax_adjustments_wizard.reason
     *
     * @return the value of tax_adjustments_wizard.reason
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getReason() {
        return reason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tax_adjustments_wizard.reason
     *
     * @param reason the value for tax_adjustments_wizard.reason
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }
}