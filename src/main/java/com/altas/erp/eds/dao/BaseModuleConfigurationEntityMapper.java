package com.altas.erp.eds.dao;

import com.altas.erp.eds.entity.BaseModuleConfigurationEntity;

public interface BaseModuleConfigurationEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_module_configuration
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_module_configuration
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insert(BaseModuleConfigurationEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_module_configuration
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insertSelective(BaseModuleConfigurationEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_module_configuration
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    BaseModuleConfigurationEntity selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_module_configuration
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeySelective(BaseModuleConfigurationEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_module_configuration
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKey(BaseModuleConfigurationEntity record);
}