package com.altas.erp.eds.dao;

import com.altas.erp.eds.entity.FetchmailServerEntity;
import com.altas.erp.eds.entity.FetchmailServerEntityWithBLOBs;

public interface FetchmailServerEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fetchmail_server
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fetchmail_server
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insert(FetchmailServerEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fetchmail_server
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insertSelective(FetchmailServerEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fetchmail_server
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    FetchmailServerEntityWithBLOBs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fetchmail_server
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeySelective(FetchmailServerEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fetchmail_server
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(FetchmailServerEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fetchmail_server
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKey(FetchmailServerEntity record);
}