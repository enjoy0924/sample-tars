package com.altas.erp.eds.dao;

import com.altas.erp.eds.entity.ProductProductEntity;
import com.altas.erp.eds.entity.ProductProductEntityWithBLOBs;

public interface ProductProductEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_product
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_product
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insert(ProductProductEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_product
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insertSelective(ProductProductEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_product
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    ProductProductEntityWithBLOBs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_product
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeySelective(ProductProductEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_product
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(ProductProductEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_product
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKey(ProductProductEntity record);
}