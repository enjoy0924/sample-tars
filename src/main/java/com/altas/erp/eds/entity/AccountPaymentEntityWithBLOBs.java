package com.altas.erp.eds.entity;

public class AccountPaymentEntityWithBLOBs extends AccountPaymentEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_payment.communication
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String communication;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_payment.payment_difference_handling
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String paymentDifferenceHandling;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_payment.state
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String state;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_payment.move_name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String moveName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_payment.name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_payment.partner_type
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String partnerType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_payment.payment_type
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String paymentType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_payment.payment_reference
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String paymentReference;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_payment.communication
     *
     * @return the value of account_payment.communication
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getCommunication() {
        return communication;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_payment.communication
     *
     * @param communication the value for account_payment.communication
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setCommunication(String communication) {
        this.communication = communication == null ? null : communication.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_payment.payment_difference_handling
     *
     * @return the value of account_payment.payment_difference_handling
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getPaymentDifferenceHandling() {
        return paymentDifferenceHandling;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_payment.payment_difference_handling
     *
     * @param paymentDifferenceHandling the value for account_payment.payment_difference_handling
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setPaymentDifferenceHandling(String paymentDifferenceHandling) {
        this.paymentDifferenceHandling = paymentDifferenceHandling == null ? null : paymentDifferenceHandling.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_payment.state
     *
     * @return the value of account_payment.state
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_payment.state
     *
     * @param state the value for account_payment.state
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_payment.move_name
     *
     * @return the value of account_payment.move_name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getMoveName() {
        return moveName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_payment.move_name
     *
     * @param moveName the value for account_payment.move_name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setMoveName(String moveName) {
        this.moveName = moveName == null ? null : moveName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_payment.name
     *
     * @return the value of account_payment.name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_payment.name
     *
     * @param name the value for account_payment.name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_payment.partner_type
     *
     * @return the value of account_payment.partner_type
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getPartnerType() {
        return partnerType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_payment.partner_type
     *
     * @param partnerType the value for account_payment.partner_type
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setPartnerType(String partnerType) {
        this.partnerType = partnerType == null ? null : partnerType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_payment.payment_type
     *
     * @return the value of account_payment.payment_type
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_payment.payment_type
     *
     * @param paymentType the value for account_payment.payment_type
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType == null ? null : paymentType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_payment.payment_reference
     *
     * @return the value of account_payment.payment_reference
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getPaymentReference() {
        return paymentReference;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_payment.payment_reference
     *
     * @param paymentReference the value for account_payment.payment_reference
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setPaymentReference(String paymentReference) {
        this.paymentReference = paymentReference == null ? null : paymentReference.trim();
    }
}