package com.altas.erp.eds.entity;

public class AccountInvoicePaymentRelEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_invoice_payment_rel.payment_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer paymentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_invoice_payment_rel.invoice_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer invoiceId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_invoice_payment_rel.payment_id
     *
     * @return the value of account_invoice_payment_rel.payment_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getPaymentId() {
        return paymentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_invoice_payment_rel.payment_id
     *
     * @param paymentId the value for account_invoice_payment_rel.payment_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_invoice_payment_rel.invoice_id
     *
     * @return the value of account_invoice_payment_rel.invoice_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getInvoiceId() {
        return invoiceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_invoice_payment_rel.invoice_id
     *
     * @param invoiceId the value for account_invoice_payment_rel.invoice_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setInvoiceId(Integer invoiceId) {
        this.invoiceId = invoiceId;
    }
}