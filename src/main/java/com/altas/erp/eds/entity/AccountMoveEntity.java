package com.altas.erp.eds.entity;

import java.util.Date;

public class AccountMoveEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_move.id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_move.create_uid
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer createUid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_move.company_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer companyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_move.journal_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer journalId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_move.currency_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer currencyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_move.amount
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Double amount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_move.matched_percentage
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Double matchedPercentage;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_move.write_date
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Date writeDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_move.date
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Date date;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_move.create_date
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_move.write_uid
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer writeUid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_move.partner_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer partnerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_move.statement_line_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer statementLineId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_move.id
     *
     * @return the value of account_move.id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_move.id
     *
     * @param id the value for account_move.id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_move.create_uid
     *
     * @return the value of account_move.create_uid
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getCreateUid() {
        return createUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_move.create_uid
     *
     * @param createUid the value for account_move.create_uid
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setCreateUid(Integer createUid) {
        this.createUid = createUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_move.company_id
     *
     * @return the value of account_move.company_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getCompanyId() {
        return companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_move.company_id
     *
     * @param companyId the value for account_move.company_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_move.journal_id
     *
     * @return the value of account_move.journal_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getJournalId() {
        return journalId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_move.journal_id
     *
     * @param journalId the value for account_move.journal_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setJournalId(Integer journalId) {
        this.journalId = journalId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_move.currency_id
     *
     * @return the value of account_move.currency_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getCurrencyId() {
        return currencyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_move.currency_id
     *
     * @param currencyId the value for account_move.currency_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setCurrencyId(Integer currencyId) {
        this.currencyId = currencyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_move.amount
     *
     * @return the value of account_move.amount
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_move.amount
     *
     * @param amount the value for account_move.amount
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_move.matched_percentage
     *
     * @return the value of account_move.matched_percentage
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Double getMatchedPercentage() {
        return matchedPercentage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_move.matched_percentage
     *
     * @param matchedPercentage the value for account_move.matched_percentage
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setMatchedPercentage(Double matchedPercentage) {
        this.matchedPercentage = matchedPercentage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_move.write_date
     *
     * @return the value of account_move.write_date
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Date getWriteDate() {
        return writeDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_move.write_date
     *
     * @param writeDate the value for account_move.write_date
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_move.date
     *
     * @return the value of account_move.date
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Date getDate() {
        return date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_move.date
     *
     * @param date the value for account_move.date
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_move.create_date
     *
     * @return the value of account_move.create_date
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_move.create_date
     *
     * @param createDate the value for account_move.create_date
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_move.write_uid
     *
     * @return the value of account_move.write_uid
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getWriteUid() {
        return writeUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_move.write_uid
     *
     * @param writeUid the value for account_move.write_uid
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setWriteUid(Integer writeUid) {
        this.writeUid = writeUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_move.partner_id
     *
     * @return the value of account_move.partner_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getPartnerId() {
        return partnerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_move.partner_id
     *
     * @param partnerId the value for account_move.partner_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setPartnerId(Integer partnerId) {
        this.partnerId = partnerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_move.statement_line_id
     *
     * @return the value of account_move.statement_line_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getStatementLineId() {
        return statementLineId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_move.statement_line_id
     *
     * @param statementLineId the value for account_move.statement_line_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setStatementLineId(Integer statementLineId) {
        this.statementLineId = statementLineId;
    }
}