package com.altas.erp.eds.dao;

import com.altas.erp.eds.entity.MrpWorkorderEntity;
import com.altas.erp.eds.entity.MrpWorkorderEntityWithBLOBs;

public interface MrpWorkorderEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mrp_workorder
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mrp_workorder
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insert(MrpWorkorderEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mrp_workorder
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insertSelective(MrpWorkorderEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mrp_workorder
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    MrpWorkorderEntityWithBLOBs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mrp_workorder
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeySelective(MrpWorkorderEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mrp_workorder
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(MrpWorkorderEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mrp_workorder
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKey(MrpWorkorderEntity record);
}