package com.altas.erp.eds.entity;

public class ProductRemovalEntityWithBLOBs extends ProductRemovalEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_removal.name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_removal.method
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String method;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_removal.name
     *
     * @return the value of product_removal.name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_removal.name
     *
     * @param name the value for product_removal.name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_removal.method
     *
     * @return the value of product_removal.method
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getMethod() {
        return method;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_removal.method
     *
     * @param method the value for product_removal.method
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setMethod(String method) {
        this.method = method == null ? null : method.trim();
    }
}