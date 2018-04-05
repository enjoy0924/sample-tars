package com.altas.erp.eds.dao;

import com.altas.erp.eds.entity.MailTrackingValueEntity;
import com.altas.erp.eds.entity.MailTrackingValueEntityWithBLOBs;

public interface MailTrackingValueEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mail_tracking_value
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mail_tracking_value
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insert(MailTrackingValueEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mail_tracking_value
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insertSelective(MailTrackingValueEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mail_tracking_value
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    MailTrackingValueEntityWithBLOBs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mail_tracking_value
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeySelective(MailTrackingValueEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mail_tracking_value
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(MailTrackingValueEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mail_tracking_value
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKey(MailTrackingValueEntity record);
}