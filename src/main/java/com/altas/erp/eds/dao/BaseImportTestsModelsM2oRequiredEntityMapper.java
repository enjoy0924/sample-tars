package com.altas.erp.eds.dao;

import com.altas.erp.eds.entity.BaseImportTestsModelsM2oRequiredEntity;

public interface BaseImportTestsModelsM2oRequiredEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_import_tests_models_m2o_required
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_import_tests_models_m2o_required
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insert(BaseImportTestsModelsM2oRequiredEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_import_tests_models_m2o_required
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insertSelective(BaseImportTestsModelsM2oRequiredEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_import_tests_models_m2o_required
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    BaseImportTestsModelsM2oRequiredEntity selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_import_tests_models_m2o_required
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeySelective(BaseImportTestsModelsM2oRequiredEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_import_tests_models_m2o_required
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKey(BaseImportTestsModelsM2oRequiredEntity record);
}