package com.altas.erp.eds.dao;

import com.altas.erp.eds.entity.ProductUomEntity;
import com.altas.erp.eds.entity.ProductUomEntityWithBLOBs;

public interface ProductUomEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_uom
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_uom
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insert(ProductUomEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_uom
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insertSelective(ProductUomEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_uom
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    ProductUomEntityWithBLOBs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_uom
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeySelective(ProductUomEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_uom
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(ProductUomEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_uom
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKey(ProductUomEntity record);
}