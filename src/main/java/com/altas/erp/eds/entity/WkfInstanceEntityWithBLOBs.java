package com.altas.erp.eds.entity;

public class WkfInstanceEntityWithBLOBs extends WkfInstanceEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wkf_instance.res_type
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String resType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wkf_instance.state
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String state;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wkf_instance.res_type
     *
     * @return the value of wkf_instance.res_type
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getResType() {
        return resType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wkf_instance.res_type
     *
     * @param resType the value for wkf_instance.res_type
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setResType(String resType) {
        this.resType = resType == null ? null : resType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wkf_instance.state
     *
     * @return the value of wkf_instance.state
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wkf_instance.state
     *
     * @param state the value for wkf_instance.state
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}