package com.altas.erp.eds.dao;

import com.altas.erp.eds.entity.BaseImportTestsModelsPreviewEntity;

public interface BaseImportTestsModelsPreviewEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_import_tests_models_preview
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_import_tests_models_preview
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insert(BaseImportTestsModelsPreviewEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_import_tests_models_preview
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insertSelective(BaseImportTestsModelsPreviewEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_import_tests_models_preview
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    BaseImportTestsModelsPreviewEntity selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_import_tests_models_preview
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeySelective(BaseImportTestsModelsPreviewEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_import_tests_models_preview
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(BaseImportTestsModelsPreviewEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_import_tests_models_preview
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKey(BaseImportTestsModelsPreviewEntity record);
}