package com.altas.erp.eds.dao;

import com.altas.erp.eds.entity.WebEditorConverterTestEntity;
import com.altas.erp.eds.entity.WebEditorConverterTestEntityWithBLOBs;

public interface WebEditorConverterTestEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_editor_converter_test
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_editor_converter_test
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insert(WebEditorConverterTestEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_editor_converter_test
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insertSelective(WebEditorConverterTestEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_editor_converter_test
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    WebEditorConverterTestEntityWithBLOBs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_editor_converter_test
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeySelective(WebEditorConverterTestEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_editor_converter_test
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(WebEditorConverterTestEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_editor_converter_test
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKey(WebEditorConverterTestEntity record);
}