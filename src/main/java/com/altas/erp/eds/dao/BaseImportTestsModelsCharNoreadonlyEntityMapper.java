package com.altas.erp.eds.dao;

import com.altas.erp.eds.entity.BaseImportTestsModelsCharNoreadonlyEntity;

public interface BaseImportTestsModelsCharNoreadonlyEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_import_tests_models_char_noreadonly
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_import_tests_models_char_noreadonly
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insert(BaseImportTestsModelsCharNoreadonlyEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_import_tests_models_char_noreadonly
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insertSelective(BaseImportTestsModelsCharNoreadonlyEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_import_tests_models_char_noreadonly
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    BaseImportTestsModelsCharNoreadonlyEntity selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_import_tests_models_char_noreadonly
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeySelective(BaseImportTestsModelsCharNoreadonlyEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_import_tests_models_char_noreadonly
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(BaseImportTestsModelsCharNoreadonlyEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_import_tests_models_char_noreadonly
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKey(BaseImportTestsModelsCharNoreadonlyEntity record);
}