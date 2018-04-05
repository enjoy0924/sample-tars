package com.altas.erp.eds.dao;

import com.altas.erp.eds.entity.BaseImportImportEntity;
import com.altas.erp.eds.entity.BaseImportImportEntityWithBLOBs;

public interface BaseImportImportEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_import_import
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_import_import
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insert(BaseImportImportEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_import_import
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insertSelective(BaseImportImportEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_import_import
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    BaseImportImportEntityWithBLOBs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_import_import
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeySelective(BaseImportImportEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_import_import
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(BaseImportImportEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_import_import
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKey(BaseImportImportEntity record);
}