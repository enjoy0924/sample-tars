package com.altas.erp.eds.entity;

public class AccountTaxPurchaseOrderLineRelEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_tax_purchase_order_line_rel.purchase_order_line_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer purchaseOrderLineId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_tax_purchase_order_line_rel.account_tax_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer accountTaxId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_tax_purchase_order_line_rel.purchase_order_line_id
     *
     * @return the value of account_tax_purchase_order_line_rel.purchase_order_line_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getPurchaseOrderLineId() {
        return purchaseOrderLineId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_tax_purchase_order_line_rel.purchase_order_line_id
     *
     * @param purchaseOrderLineId the value for account_tax_purchase_order_line_rel.purchase_order_line_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setPurchaseOrderLineId(Integer purchaseOrderLineId) {
        this.purchaseOrderLineId = purchaseOrderLineId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_tax_purchase_order_line_rel.account_tax_id
     *
     * @return the value of account_tax_purchase_order_line_rel.account_tax_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getAccountTaxId() {
        return accountTaxId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_tax_purchase_order_line_rel.account_tax_id
     *
     * @param accountTaxId the value for account_tax_purchase_order_line_rel.account_tax_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setAccountTaxId(Integer accountTaxId) {
        this.accountTaxId = accountTaxId;
    }
}