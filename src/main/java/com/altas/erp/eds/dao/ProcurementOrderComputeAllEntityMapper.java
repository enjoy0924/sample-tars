package com.altas.erp.eds.dao;

import com.altas.erp.eds.entity.ProcurementOrderComputeAllEntity;

public interface ProcurementOrderComputeAllEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table procurement_order_compute_all
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table procurement_order_compute_all
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insert(ProcurementOrderComputeAllEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table procurement_order_compute_all
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insertSelective(ProcurementOrderComputeAllEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table procurement_order_compute_all
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    ProcurementOrderComputeAllEntity selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table procurement_order_compute_all
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeySelective(ProcurementOrderComputeAllEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table procurement_order_compute_all
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKey(ProcurementOrderComputeAllEntity record);
}