package com.altas.erp.eds.dao;

import com.altas.erp.eds.entity.ResConfigEntity;

public interface ResConfigEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table res_config
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table res_config
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insert(ResConfigEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table res_config
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insertSelective(ResConfigEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table res_config
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    ResConfigEntity selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table res_config
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeySelective(ResConfigEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table res_config
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKey(ResConfigEntity record);
}