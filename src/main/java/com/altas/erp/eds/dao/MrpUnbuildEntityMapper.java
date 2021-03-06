package com.altas.erp.eds.dao;

import com.altas.erp.eds.entity.MrpUnbuildEntity;
import com.altas.erp.eds.entity.MrpUnbuildEntityWithBLOBs;

public interface MrpUnbuildEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mrp_unbuild
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mrp_unbuild
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insert(MrpUnbuildEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mrp_unbuild
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insertSelective(MrpUnbuildEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mrp_unbuild
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    MrpUnbuildEntityWithBLOBs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mrp_unbuild
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeySelective(MrpUnbuildEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mrp_unbuild
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(MrpUnbuildEntityWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mrp_unbuild
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKey(MrpUnbuildEntity record);
}