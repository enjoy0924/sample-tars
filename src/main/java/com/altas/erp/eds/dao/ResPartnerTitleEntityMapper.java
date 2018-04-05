package com.altas.erp.eds.dao;

import com.altas.erp.eds.entity.ResPartnerTitleEntity;
import com.altas.erp.eds.entity.ResPartnerTitleEntityWithBLOBs;

public interface ResPartnerTitleEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table res_partner_title
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table res_partner_title
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insert(ResPartnerTitleEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table res_partner_title
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insertSelective(ResPartnerTitleEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table res_partner_title
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    ResPartnerTitleEntityWithBLOBs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table res_partner_title
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeySelective(ResPartnerTitleEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table res_partner_title
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(ResPartnerTitleEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table res_partner_title
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKey(ResPartnerTitleEntity record);
}