package com.altas.erp.eds.dao;

import com.altas.erp.eds.entity.WebTourTourEntity;

public interface WebTourTourEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_tour_tour
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_tour_tour
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insert(WebTourTourEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_tour_tour
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insertSelective(WebTourTourEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_tour_tour
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    WebTourTourEntity selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_tour_tour
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeySelective(WebTourTourEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_tour_tour
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(WebTourTourEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_tour_tour
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKey(WebTourTourEntity record);
}