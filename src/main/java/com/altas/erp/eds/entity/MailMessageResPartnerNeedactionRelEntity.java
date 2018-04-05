package com.altas.erp.eds.entity;

public class MailMessageResPartnerNeedactionRelEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mail_message_res_partner_needaction_rel.id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mail_message_res_partner_needaction_rel.mail_message_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer mailMessageId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mail_message_res_partner_needaction_rel.is_email
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Boolean isEmail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mail_message_res_partner_needaction_rel.is_read
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Boolean isRead;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mail_message_res_partner_needaction_rel.res_partner_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer resPartnerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mail_message_res_partner_needaction_rel.email_status
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String emailStatus;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mail_message_res_partner_needaction_rel.id
     *
     * @return the value of mail_message_res_partner_needaction_rel.id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mail_message_res_partner_needaction_rel.id
     *
     * @param id the value for mail_message_res_partner_needaction_rel.id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mail_message_res_partner_needaction_rel.mail_message_id
     *
     * @return the value of mail_message_res_partner_needaction_rel.mail_message_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getMailMessageId() {
        return mailMessageId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mail_message_res_partner_needaction_rel.mail_message_id
     *
     * @param mailMessageId the value for mail_message_res_partner_needaction_rel.mail_message_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setMailMessageId(Integer mailMessageId) {
        this.mailMessageId = mailMessageId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mail_message_res_partner_needaction_rel.is_email
     *
     * @return the value of mail_message_res_partner_needaction_rel.is_email
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Boolean getIsEmail() {
        return isEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mail_message_res_partner_needaction_rel.is_email
     *
     * @param isEmail the value for mail_message_res_partner_needaction_rel.is_email
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setIsEmail(Boolean isEmail) {
        this.isEmail = isEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mail_message_res_partner_needaction_rel.is_read
     *
     * @return the value of mail_message_res_partner_needaction_rel.is_read
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Boolean getIsRead() {
        return isRead;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mail_message_res_partner_needaction_rel.is_read
     *
     * @param isRead the value for mail_message_res_partner_needaction_rel.is_read
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setIsRead(Boolean isRead) {
        this.isRead = isRead;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mail_message_res_partner_needaction_rel.res_partner_id
     *
     * @return the value of mail_message_res_partner_needaction_rel.res_partner_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getResPartnerId() {
        return resPartnerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mail_message_res_partner_needaction_rel.res_partner_id
     *
     * @param resPartnerId the value for mail_message_res_partner_needaction_rel.res_partner_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setResPartnerId(Integer resPartnerId) {
        this.resPartnerId = resPartnerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column mail_message_res_partner_needaction_rel.email_status
     *
     * @return the value of mail_message_res_partner_needaction_rel.email_status
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getEmailStatus() {
        return emailStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column mail_message_res_partner_needaction_rel.email_status
     *
     * @param emailStatus the value for mail_message_res_partner_needaction_rel.email_status
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setEmailStatus(String emailStatus) {
        this.emailStatus = emailStatus == null ? null : emailStatus.trim();
    }
}