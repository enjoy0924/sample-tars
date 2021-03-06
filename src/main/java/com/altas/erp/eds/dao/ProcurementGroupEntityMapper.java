package com.altas.erp.eds.dao;

import com.altas.erp.eds.entity.ProcurementGroupEntity;
import com.altas.erp.eds.entity.ProcurementGroupEntityWithBLOBs;

public interface ProcurementGroupEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table procurement_group
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table procurement_group
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insert(ProcurementGroupEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table procurement_group
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insertSelective(ProcurementGroupEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table procurement_group
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    ProcurementGroupEntityWithBLOBs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table procurement_group
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeySelective(ProcurementGroupEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table procurement_group
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(ProcurementGroupEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table procurement_group
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKey(ProcurementGroupEntity record);
}