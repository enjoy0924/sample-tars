package com.altas.erp.eds.dao;

import com.altas.erp.eds.entity.DecimalPrecisionEntity;

public interface DecimalPrecisionEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decimal_precision
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decimal_precision
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insert(DecimalPrecisionEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decimal_precision
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insertSelective(DecimalPrecisionEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decimal_precision
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    DecimalPrecisionEntity selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decimal_precision
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeySelective(DecimalPrecisionEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decimal_precision
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(DecimalPrecisionEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table decimal_precision
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKey(DecimalPrecisionEntity record);
}