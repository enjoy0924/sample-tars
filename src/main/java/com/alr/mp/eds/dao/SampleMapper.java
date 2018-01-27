package com.alr.mp.eds.dao;

import com.alr.mp.eds.entity.SampleEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface SampleMapper extends BaseMapper<SampleEntity> {

    List<SampleEntity> selectByCategory(String category);
}