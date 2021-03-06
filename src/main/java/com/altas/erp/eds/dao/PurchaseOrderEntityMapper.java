package com.altas.erp.eds.dao;

import com.altas.erp.eds.entity.PurchaseOrderEntity;
import com.altas.erp.eds.entity.PurchaseOrderEntityWithBLOBs;

public interface PurchaseOrderEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_order
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_order
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insert(PurchaseOrderEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_order
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insertSelective(PurchaseOrderEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_order
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    PurchaseOrderEntityWithBLOBs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_order
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeySelective(PurchaseOrderEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_order
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(PurchaseOrderEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table purchase_order
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKey(PurchaseOrderEntity record);
}