package com.altas.erp.eds.entity;

public class WkfTriggersEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wkf_triggers.id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wkf_triggers.instance_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer instanceId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wkf_triggers.workitem_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer workitemId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wkf_triggers.res_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer resId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wkf_triggers.model
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String model;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wkf_triggers.id
     *
     * @return the value of wkf_triggers.id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wkf_triggers.id
     *
     * @param id the value for wkf_triggers.id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wkf_triggers.instance_id
     *
     * @return the value of wkf_triggers.instance_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getInstanceId() {
        return instanceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wkf_triggers.instance_id
     *
     * @param instanceId the value for wkf_triggers.instance_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setInstanceId(Integer instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wkf_triggers.workitem_id
     *
     * @return the value of wkf_triggers.workitem_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getWorkitemId() {
        return workitemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wkf_triggers.workitem_id
     *
     * @param workitemId the value for wkf_triggers.workitem_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setWorkitemId(Integer workitemId) {
        this.workitemId = workitemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wkf_triggers.res_id
     *
     * @return the value of wkf_triggers.res_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getResId() {
        return resId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wkf_triggers.res_id
     *
     * @param resId the value for wkf_triggers.res_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setResId(Integer resId) {
        this.resId = resId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wkf_triggers.model
     *
     * @return the value of wkf_triggers.model
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getModel() {
        return model;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wkf_triggers.model
     *
     * @param model the value for wkf_triggers.model
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }
}