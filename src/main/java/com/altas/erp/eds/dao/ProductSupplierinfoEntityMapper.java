package com.altas.erp.eds.dao;

import com.altas.erp.eds.entity.ProductSupplierinfoEntity;
import com.altas.erp.eds.entity.ProductSupplierinfoEntityWithBLOBs;

public interface ProductSupplierinfoEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_supplierinfo
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_supplierinfo
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insert(ProductSupplierinfoEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_supplierinfo
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insertSelective(ProductSupplierinfoEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_supplierinfo
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    ProductSupplierinfoEntityWithBLOBs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_supplierinfo
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeySelective(ProductSupplierinfoEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_supplierinfo
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(ProductSupplierinfoEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_supplierinfo
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKey(ProductSupplierinfoEntity record);
}