package com.altas.erp.eds.entity;

public class CrmTeamEntityWithBLOBs extends CrmTeamEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column crm_team.name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column crm_team.reply_to
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String replyTo;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column crm_team.name
     *
     * @return the value of crm_team.name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column crm_team.name
     *
     * @param name the value for crm_team.name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column crm_team.reply_to
     *
     * @return the value of crm_team.reply_to
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getReplyTo() {
        return replyTo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column crm_team.reply_to
     *
     * @param replyTo the value for crm_team.reply_to
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setReplyTo(String replyTo) {
        this.replyTo = replyTo == null ? null : replyTo.trim();
    }
}