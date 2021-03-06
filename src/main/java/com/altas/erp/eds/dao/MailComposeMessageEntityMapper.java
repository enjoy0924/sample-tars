package com.altas.erp.eds.dao;

import com.altas.erp.eds.entity.MailComposeMessageEntity;
import com.altas.erp.eds.entity.MailComposeMessageEntityWithBLOBs;

public interface MailComposeMessageEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mail_compose_message
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mail_compose_message
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insert(MailComposeMessageEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mail_compose_message
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insertSelective(MailComposeMessageEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mail_compose_message
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    MailComposeMessageEntityWithBLOBs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mail_compose_message
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeySelective(MailComposeMessageEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mail_compose_message
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(MailComposeMessageEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mail_compose_message
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKey(MailComposeMessageEntity record);
}