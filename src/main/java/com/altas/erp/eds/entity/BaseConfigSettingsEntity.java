package com.altas.erp.eds.entity;

import java.util.Date;

public class BaseConfigSettingsEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_config_settings.id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_config_settings.create_date
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_config_settings.write_uid
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer writeUid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_config_settings.module_google_calendar
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Boolean moduleGoogleCalendar;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_config_settings.module_auth_oauth
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Boolean moduleAuthOauth;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_config_settings.company_share_partner
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Boolean companySharePartner;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_config_settings.create_uid
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer createUid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_config_settings.company_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer companyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_config_settings.module_base_import
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Boolean moduleBaseImport;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_config_settings.module_portal
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Boolean modulePortal;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_config_settings.group_multi_currency
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Boolean groupMultiCurrency;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_config_settings.module_google_drive
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Boolean moduleGoogleDrive;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_config_settings.write_date
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Date writeDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_config_settings.module_inter_company_rules
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Boolean moduleInterCompanyRules;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_config_settings.group_multi_company
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Boolean groupMultiCompany;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_config_settings.module_share
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Boolean moduleShare;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_config_settings.fail_counter
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer failCounter;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_config_settings.auth_signup_uninvited
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Boolean authSignupUninvited;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_config_settings.auth_signup_template_user_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer authSignupTemplateUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_config_settings.auth_signup_reset_password
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Boolean authSignupResetPassword;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_config_settings.company_share_product
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Boolean companyShareProduct;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_config_settings.group_product_variant
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer groupProductVariant;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column base_config_settings.alias_domain
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String aliasDomain;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_config_settings.id
     *
     * @return the value of base_config_settings.id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_config_settings.id
     *
     * @param id the value for base_config_settings.id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_config_settings.create_date
     *
     * @return the value of base_config_settings.create_date
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_config_settings.create_date
     *
     * @param createDate the value for base_config_settings.create_date
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_config_settings.write_uid
     *
     * @return the value of base_config_settings.write_uid
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getWriteUid() {
        return writeUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_config_settings.write_uid
     *
     * @param writeUid the value for base_config_settings.write_uid
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setWriteUid(Integer writeUid) {
        this.writeUid = writeUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_config_settings.module_google_calendar
     *
     * @return the value of base_config_settings.module_google_calendar
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Boolean getModuleGoogleCalendar() {
        return moduleGoogleCalendar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_config_settings.module_google_calendar
     *
     * @param moduleGoogleCalendar the value for base_config_settings.module_google_calendar
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setModuleGoogleCalendar(Boolean moduleGoogleCalendar) {
        this.moduleGoogleCalendar = moduleGoogleCalendar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_config_settings.module_auth_oauth
     *
     * @return the value of base_config_settings.module_auth_oauth
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Boolean getModuleAuthOauth() {
        return moduleAuthOauth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_config_settings.module_auth_oauth
     *
     * @param moduleAuthOauth the value for base_config_settings.module_auth_oauth
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setModuleAuthOauth(Boolean moduleAuthOauth) {
        this.moduleAuthOauth = moduleAuthOauth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_config_settings.company_share_partner
     *
     * @return the value of base_config_settings.company_share_partner
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Boolean getCompanySharePartner() {
        return companySharePartner;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_config_settings.company_share_partner
     *
     * @param companySharePartner the value for base_config_settings.company_share_partner
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setCompanySharePartner(Boolean companySharePartner) {
        this.companySharePartner = companySharePartner;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_config_settings.create_uid
     *
     * @return the value of base_config_settings.create_uid
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getCreateUid() {
        return createUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_config_settings.create_uid
     *
     * @param createUid the value for base_config_settings.create_uid
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setCreateUid(Integer createUid) {
        this.createUid = createUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_config_settings.company_id
     *
     * @return the value of base_config_settings.company_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getCompanyId() {
        return companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_config_settings.company_id
     *
     * @param companyId the value for base_config_settings.company_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_config_settings.module_base_import
     *
     * @return the value of base_config_settings.module_base_import
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Boolean getModuleBaseImport() {
        return moduleBaseImport;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_config_settings.module_base_import
     *
     * @param moduleBaseImport the value for base_config_settings.module_base_import
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setModuleBaseImport(Boolean moduleBaseImport) {
        this.moduleBaseImport = moduleBaseImport;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_config_settings.module_portal
     *
     * @return the value of base_config_settings.module_portal
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Boolean getModulePortal() {
        return modulePortal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_config_settings.module_portal
     *
     * @param modulePortal the value for base_config_settings.module_portal
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setModulePortal(Boolean modulePortal) {
        this.modulePortal = modulePortal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_config_settings.group_multi_currency
     *
     * @return the value of base_config_settings.group_multi_currency
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Boolean getGroupMultiCurrency() {
        return groupMultiCurrency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_config_settings.group_multi_currency
     *
     * @param groupMultiCurrency the value for base_config_settings.group_multi_currency
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setGroupMultiCurrency(Boolean groupMultiCurrency) {
        this.groupMultiCurrency = groupMultiCurrency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_config_settings.module_google_drive
     *
     * @return the value of base_config_settings.module_google_drive
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Boolean getModuleGoogleDrive() {
        return moduleGoogleDrive;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_config_settings.module_google_drive
     *
     * @param moduleGoogleDrive the value for base_config_settings.module_google_drive
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setModuleGoogleDrive(Boolean moduleGoogleDrive) {
        this.moduleGoogleDrive = moduleGoogleDrive;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_config_settings.write_date
     *
     * @return the value of base_config_settings.write_date
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Date getWriteDate() {
        return writeDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_config_settings.write_date
     *
     * @param writeDate the value for base_config_settings.write_date
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_config_settings.module_inter_company_rules
     *
     * @return the value of base_config_settings.module_inter_company_rules
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Boolean getModuleInterCompanyRules() {
        return moduleInterCompanyRules;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_config_settings.module_inter_company_rules
     *
     * @param moduleInterCompanyRules the value for base_config_settings.module_inter_company_rules
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setModuleInterCompanyRules(Boolean moduleInterCompanyRules) {
        this.moduleInterCompanyRules = moduleInterCompanyRules;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_config_settings.group_multi_company
     *
     * @return the value of base_config_settings.group_multi_company
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Boolean getGroupMultiCompany() {
        return groupMultiCompany;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_config_settings.group_multi_company
     *
     * @param groupMultiCompany the value for base_config_settings.group_multi_company
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setGroupMultiCompany(Boolean groupMultiCompany) {
        this.groupMultiCompany = groupMultiCompany;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_config_settings.module_share
     *
     * @return the value of base_config_settings.module_share
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Boolean getModuleShare() {
        return moduleShare;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_config_settings.module_share
     *
     * @param moduleShare the value for base_config_settings.module_share
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setModuleShare(Boolean moduleShare) {
        this.moduleShare = moduleShare;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_config_settings.fail_counter
     *
     * @return the value of base_config_settings.fail_counter
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getFailCounter() {
        return failCounter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_config_settings.fail_counter
     *
     * @param failCounter the value for base_config_settings.fail_counter
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setFailCounter(Integer failCounter) {
        this.failCounter = failCounter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_config_settings.auth_signup_uninvited
     *
     * @return the value of base_config_settings.auth_signup_uninvited
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Boolean getAuthSignupUninvited() {
        return authSignupUninvited;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_config_settings.auth_signup_uninvited
     *
     * @param authSignupUninvited the value for base_config_settings.auth_signup_uninvited
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setAuthSignupUninvited(Boolean authSignupUninvited) {
        this.authSignupUninvited = authSignupUninvited;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_config_settings.auth_signup_template_user_id
     *
     * @return the value of base_config_settings.auth_signup_template_user_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getAuthSignupTemplateUserId() {
        return authSignupTemplateUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_config_settings.auth_signup_template_user_id
     *
     * @param authSignupTemplateUserId the value for base_config_settings.auth_signup_template_user_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setAuthSignupTemplateUserId(Integer authSignupTemplateUserId) {
        this.authSignupTemplateUserId = authSignupTemplateUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_config_settings.auth_signup_reset_password
     *
     * @return the value of base_config_settings.auth_signup_reset_password
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Boolean getAuthSignupResetPassword() {
        return authSignupResetPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_config_settings.auth_signup_reset_password
     *
     * @param authSignupResetPassword the value for base_config_settings.auth_signup_reset_password
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setAuthSignupResetPassword(Boolean authSignupResetPassword) {
        this.authSignupResetPassword = authSignupResetPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_config_settings.company_share_product
     *
     * @return the value of base_config_settings.company_share_product
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Boolean getCompanyShareProduct() {
        return companyShareProduct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_config_settings.company_share_product
     *
     * @param companyShareProduct the value for base_config_settings.company_share_product
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setCompanyShareProduct(Boolean companyShareProduct) {
        this.companyShareProduct = companyShareProduct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_config_settings.group_product_variant
     *
     * @return the value of base_config_settings.group_product_variant
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getGroupProductVariant() {
        return groupProductVariant;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_config_settings.group_product_variant
     *
     * @param groupProductVariant the value for base_config_settings.group_product_variant
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setGroupProductVariant(Integer groupProductVariant) {
        this.groupProductVariant = groupProductVariant;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column base_config_settings.alias_domain
     *
     * @return the value of base_config_settings.alias_domain
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getAliasDomain() {
        return aliasDomain;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column base_config_settings.alias_domain
     *
     * @param aliasDomain the value for base_config_settings.alias_domain
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setAliasDomain(String aliasDomain) {
        this.aliasDomain = aliasDomain == null ? null : aliasDomain.trim();
    }
}