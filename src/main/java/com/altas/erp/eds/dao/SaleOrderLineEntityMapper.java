package com.altas.erp.eds.dao;

import com.altas.erp.eds.entity.SaleOrderLineEntity;
import com.altas.erp.eds.entity.SaleOrderLineEntityWithBLOBs;

public interface SaleOrderLineEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sale_order_line
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sale_order_line
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insert(SaleOrderLineEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sale_order_line
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insertSelective(SaleOrderLineEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sale_order_line
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    SaleOrderLineEntityWithBLOBs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sale_order_line
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeySelective(SaleOrderLineEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sale_order_line
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(SaleOrderLineEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sale_order_line
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKey(SaleOrderLineEntity record);
}