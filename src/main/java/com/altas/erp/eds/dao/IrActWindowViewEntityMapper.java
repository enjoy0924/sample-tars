package com.altas.erp.eds.dao;

import com.altas.erp.eds.entity.IrActWindowViewEntity;

public interface IrActWindowViewEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ir_act_window_view
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ir_act_window_view
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insert(IrActWindowViewEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ir_act_window_view
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insertSelective(IrActWindowViewEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ir_act_window_view
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    IrActWindowViewEntity selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ir_act_window_view
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeySelective(IrActWindowViewEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ir_act_window_view
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(IrActWindowViewEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ir_act_window_view
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKey(IrActWindowViewEntity record);
}