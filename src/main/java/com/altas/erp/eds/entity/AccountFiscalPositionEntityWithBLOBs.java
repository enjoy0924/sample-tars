package com.altas.erp.eds.entity;

public class AccountFiscalPositionEntityWithBLOBs extends AccountFiscalPositionEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_fiscal_position.note
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String note;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_fiscal_position.name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_fiscal_position.note
     *
     * @return the value of account_fiscal_position.note
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_fiscal_position.note
     *
     * @param note the value for account_fiscal_position.note
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_fiscal_position.name
     *
     * @return the value of account_fiscal_position.name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_fiscal_position.name
     *
     * @param name the value for account_fiscal_position.name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}