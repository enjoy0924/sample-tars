package com.altas.erp.eds.entity;

import java.util.Date;

public class StockPickingEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_picking.id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_picking.date_done
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Date dateDone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_picking.write_uid
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer writeUid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_picking.recompute_pack_op
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Boolean recomputePackOp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_picking.launch_pack_operations
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Boolean launchPackOperations;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_picking.location_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer locationId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_picking.picking_type_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer pickingTypeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_picking.partner_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer partnerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_picking.message_last_post
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Date messageLastPost;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_picking.company_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer companyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_picking.owner_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer ownerId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_picking.backorder_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer backorderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_picking.create_uid
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer createUid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_picking.min_date
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Date minDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_picking.printed
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Boolean printed;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_picking.write_date
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Date writeDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_picking.date
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Date date;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_picking.group_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer groupId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_picking.create_date
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Date createDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_picking.location_dest_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Integer locationDestId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_picking.max_date
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    private Date maxDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_picking.id
     *
     * @return the value of stock_picking.id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_picking.id
     *
     * @param id the value for stock_picking.id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_picking.date_done
     *
     * @return the value of stock_picking.date_done
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Date getDateDone() {
        return dateDone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_picking.date_done
     *
     * @param dateDone the value for stock_picking.date_done
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setDateDone(Date dateDone) {
        this.dateDone = dateDone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_picking.write_uid
     *
     * @return the value of stock_picking.write_uid
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getWriteUid() {
        return writeUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_picking.write_uid
     *
     * @param writeUid the value for stock_picking.write_uid
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setWriteUid(Integer writeUid) {
        this.writeUid = writeUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_picking.recompute_pack_op
     *
     * @return the value of stock_picking.recompute_pack_op
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Boolean getRecomputePackOp() {
        return recomputePackOp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_picking.recompute_pack_op
     *
     * @param recomputePackOp the value for stock_picking.recompute_pack_op
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setRecomputePackOp(Boolean recomputePackOp) {
        this.recomputePackOp = recomputePackOp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_picking.launch_pack_operations
     *
     * @return the value of stock_picking.launch_pack_operations
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Boolean getLaunchPackOperations() {
        return launchPackOperations;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_picking.launch_pack_operations
     *
     * @param launchPackOperations the value for stock_picking.launch_pack_operations
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setLaunchPackOperations(Boolean launchPackOperations) {
        this.launchPackOperations = launchPackOperations;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_picking.location_id
     *
     * @return the value of stock_picking.location_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getLocationId() {
        return locationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_picking.location_id
     *
     * @param locationId the value for stock_picking.location_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_picking.picking_type_id
     *
     * @return the value of stock_picking.picking_type_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getPickingTypeId() {
        return pickingTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_picking.picking_type_id
     *
     * @param pickingTypeId the value for stock_picking.picking_type_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setPickingTypeId(Integer pickingTypeId) {
        this.pickingTypeId = pickingTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_picking.partner_id
     *
     * @return the value of stock_picking.partner_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getPartnerId() {
        return partnerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_picking.partner_id
     *
     * @param partnerId the value for stock_picking.partner_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setPartnerId(Integer partnerId) {
        this.partnerId = partnerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_picking.message_last_post
     *
     * @return the value of stock_picking.message_last_post
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Date getMessageLastPost() {
        return messageLastPost;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_picking.message_last_post
     *
     * @param messageLastPost the value for stock_picking.message_last_post
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setMessageLastPost(Date messageLastPost) {
        this.messageLastPost = messageLastPost;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_picking.company_id
     *
     * @return the value of stock_picking.company_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getCompanyId() {
        return companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_picking.company_id
     *
     * @param companyId the value for stock_picking.company_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_picking.owner_id
     *
     * @return the value of stock_picking.owner_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getOwnerId() {
        return ownerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_picking.owner_id
     *
     * @param ownerId the value for stock_picking.owner_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_picking.backorder_id
     *
     * @return the value of stock_picking.backorder_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getBackorderId() {
        return backorderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_picking.backorder_id
     *
     * @param backorderId the value for stock_picking.backorder_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setBackorderId(Integer backorderId) {
        this.backorderId = backorderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_picking.create_uid
     *
     * @return the value of stock_picking.create_uid
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getCreateUid() {
        return createUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_picking.create_uid
     *
     * @param createUid the value for stock_picking.create_uid
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setCreateUid(Integer createUid) {
        this.createUid = createUid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_picking.min_date
     *
     * @return the value of stock_picking.min_date
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Date getMinDate() {
        return minDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_picking.min_date
     *
     * @param minDate the value for stock_picking.min_date
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setMinDate(Date minDate) {
        this.minDate = minDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_picking.printed
     *
     * @return the value of stock_picking.printed
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Boolean getPrinted() {
        return printed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_picking.printed
     *
     * @param printed the value for stock_picking.printed
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setPrinted(Boolean printed) {
        this.printed = printed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_picking.write_date
     *
     * @return the value of stock_picking.write_date
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Date getWriteDate() {
        return writeDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_picking.write_date
     *
     * @param writeDate the value for stock_picking.write_date
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_picking.date
     *
     * @return the value of stock_picking.date
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Date getDate() {
        return date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_picking.date
     *
     * @param date the value for stock_picking.date
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_picking.group_id
     *
     * @return the value of stock_picking.group_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getGroupId() {
        return groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_picking.group_id
     *
     * @param groupId the value for stock_picking.group_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_picking.create_date
     *
     * @return the value of stock_picking.create_date
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_picking.create_date
     *
     * @param createDate the value for stock_picking.create_date
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_picking.location_dest_id
     *
     * @return the value of stock_picking.location_dest_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Integer getLocationDestId() {
        return locationDestId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_picking.location_dest_id
     *
     * @param locationDestId the value for stock_picking.location_dest_id
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setLocationDestId(Integer locationDestId) {
        this.locationDestId = locationDestId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_picking.max_date
     *
     * @return the value of stock_picking.max_date
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public Date getMaxDate() {
        return maxDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_picking.max_date
     *
     * @param maxDate the value for stock_picking.max_date
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    public void setMaxDate(Date maxDate) {
        this.maxDate = maxDate;
    }
}