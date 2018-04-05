package com.altas.erp.eds.dao;

import com.altas.erp.eds.entity.BarcodeRuleEntity;
import com.altas.erp.eds.entity.BarcodeRuleEntityWithBLOBs;

public interface BarcodeRuleEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table barcode_rule
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table barcode_rule
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insert(BarcodeRuleEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table barcode_rule
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insertSelective(BarcodeRuleEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table barcode_rule
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    BarcodeRuleEntityWithBLOBs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table barcode_rule
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeySelective(BarcodeRuleEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table barcode_rule
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(BarcodeRuleEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table barcode_rule
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKey(BarcodeRuleEntity record);
}