package com.altas.erp.eds.dao;

import com.altas.erp.eds.entity.MailMessageResPartnerNeedactionRelEntity;

public interface MailMessageResPartnerNeedactionRelEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mail_message_res_partner_needaction_rel
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mail_message_res_partner_needaction_rel
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insert(MailMessageResPartnerNeedactionRelEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mail_message_res_partner_needaction_rel
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insertSelective(MailMessageResPartnerNeedactionRelEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mail_message_res_partner_needaction_rel
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    MailMessageResPartnerNeedactionRelEntity selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mail_message_res_partner_needaction_rel
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeySelective(MailMessageResPartnerNeedactionRelEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mail_message_res_partner_needaction_rel
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(MailMessageResPartnerNeedactionRelEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mail_message_res_partner_needaction_rel
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKey(MailMessageResPartnerNeedactionRelEntity record);
}