package com.altas.erp.eds.dao;

import com.altas.erp.eds.entity.BaseImportTestsModelsCharRequiredEntity;

public interface BaseImportTestsModelsCharRequiredEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_import_tests_models_char_required
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_import_tests_models_char_required
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insert(BaseImportTestsModelsCharRequiredEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_import_tests_models_char_required
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insertSelective(BaseImportTestsModelsCharRequiredEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_import_tests_models_char_required
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    BaseImportTestsModelsCharRequiredEntity selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_import_tests_models_char_required
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeySelective(BaseImportTestsModelsCharRequiredEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_import_tests_models_char_required
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(BaseImportTestsModelsCharRequiredEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table base_import_tests_models_char_required
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKey(BaseImportTestsModelsCharRequiredEntity record);
}