package com.altas.erp.eds.dao;

import com.altas.erp.eds.entity.BusPresenceEntity;

public interface BusPresenceEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bus_presence
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bus_presence
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insert(BusPresenceEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bus_presence
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insertSelective(BusPresenceEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bus_presence
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    BusPresenceEntity selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bus_presence
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeySelective(BusPresenceEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bus_presence
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(BusPresenceEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bus_presence
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKey(BusPresenceEntity record);
}