package com.altas.erp.eds.entity;

public class ProductSupplierinfoEntityWithBLOBs extends ProductSupplierinfoEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_supplierinfo.product_name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String productName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_supplierinfo.product_code
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String productCode;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_supplierinfo.product_name
     *
     * @return the value of product_supplierinfo.product_name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getProductName() {
        return productName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_supplierinfo.product_name
     *
     * @param productName the value for product_supplierinfo.product_name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_supplierinfo.product_code
     *
     * @return the value of product_supplierinfo.product_code
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_supplierinfo.product_code
     *
     * @param productCode the value for product_supplierinfo.product_code
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setProductCode(String productCode) {
        this.productCode = productCode == null ? null : productCode.trim();
    }
}