package com.altas.erp.eds.entity;

public class ProcurementRuleEntityWithBLOBs extends ProcurementRuleEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column procurement_rule.name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column procurement_rule.action
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String action;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column procurement_rule.group_propagation_option
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String groupPropagationOption;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column procurement_rule.procure_method
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String procureMethod;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column procurement_rule.name
     *
     * @return the value of procurement_rule.name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column procurement_rule.name
     *
     * @param name the value for procurement_rule.name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column procurement_rule.action
     *
     * @return the value of procurement_rule.action
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getAction() {
        return action;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column procurement_rule.action
     *
     * @param action the value for procurement_rule.action
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setAction(String action) {
        this.action = action == null ? null : action.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column procurement_rule.group_propagation_option
     *
     * @return the value of procurement_rule.group_propagation_option
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getGroupPropagationOption() {
        return groupPropagationOption;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column procurement_rule.group_propagation_option
     *
     * @param groupPropagationOption the value for procurement_rule.group_propagation_option
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setGroupPropagationOption(String groupPropagationOption) {
        this.groupPropagationOption = groupPropagationOption == null ? null : groupPropagationOption.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column procurement_rule.procure_method
     *
     * @return the value of procurement_rule.procure_method
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getProcureMethod() {
        return procureMethod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column procurement_rule.procure_method
     *
     * @param procureMethod the value for procurement_rule.procure_method
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setProcureMethod(String procureMethod) {
        this.procureMethod = procureMethod == null ? null : procureMethod.trim();
    }
}