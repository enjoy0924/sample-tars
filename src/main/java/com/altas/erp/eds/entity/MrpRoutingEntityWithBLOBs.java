package com.altas.erp.eds.entity;

public class MrpRoutingEntityWithBLOBs extends MrpRoutingEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mrp_routing.code
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String code;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mrp_routing.name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mrp_routing.note
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String note;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mrp_routing.code
     *
     * @return the value of mrp_routing.code
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mrp_routing.code
     *
     * @param code the value for mrp_routing.code
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mrp_routing.name
     *
     * @return the value of mrp_routing.name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mrp_routing.name
     *
     * @param name the value for mrp_routing.name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mrp_routing.note
     *
     * @return the value of mrp_routing.note
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mrp_routing.note
     *
     * @param note the value for mrp_routing.note
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}