package com.altas.erp.eds.entity;

public class MessageAttachmentRelEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message_attachment_rel.message_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer messageId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column message_attachment_rel.attachment_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer attachmentId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message_attachment_rel.message_id
     *
     * @return the value of message_attachment_rel.message_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getMessageId() {
        return messageId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message_attachment_rel.message_id
     *
     * @param messageId the value for message_attachment_rel.message_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column message_attachment_rel.attachment_id
     *
     * @return the value of message_attachment_rel.attachment_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getAttachmentId() {
        return attachmentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column message_attachment_rel.attachment_id
     *
     * @param attachmentId the value for message_attachment_rel.attachment_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setAttachmentId(Integer attachmentId) {
        this.attachmentId = attachmentId;
    }
}