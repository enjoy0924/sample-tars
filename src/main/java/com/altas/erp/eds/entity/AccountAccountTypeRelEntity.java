package com.altas.erp.eds.entity;

public class AccountAccountTypeRelEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_account_type_rel.journal_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer journalId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_account_type_rel.account_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer accountId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_account_type_rel.journal_id
     *
     * @return the value of account_account_type_rel.journal_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getJournalId() {
        return journalId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_account_type_rel.journal_id
     *
     * @param journalId the value for account_account_type_rel.journal_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setJournalId(Integer journalId) {
        this.journalId = journalId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_account_type_rel.account_id
     *
     * @return the value of account_account_type_rel.account_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getAccountId() {
        return accountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_account_type_rel.account_id
     *
     * @param accountId the value for account_account_type_rel.account_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }
}