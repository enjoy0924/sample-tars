package com.altas.erp.eds.entity;

public class SaleOrderLineInvoiceRelEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sale_order_line_invoice_rel.invoice_line_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer invoiceLineId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sale_order_line_invoice_rel.order_line_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer orderLineId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sale_order_line_invoice_rel.invoice_line_id
     *
     * @return the value of sale_order_line_invoice_rel.invoice_line_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getInvoiceLineId() {
        return invoiceLineId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sale_order_line_invoice_rel.invoice_line_id
     *
     * @param invoiceLineId the value for sale_order_line_invoice_rel.invoice_line_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setInvoiceLineId(Integer invoiceLineId) {
        this.invoiceLineId = invoiceLineId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sale_order_line_invoice_rel.order_line_id
     *
     * @return the value of sale_order_line_invoice_rel.order_line_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getOrderLineId() {
        return orderLineId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sale_order_line_invoice_rel.order_line_id
     *
     * @param orderLineId the value for sale_order_line_invoice_rel.order_line_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setOrderLineId(Integer orderLineId) {
        this.orderLineId = orderLineId;
    }
}