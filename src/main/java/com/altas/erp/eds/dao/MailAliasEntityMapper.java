package com.altas.erp.eds.dao;

import com.altas.erp.eds.entity.MailAliasEntity;
import com.altas.erp.eds.entity.MailAliasEntityWithBLOBs;

public interface MailAliasEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mail_alias
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mail_alias
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insert(MailAliasEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mail_alias
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insertSelective(MailAliasEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mail_alias
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    MailAliasEntityWithBLOBs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mail_alias
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeySelective(MailAliasEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mail_alias
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(MailAliasEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mail_alias
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKey(MailAliasEntity record);
}