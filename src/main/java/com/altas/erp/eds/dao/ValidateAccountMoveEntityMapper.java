package com.altas.erp.eds.dao;

import com.altas.erp.eds.entity.ValidateAccountMoveEntity;

public interface ValidateAccountMoveEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table validate_account_move
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table validate_account_move
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insert(ValidateAccountMoveEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table validate_account_move
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int insertSelective(ValidateAccountMoveEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table validate_account_move
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    ValidateAccountMoveEntity selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table validate_account_move
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKeySelective(ValidateAccountMoveEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table validate_account_move
     *
     * @mbg.generated Thu Apr 05 20:29:43 CST 2018
     */
    int updateByPrimaryKey(ValidateAccountMoveEntity record);
}