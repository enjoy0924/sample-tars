package com.altas.erp.eds.dao;

import com.altas.erp.eds.entity.BaseImportTestsModelsCharEntity;

public interface BaseImportTestsModelsCharEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_import_tests_models_char
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_import_tests_models_char
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insert(BaseImportTestsModelsCharEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_import_tests_models_char
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insertSelective(BaseImportTestsModelsCharEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_import_tests_models_char
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    BaseImportTestsModelsCharEntity selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_import_tests_models_char
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeySelective(BaseImportTestsModelsCharEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_import_tests_models_char
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(BaseImportTestsModelsCharEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_import_tests_models_char
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKey(BaseImportTestsModelsCharEntity record);
}