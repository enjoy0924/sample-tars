package com.altas.erp.eds.dao;

import com.altas.erp.eds.entity.IrConfigParameterEntity;
import com.altas.erp.eds.entity.IrConfigParameterEntityWithBLOBs;

public interface IrConfigParameterEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ir_config_parameter
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ir_config_parameter
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insert(IrConfigParameterEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ir_config_parameter
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insertSelective(IrConfigParameterEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ir_config_parameter
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    IrConfigParameterEntityWithBLOBs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ir_config_parameter
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeySelective(IrConfigParameterEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ir_config_parameter
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(IrConfigParameterEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ir_config_parameter
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKey(IrConfigParameterEntity record);
}