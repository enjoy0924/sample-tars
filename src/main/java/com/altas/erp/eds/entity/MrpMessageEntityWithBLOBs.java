package com.altas.erp.eds.entity;

public class MrpMessageEntityWithBLOBs extends MrpMessageEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mrp_message.name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mrp_message.message
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String message;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mrp_message.name
     *
     * @return the value of mrp_message.name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mrp_message.name
     *
     * @param name the value for mrp_message.name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mrp_message.message
     *
     * @return the value of mrp_message.message
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getMessage() {
        return message;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mrp_message.message
     *
     * @param message the value for mrp_message.message
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }
}