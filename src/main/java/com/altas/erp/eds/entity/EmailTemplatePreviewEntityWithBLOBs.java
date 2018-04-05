package com.altas.erp.eds.entity;

public class EmailTemplatePreviewEntityWithBLOBs extends EmailTemplatePreviewEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column email_template_preview.partner_to
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String partnerTo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column email_template_preview.subject
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String subject;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column email_template_preview.null_value
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String nullValue;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column email_template_preview.email_cc
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String emailCc;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column email_template_preview.res_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String resId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column email_template_preview.body_html
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String bodyHtml;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column email_template_preview.email_to
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String emailTo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column email_template_preview.scheduled_date
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String scheduledDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column email_template_preview.copyvalue
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String copyvalue;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column email_template_preview.lang
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String lang;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column email_template_preview.name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column email_template_preview.report_name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String reportName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column email_template_preview.reply_to
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String replyTo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column email_template_preview.model
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String model;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column email_template_preview.email_from
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String emailFrom;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column email_template_preview.partner_to
     *
     * @return the value of email_template_preview.partner_to
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getPartnerTo() {
        return partnerTo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column email_template_preview.partner_to
     *
     * @param partnerTo the value for email_template_preview.partner_to
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setPartnerTo(String partnerTo) {
        this.partnerTo = partnerTo == null ? null : partnerTo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column email_template_preview.subject
     *
     * @return the value of email_template_preview.subject
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getSubject() {
        return subject;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column email_template_preview.subject
     *
     * @param subject the value for email_template_preview.subject
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column email_template_preview.null_value
     *
     * @return the value of email_template_preview.null_value
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getNullValue() {
        return nullValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column email_template_preview.null_value
     *
     * @param nullValue the value for email_template_preview.null_value
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setNullValue(String nullValue) {
        this.nullValue = nullValue == null ? null : nullValue.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column email_template_preview.email_cc
     *
     * @return the value of email_template_preview.email_cc
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getEmailCc() {
        return emailCc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column email_template_preview.email_cc
     *
     * @param emailCc the value for email_template_preview.email_cc
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setEmailCc(String emailCc) {
        this.emailCc = emailCc == null ? null : emailCc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column email_template_preview.res_id
     *
     * @return the value of email_template_preview.res_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getResId() {
        return resId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column email_template_preview.res_id
     *
     * @param resId the value for email_template_preview.res_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setResId(String resId) {
        this.resId = resId == null ? null : resId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column email_template_preview.body_html
     *
     * @return the value of email_template_preview.body_html
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getBodyHtml() {
        return bodyHtml;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column email_template_preview.body_html
     *
     * @param bodyHtml the value for email_template_preview.body_html
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setBodyHtml(String bodyHtml) {
        this.bodyHtml = bodyHtml == null ? null : bodyHtml.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column email_template_preview.email_to
     *
     * @return the value of email_template_preview.email_to
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getEmailTo() {
        return emailTo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column email_template_preview.email_to
     *
     * @param emailTo the value for email_template_preview.email_to
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setEmailTo(String emailTo) {
        this.emailTo = emailTo == null ? null : emailTo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column email_template_preview.scheduled_date
     *
     * @return the value of email_template_preview.scheduled_date
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getScheduledDate() {
        return scheduledDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column email_template_preview.scheduled_date
     *
     * @param scheduledDate the value for email_template_preview.scheduled_date
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setScheduledDate(String scheduledDate) {
        this.scheduledDate = scheduledDate == null ? null : scheduledDate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column email_template_preview.copyvalue
     *
     * @return the value of email_template_preview.copyvalue
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getCopyvalue() {
        return copyvalue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column email_template_preview.copyvalue
     *
     * @param copyvalue the value for email_template_preview.copyvalue
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setCopyvalue(String copyvalue) {
        this.copyvalue = copyvalue == null ? null : copyvalue.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column email_template_preview.lang
     *
     * @return the value of email_template_preview.lang
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getLang() {
        return lang;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column email_template_preview.lang
     *
     * @param lang the value for email_template_preview.lang
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setLang(String lang) {
        this.lang = lang == null ? null : lang.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column email_template_preview.name
     *
     * @return the value of email_template_preview.name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column email_template_preview.name
     *
     * @param name the value for email_template_preview.name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column email_template_preview.report_name
     *
     * @return the value of email_template_preview.report_name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getReportName() {
        return reportName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column email_template_preview.report_name
     *
     * @param reportName the value for email_template_preview.report_name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setReportName(String reportName) {
        this.reportName = reportName == null ? null : reportName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column email_template_preview.reply_to
     *
     * @return the value of email_template_preview.reply_to
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getReplyTo() {
        return replyTo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column email_template_preview.reply_to
     *
     * @param replyTo the value for email_template_preview.reply_to
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setReplyTo(String replyTo) {
        this.replyTo = replyTo == null ? null : replyTo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column email_template_preview.model
     *
     * @return the value of email_template_preview.model
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getModel() {
        return model;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column email_template_preview.model
     *
     * @param model the value for email_template_preview.model
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column email_template_preview.email_from
     *
     * @return the value of email_template_preview.email_from
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getEmailFrom() {
        return emailFrom;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column email_template_preview.email_from
     *
     * @param emailFrom the value for email_template_preview.email_from
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setEmailFrom(String emailFrom) {
        this.emailFrom = emailFrom == null ? null : emailFrom.trim();
    }
}