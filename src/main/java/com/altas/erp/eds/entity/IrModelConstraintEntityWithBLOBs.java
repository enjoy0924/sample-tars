package com.altas.erp.eds.entity;

public class IrModelConstraintEntityWithBLOBs extends IrModelConstraintEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ir_model_constraint.definition
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String definition;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ir_model_constraint.name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ir_model_constraint.definition
     *
     * @return the value of ir_model_constraint.definition
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getDefinition() {
        return definition;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ir_model_constraint.definition
     *
     * @param definition the value for ir_model_constraint.definition
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setDefinition(String definition) {
        this.definition = definition == null ? null : definition.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ir_model_constraint.name
     *
     * @return the value of ir_model_constraint.name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ir_model_constraint.name
     *
     * @param name the value for ir_model_constraint.name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}