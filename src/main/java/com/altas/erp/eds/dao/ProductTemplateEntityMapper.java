package com.altas.erp.eds.dao;

import com.altas.erp.eds.entity.ProductTemplateEntity;
import com.altas.erp.eds.entity.ProductTemplateEntityWithBLOBs;

public interface ProductTemplateEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_template
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_template
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insert(ProductTemplateEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_template
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insertSelective(ProductTemplateEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_template
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    ProductTemplateEntityWithBLOBs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_template
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeySelective(ProductTemplateEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_template
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(ProductTemplateEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table product_template
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKey(ProductTemplateEntity record);
}