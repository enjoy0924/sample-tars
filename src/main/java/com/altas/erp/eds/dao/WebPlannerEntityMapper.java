package com.altas.erp.eds.dao;

import com.altas.erp.eds.entity.WebPlannerEntity;
import com.altas.erp.eds.entity.WebPlannerEntityWithBLOBs;

public interface WebPlannerEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_planner
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_planner
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insert(WebPlannerEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_planner
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insertSelective(WebPlannerEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_planner
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    WebPlannerEntityWithBLOBs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_planner
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeySelective(WebPlannerEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_planner
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(WebPlannerEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table web_planner
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKey(WebPlannerEntity record);
}