package com.altas.erp.eds.entity;

public class MailFollowersEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mail_followers.id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mail_followers.partner_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer partnerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mail_followers.channel_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer channelId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mail_followers.res_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer resId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mail_followers.res_model
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String resModel;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mail_followers.id
     *
     * @return the value of mail_followers.id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mail_followers.id
     *
     * @param id the value for mail_followers.id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mail_followers.partner_id
     *
     * @return the value of mail_followers.partner_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getPartnerId() {
        return partnerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mail_followers.partner_id
     *
     * @param partnerId the value for mail_followers.partner_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setPartnerId(Integer partnerId) {
        this.partnerId = partnerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mail_followers.channel_id
     *
     * @return the value of mail_followers.channel_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getChannelId() {
        return channelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mail_followers.channel_id
     *
     * @param channelId the value for mail_followers.channel_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setChannelId(Integer channelId) {
        this.channelId = channelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mail_followers.res_id
     *
     * @return the value of mail_followers.res_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getResId() {
        return resId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mail_followers.res_id
     *
     * @param resId the value for mail_followers.res_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setResId(Integer resId) {
        this.resId = resId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mail_followers.res_model
     *
     * @return the value of mail_followers.res_model
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getResModel() {
        return resModel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mail_followers.res_model
     *
     * @param resModel the value for mail_followers.res_model
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setResModel(String resModel) {
        this.resModel = resModel == null ? null : resModel.trim();
    }
}