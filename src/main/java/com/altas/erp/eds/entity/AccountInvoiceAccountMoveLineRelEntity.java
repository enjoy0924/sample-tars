package com.altas.erp.eds.entity;

public class AccountInvoiceAccountMoveLineRelEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_invoice_account_move_line_rel.account_invoice_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer accountInvoiceId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_invoice_account_move_line_rel.account_move_line_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer accountMoveLineId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_invoice_account_move_line_rel.account_invoice_id
     *
     * @return the value of account_invoice_account_move_line_rel.account_invoice_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getAccountInvoiceId() {
        return accountInvoiceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_invoice_account_move_line_rel.account_invoice_id
     *
     * @param accountInvoiceId the value for account_invoice_account_move_line_rel.account_invoice_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setAccountInvoiceId(Integer accountInvoiceId) {
        this.accountInvoiceId = accountInvoiceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_invoice_account_move_line_rel.account_move_line_id
     *
     * @return the value of account_invoice_account_move_line_rel.account_move_line_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getAccountMoveLineId() {
        return accountMoveLineId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_invoice_account_move_line_rel.account_move_line_id
     *
     * @param accountMoveLineId the value for account_invoice_account_move_line_rel.account_move_line_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setAccountMoveLineId(Integer accountMoveLineId) {
        this.accountMoveLineId = accountMoveLineId;
    }
}