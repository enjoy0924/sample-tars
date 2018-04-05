package com.altas.erp.eds.dao;

import com.altas.erp.eds.entity.StockLocationRouteEntity;

public interface StockLocationRouteEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_location_route
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_location_route
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insert(StockLocationRouteEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_location_route
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insertSelective(StockLocationRouteEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_location_route
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    StockLocationRouteEntity selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_location_route
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeySelective(StockLocationRouteEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_location_route
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(StockLocationRouteEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_location_route
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKey(StockLocationRouteEntity record);
}