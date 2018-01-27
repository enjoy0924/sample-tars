package com.alr.mp.eds.dao;

/**
 * 通用dao层基础类，基本包含了CRUD逻辑
 *
 * Created by G_dragon on 2017/5/31.
 *
 */
public interface BaseMapper<T> {

    int deleteByPrimaryKey(String id);

    int insert(T record);

    int insertSelective(T record);

    T selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);

}
