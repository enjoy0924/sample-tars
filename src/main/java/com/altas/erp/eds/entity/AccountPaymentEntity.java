package com.altas.erp.eds.entity;

import java.util.Date;

public class AccountPaymentEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_payment.id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_payment.create_date
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_payment.journal_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer journalId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_payment.currency_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer currencyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_payment.partner_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer partnerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_payment.payment_method_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer paymentMethodId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_payment.payment_date
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Date paymentDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_payment.company_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer companyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_payment.writeoff_account_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer writeoffAccountId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_payment.create_uid
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer createUid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_payment.write_date
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Date writeDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_payment.write_uid
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer writeUid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_payment.destination_journal_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer destinationJournalId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_payment.amount
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Double amount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_payment.payment_transaction_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer paymentTransactionId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_payment.payment_token_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer paymentTokenId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_payment.id
     *
     * @return the value of account_payment.id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_payment.id
     *
     * @param id the value for account_payment.id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_payment.create_date
     *
     * @return the value of account_payment.create_date
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_payment.create_date
     *
     * @param createDate the value for account_payment.create_date
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_payment.journal_id
     *
     * @return the value of account_payment.journal_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getJournalId() {
        return journalId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_payment.journal_id
     *
     * @param journalId the value for account_payment.journal_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setJournalId(Integer journalId) {
        this.journalId = journalId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_payment.currency_id
     *
     * @return the value of account_payment.currency_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getCurrencyId() {
        return currencyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_payment.currency_id
     *
     * @param currencyId the value for account_payment.currency_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setCurrencyId(Integer currencyId) {
        this.currencyId = currencyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_payment.partner_id
     *
     * @return the value of account_payment.partner_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getPartnerId() {
        return partnerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_payment.partner_id
     *
     * @param partnerId the value for account_payment.partner_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setPartnerId(Integer partnerId) {
        this.partnerId = partnerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_payment.payment_method_id
     *
     * @return the value of account_payment.payment_method_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getPaymentMethodId() {
        return paymentMethodId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_payment.payment_method_id
     *
     * @param paymentMethodId the value for account_payment.payment_method_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setPaymentMethodId(Integer paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_payment.payment_date
     *
     * @return the value of account_payment.payment_date
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Date getPaymentDate() {
        return paymentDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_payment.payment_date
     *
     * @param paymentDate the value for account_payment.payment_date
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_payment.company_id
     *
     * @return the value of account_payment.company_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getCompanyId() {
        return companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_payment.company_id
     *
     * @param companyId the value for account_payment.company_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_payment.writeoff_account_id
     *
     * @return the value of account_payment.writeoff_account_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getWriteoffAccountId() {
        return writeoffAccountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_payment.writeoff_account_id
     *
     * @param writeoffAccountId the value for account_payment.writeoff_account_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setWriteoffAccountId(Integer writeoffAccountId) {
        this.writeoffAccountId = writeoffAccountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_payment.create_uid
     *
     * @return the value of account_payment.create_uid
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getCreateUid() {
        return createUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_payment.create_uid
     *
     * @param createUid the value for account_payment.create_uid
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setCreateUid(Integer createUid) {
        this.createUid = createUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_payment.write_date
     *
     * @return the value of account_payment.write_date
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Date getWriteDate() {
        return writeDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_payment.write_date
     *
     * @param writeDate the value for account_payment.write_date
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_payment.write_uid
     *
     * @return the value of account_payment.write_uid
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getWriteUid() {
        return writeUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_payment.write_uid
     *
     * @param writeUid the value for account_payment.write_uid
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setWriteUid(Integer writeUid) {
        this.writeUid = writeUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_payment.destination_journal_id
     *
     * @return the value of account_payment.destination_journal_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getDestinationJournalId() {
        return destinationJournalId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_payment.destination_journal_id
     *
     * @param destinationJournalId the value for account_payment.destination_journal_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setDestinationJournalId(Integer destinationJournalId) {
        this.destinationJournalId = destinationJournalId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_payment.amount
     *
     * @return the value of account_payment.amount
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_payment.amount
     *
     * @param amount the value for account_payment.amount
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_payment.payment_transaction_id
     *
     * @return the value of account_payment.payment_transaction_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getPaymentTransactionId() {
        return paymentTransactionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_payment.payment_transaction_id
     *
     * @param paymentTransactionId the value for account_payment.payment_transaction_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setPaymentTransactionId(Integer paymentTransactionId) {
        this.paymentTransactionId = paymentTransactionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_payment.payment_token_id
     *
     * @return the value of account_payment.payment_token_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getPaymentTokenId() {
        return paymentTokenId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_payment.payment_token_id
     *
     * @param paymentTokenId the value for account_payment.payment_token_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setPaymentTokenId(Integer paymentTokenId) {
        this.paymentTokenId = paymentTokenId;
    }
}