package com.altas.erp.eds.entity;

import java.util.Date;

public class ResCountryGroupEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column res_country_group.id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column res_country_group.create_uid
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer createUid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column res_country_group.write_uid
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer writeUid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column res_country_group.write_date
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Date writeDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column res_country_group.create_date
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column res_country_group.name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column res_country_group.id
     *
     * @return the value of res_country_group.id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column res_country_group.id
     *
     * @param id the value for res_country_group.id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column res_country_group.create_uid
     *
     * @return the value of res_country_group.create_uid
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getCreateUid() {
        return createUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column res_country_group.create_uid
     *
     * @param createUid the value for res_country_group.create_uid
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setCreateUid(Integer createUid) {
        this.createUid = createUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column res_country_group.write_uid
     *
     * @return the value of res_country_group.write_uid
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getWriteUid() {
        return writeUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column res_country_group.write_uid
     *
     * @param writeUid the value for res_country_group.write_uid
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setWriteUid(Integer writeUid) {
        this.writeUid = writeUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column res_country_group.write_date
     *
     * @return the value of res_country_group.write_date
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Date getWriteDate() {
        return writeDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column res_country_group.write_date
     *
     * @param writeDate the value for res_country_group.write_date
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column res_country_group.create_date
     *
     * @return the value of res_country_group.create_date
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column res_country_group.create_date
     *
     * @param createDate the value for res_country_group.create_date
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column res_country_group.name
     *
     * @return the value of res_country_group.name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column res_country_group.name
     *
     * @param name the value for res_country_group.name
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}