package com.altas.erp.eds.entity;

public class AccountFiscalPositionTemplateEntityWithBLOBs extends AccountFiscalPositionTemplateEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_fiscal_position_template.name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_fiscal_position_template.note
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String note;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_fiscal_position_template.name
     *
     * @return the value of account_fiscal_position_template.name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_fiscal_position_template.name
     *
     * @param name the value for account_fiscal_position_template.name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_fiscal_position_template.note
     *
     * @return the value of account_fiscal_position_template.note
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_fiscal_position_template.note
     *
     * @param note the value for account_fiscal_position_template.note
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}