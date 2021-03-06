package com.altas.erp.eds.dao;

import com.altas.erp.eds.entity.MailMessageSubtypeEntity;
import com.altas.erp.eds.entity.MailMessageSubtypeEntityWithBLOBs;

public interface MailMessageSubtypeEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mail_message_subtype
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mail_message_subtype
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insert(MailMessageSubtypeEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mail_message_subtype
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insertSelective(MailMessageSubtypeEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mail_message_subtype
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    MailMessageSubtypeEntityWithBLOBs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mail_message_subtype
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeySelective(MailMessageSubtypeEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mail_message_subtype
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(MailMessageSubtypeEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mail_message_subtype
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKey(MailMessageSubtypeEntity record);
}