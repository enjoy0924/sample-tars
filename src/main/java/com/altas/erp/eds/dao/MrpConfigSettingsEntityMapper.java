package com.altas.erp.eds.dao;

import com.altas.erp.eds.entity.MrpConfigSettingsEntity;

public interface MrpConfigSettingsEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mrp_config_settings
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mrp_config_settings
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insert(MrpConfigSettingsEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mrp_config_settings
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insertSelective(MrpConfigSettingsEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mrp_config_settings
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    MrpConfigSettingsEntity selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mrp_config_settings
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeySelective(MrpConfigSettingsEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mrp_config_settings
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKey(MrpConfigSettingsEntity record);
}