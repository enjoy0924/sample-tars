package com.altas.erp.eds.dao;

import com.altas.erp.eds.entity.BaseUpdateTranslationsEntity;

public interface BaseUpdateTranslationsEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_update_translations
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_update_translations
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insert(BaseUpdateTranslationsEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_update_translations
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insertSelective(BaseUpdateTranslationsEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_update_translations
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    BaseUpdateTranslationsEntity selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_update_translations
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeySelective(BaseUpdateTranslationsEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_update_translations
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(BaseUpdateTranslationsEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_update_translations
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKey(BaseUpdateTranslationsEntity record);
}