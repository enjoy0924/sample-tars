package com.altas.erp.eds.entity;

public class ProductAttributeLineProductAttributeValueRelEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_attribute_line_product_attribute_value_rel.product_attribute_line_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer productAttributeLineId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column product_attribute_line_product_attribute_value_rel.product_attribute_value_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer productAttributeValueId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_attribute_line_product_attribute_value_rel.product_attribute_line_id
     *
     * @return the value of product_attribute_line_product_attribute_value_rel.product_attribute_line_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getProductAttributeLineId() {
        return productAttributeLineId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_attribute_line_product_attribute_value_rel.product_attribute_line_id
     *
     * @param productAttributeLineId the value for product_attribute_line_product_attribute_value_rel.product_attribute_line_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setProductAttributeLineId(Integer productAttributeLineId) {
        this.productAttributeLineId = productAttributeLineId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column product_attribute_line_product_attribute_value_rel.product_attribute_value_id
     *
     * @return the value of product_attribute_line_product_attribute_value_rel.product_attribute_value_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getProductAttributeValueId() {
        return productAttributeValueId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column product_attribute_line_product_attribute_value_rel.product_attribute_value_id
     *
     * @param productAttributeValueId the value for product_attribute_line_product_attribute_value_rel.product_attribute_value_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setProductAttributeValueId(Integer productAttributeValueId) {
        this.productAttributeValueId = productAttributeValueId;
    }
}