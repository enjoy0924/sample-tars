package com.altas.erp.eds.dao;

import com.altas.erp.eds.entity.ResCompanyEntity;
import com.altas.erp.eds.entity.ResCompanyEntityWithBLOBs;

public interface ResCompanyEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table res_company
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table res_company
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insert(ResCompanyEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table res_company
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insertSelective(ResCompanyEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table res_company
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    ResCompanyEntityWithBLOBs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table res_company
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeySelective(ResCompanyEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table res_company
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(ResCompanyEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table res_company
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKey(ResCompanyEntity record);
}