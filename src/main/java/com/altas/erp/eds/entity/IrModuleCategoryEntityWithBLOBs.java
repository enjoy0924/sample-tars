package com.altas.erp.eds.entity;

public class IrModuleCategoryEntityWithBLOBs extends IrModuleCategoryEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ir_module_category.name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ir_module_category.description
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String description;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ir_module_category.name
     *
     * @return the value of ir_module_category.name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ir_module_category.name
     *
     * @param name the value for ir_module_category.name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ir_module_category.description
     *
     * @return the value of ir_module_category.description
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ir_module_category.description
     *
     * @param description the value for ir_module_category.description
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}