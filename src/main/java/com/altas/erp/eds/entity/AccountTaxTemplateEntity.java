package com.altas.erp.eds.entity;

import java.util.Date;

public class AccountTaxTemplateEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_tax_template.id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_tax_template.create_date
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_tax_template.sequence
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer sequence;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_tax_template.write_uid
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer writeUid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_tax_template.include_base_amount
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Boolean includeBaseAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_tax_template.create_uid
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer createUid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_tax_template.company_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer companyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_tax_template.analytic
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Boolean analytic;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_tax_template.account_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer accountId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_tax_template.tax_adjustment
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Boolean taxAdjustment;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_tax_template.refund_account_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer refundAccountId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_tax_template.write_date
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Date writeDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_tax_template.active
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Boolean active;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_tax_template.tax_group_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer taxGroupId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_tax_template.chart_template_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer chartTemplateId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_tax_template.amount
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Double amount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column account_tax_template.price_include
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Boolean priceInclude;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_tax_template.id
     *
     * @return the value of account_tax_template.id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_tax_template.id
     *
     * @param id the value for account_tax_template.id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_tax_template.create_date
     *
     * @return the value of account_tax_template.create_date
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_tax_template.create_date
     *
     * @param createDate the value for account_tax_template.create_date
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_tax_template.sequence
     *
     * @return the value of account_tax_template.sequence
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getSequence() {
        return sequence;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_tax_template.sequence
     *
     * @param sequence the value for account_tax_template.sequence
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_tax_template.write_uid
     *
     * @return the value of account_tax_template.write_uid
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getWriteUid() {
        return writeUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_tax_template.write_uid
     *
     * @param writeUid the value for account_tax_template.write_uid
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setWriteUid(Integer writeUid) {
        this.writeUid = writeUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_tax_template.include_base_amount
     *
     * @return the value of account_tax_template.include_base_amount
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Boolean getIncludeBaseAmount() {
        return includeBaseAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_tax_template.include_base_amount
     *
     * @param includeBaseAmount the value for account_tax_template.include_base_amount
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setIncludeBaseAmount(Boolean includeBaseAmount) {
        this.includeBaseAmount = includeBaseAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_tax_template.create_uid
     *
     * @return the value of account_tax_template.create_uid
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getCreateUid() {
        return createUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_tax_template.create_uid
     *
     * @param createUid the value for account_tax_template.create_uid
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setCreateUid(Integer createUid) {
        this.createUid = createUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_tax_template.company_id
     *
     * @return the value of account_tax_template.company_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getCompanyId() {
        return companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_tax_template.company_id
     *
     * @param companyId the value for account_tax_template.company_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_tax_template.analytic
     *
     * @return the value of account_tax_template.analytic
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Boolean getAnalytic() {
        return analytic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_tax_template.analytic
     *
     * @param analytic the value for account_tax_template.analytic
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setAnalytic(Boolean analytic) {
        this.analytic = analytic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_tax_template.account_id
     *
     * @return the value of account_tax_template.account_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getAccountId() {
        return accountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_tax_template.account_id
     *
     * @param accountId the value for account_tax_template.account_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_tax_template.tax_adjustment
     *
     * @return the value of account_tax_template.tax_adjustment
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Boolean getTaxAdjustment() {
        return taxAdjustment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_tax_template.tax_adjustment
     *
     * @param taxAdjustment the value for account_tax_template.tax_adjustment
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setTaxAdjustment(Boolean taxAdjustment) {
        this.taxAdjustment = taxAdjustment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_tax_template.refund_account_id
     *
     * @return the value of account_tax_template.refund_account_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getRefundAccountId() {
        return refundAccountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_tax_template.refund_account_id
     *
     * @param refundAccountId the value for account_tax_template.refund_account_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setRefundAccountId(Integer refundAccountId) {
        this.refundAccountId = refundAccountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_tax_template.write_date
     *
     * @return the value of account_tax_template.write_date
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Date getWriteDate() {
        return writeDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_tax_template.write_date
     *
     * @param writeDate the value for account_tax_template.write_date
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_tax_template.active
     *
     * @return the value of account_tax_template.active
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Boolean getActive() {
        return active;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_tax_template.active
     *
     * @param active the value for account_tax_template.active
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_tax_template.tax_group_id
     *
     * @return the value of account_tax_template.tax_group_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getTaxGroupId() {
        return taxGroupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_tax_template.tax_group_id
     *
     * @param taxGroupId the value for account_tax_template.tax_group_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setTaxGroupId(Integer taxGroupId) {
        this.taxGroupId = taxGroupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_tax_template.chart_template_id
     *
     * @return the value of account_tax_template.chart_template_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getChartTemplateId() {
        return chartTemplateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_tax_template.chart_template_id
     *
     * @param chartTemplateId the value for account_tax_template.chart_template_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setChartTemplateId(Integer chartTemplateId) {
        this.chartTemplateId = chartTemplateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_tax_template.amount
     *
     * @return the value of account_tax_template.amount
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_tax_template.amount
     *
     * @param amount the value for account_tax_template.amount
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column account_tax_template.price_include
     *
     * @return the value of account_tax_template.price_include
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Boolean getPriceInclude() {
        return priceInclude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column account_tax_template.price_include
     *
     * @param priceInclude the value for account_tax_template.price_include
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setPriceInclude(Boolean priceInclude) {
        this.priceInclude = priceInclude;
    }
}