package com.altas.erp.eds.dao;

import com.altas.erp.eds.entity.ProductUomCategEntity;

public interface ProductUomCategEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_uom_categ
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_uom_categ
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insert(ProductUomCategEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_uom_categ
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insertSelective(ProductUomCategEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_uom_categ
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    ProductUomCategEntity selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_uom_categ
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeySelective(ProductUomCategEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_uom_categ
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(ProductUomCategEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_uom_categ
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKey(ProductUomCategEntity record);
}