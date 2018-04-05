package com.altas.erp.eds.dao;

import com.altas.erp.eds.entity.IrActWindowEntity;
import com.altas.erp.eds.entity.IrActWindowEntityWithBLOBs;

public interface IrActWindowEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ir_act_window
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ir_act_window
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insert(IrActWindowEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ir_act_window
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insertSelective(IrActWindowEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ir_act_window
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    IrActWindowEntityWithBLOBs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ir_act_window
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeySelective(IrActWindowEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ir_act_window
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(IrActWindowEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ir_act_window
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKey(IrActWindowEntity record);
}