package com.altas.erp.eds.entity;

public class MrpWorkcenterProductivityEntityWithBLOBs extends MrpWorkcenterProductivityEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mrp_workcenter_productivity.loss_type
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String lossType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mrp_workcenter_productivity.description
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String description;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mrp_workcenter_productivity.loss_type
     *
     * @return the value of mrp_workcenter_productivity.loss_type
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getLossType() {
        return lossType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mrp_workcenter_productivity.loss_type
     *
     * @param lossType the value for mrp_workcenter_productivity.loss_type
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setLossType(String lossType) {
        this.lossType = lossType == null ? null : lossType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mrp_workcenter_productivity.description
     *
     * @return the value of mrp_workcenter_productivity.description
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mrp_workcenter_productivity.description
     *
     * @param description the value for mrp_workcenter_productivity.description
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}