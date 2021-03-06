package com.altas.erp.eds.entity;

public class PaymentAcquirerEntityWithBLOBs extends PaymentAcquirerEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment_acquirer.cancel_msg
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String cancelMsg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment_acquirer.save_token
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String saveToken;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment_acquirer.environment
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String environment;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment_acquirer.provider
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String provider;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment_acquirer.auto_confirm
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String autoConfirm;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment_acquirer.description
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment_acquirer.pending_msg
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String pendingMsg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment_acquirer.post_msg
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String postMsg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment_acquirer.done_msg
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String doneMsg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment_acquirer.pre_msg
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String preMsg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment_acquirer.error_msg
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String errorMsg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment_acquirer.name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payment_acquirer.cancel_msg
     *
     * @return the value of payment_acquirer.cancel_msg
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getCancelMsg() {
        return cancelMsg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payment_acquirer.cancel_msg
     *
     * @param cancelMsg the value for payment_acquirer.cancel_msg
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setCancelMsg(String cancelMsg) {
        this.cancelMsg = cancelMsg == null ? null : cancelMsg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payment_acquirer.save_token
     *
     * @return the value of payment_acquirer.save_token
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getSaveToken() {
        return saveToken;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payment_acquirer.save_token
     *
     * @param saveToken the value for payment_acquirer.save_token
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setSaveToken(String saveToken) {
        this.saveToken = saveToken == null ? null : saveToken.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payment_acquirer.environment
     *
     * @return the value of payment_acquirer.environment
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getEnvironment() {
        return environment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payment_acquirer.environment
     *
     * @param environment the value for payment_acquirer.environment
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setEnvironment(String environment) {
        this.environment = environment == null ? null : environment.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payment_acquirer.provider
     *
     * @return the value of payment_acquirer.provider
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getProvider() {
        return provider;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payment_acquirer.provider
     *
     * @param provider the value for payment_acquirer.provider
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setProvider(String provider) {
        this.provider = provider == null ? null : provider.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payment_acquirer.auto_confirm
     *
     * @return the value of payment_acquirer.auto_confirm
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getAutoConfirm() {
        return autoConfirm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payment_acquirer.auto_confirm
     *
     * @param autoConfirm the value for payment_acquirer.auto_confirm
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setAutoConfirm(String autoConfirm) {
        this.autoConfirm = autoConfirm == null ? null : autoConfirm.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payment_acquirer.description
     *
     * @return the value of payment_acquirer.description
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payment_acquirer.description
     *
     * @param description the value for payment_acquirer.description
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payment_acquirer.pending_msg
     *
     * @return the value of payment_acquirer.pending_msg
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getPendingMsg() {
        return pendingMsg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payment_acquirer.pending_msg
     *
     * @param pendingMsg the value for payment_acquirer.pending_msg
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setPendingMsg(String pendingMsg) {
        this.pendingMsg = pendingMsg == null ? null : pendingMsg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payment_acquirer.post_msg
     *
     * @return the value of payment_acquirer.post_msg
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getPostMsg() {
        return postMsg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payment_acquirer.post_msg
     *
     * @param postMsg the value for payment_acquirer.post_msg
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setPostMsg(String postMsg) {
        this.postMsg = postMsg == null ? null : postMsg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payment_acquirer.done_msg
     *
     * @return the value of payment_acquirer.done_msg
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getDoneMsg() {
        return doneMsg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payment_acquirer.done_msg
     *
     * @param doneMsg the value for payment_acquirer.done_msg
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setDoneMsg(String doneMsg) {
        this.doneMsg = doneMsg == null ? null : doneMsg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payment_acquirer.pre_msg
     *
     * @return the value of payment_acquirer.pre_msg
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getPreMsg() {
        return preMsg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payment_acquirer.pre_msg
     *
     * @param preMsg the value for payment_acquirer.pre_msg
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setPreMsg(String preMsg) {
        this.preMsg = preMsg == null ? null : preMsg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payment_acquirer.error_msg
     *
     * @return the value of payment_acquirer.error_msg
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payment_acquirer.error_msg
     *
     * @param errorMsg the value for payment_acquirer.error_msg
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg == null ? null : errorMsg.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payment_acquirer.name
     *
     * @return the value of payment_acquirer.name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payment_acquirer.name
     *
     * @param name the value for payment_acquirer.name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}