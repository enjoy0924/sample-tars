package com.altas.erp.eds.dao;

import com.altas.erp.eds.entity.ResLangEntity;
import com.altas.erp.eds.entity.ResLangEntityWithBLOBs;

public interface ResLangEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table res_lang
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table res_lang
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insert(ResLangEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table res_lang
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insertSelective(ResLangEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table res_lang
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    ResLangEntityWithBLOBs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table res_lang
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeySelective(ResLangEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table res_lang
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(ResLangEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table res_lang
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKey(ResLangEntity record);
}