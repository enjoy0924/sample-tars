package com.altas.erp.eds.entity;

public class ProductUomEntityWithBLOBs extends ProductUomEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_uom.name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_uom.uom_type
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String uomType;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_uom.name
     *
     * @return the value of product_uom.name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_uom.name
     *
     * @param name the value for product_uom.name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_uom.uom_type
     *
     * @return the value of product_uom.uom_type
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getUomType() {
        return uomType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_uom.uom_type
     *
     * @param uomType the value for product_uom.uom_type
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setUomType(String uomType) {
        this.uomType = uomType == null ? null : uomType.trim();
    }
}