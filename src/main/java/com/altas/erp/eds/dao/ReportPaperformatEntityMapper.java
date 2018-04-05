package com.altas.erp.eds.dao;

import com.altas.erp.eds.entity.ReportPaperformatEntity;
import com.altas.erp.eds.entity.ReportPaperformatEntityWithBLOBs;

public interface ReportPaperformatEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_paperformat
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_paperformat
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insert(ReportPaperformatEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_paperformat
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insertSelective(ReportPaperformatEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_paperformat
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    ReportPaperformatEntityWithBLOBs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_paperformat
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeySelective(ReportPaperformatEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_paperformat
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(ReportPaperformatEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table report_paperformat
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKey(ReportPaperformatEntity record);
}