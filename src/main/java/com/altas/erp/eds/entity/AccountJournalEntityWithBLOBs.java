package com.altas.erp.eds.entity;

public class AccountJournalEntityWithBLOBs extends AccountJournalEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_journal.bank_statements_source
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String bankStatementsSource;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_journal.name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_journal.type
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String type;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_journal.bank_statements_source
     *
     * @return the value of account_journal.bank_statements_source
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getBankStatementsSource() {
        return bankStatementsSource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_journal.bank_statements_source
     *
     * @param bankStatementsSource the value for account_journal.bank_statements_source
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setBankStatementsSource(String bankStatementsSource) {
        this.bankStatementsSource = bankStatementsSource == null ? null : bankStatementsSource.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_journal.name
     *
     * @return the value of account_journal.name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_journal.name
     *
     * @param name the value for account_journal.name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_journal.type
     *
     * @return the value of account_journal.type
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_journal.type
     *
     * @param type the value for account_journal.type
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
}