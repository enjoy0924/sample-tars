package com.alr.mp.eds.service.impl;

import com.alr.mp.eds.dao.SampleMapper;
import com.alr.mp.eds.entity.SampleEntity;
import com.alr.mp.eds.service.ISampleService;
import com.alr.mp.servants.SampleItem;
import com.alr.mp.utils.EDSUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by G_dragon on 2017/5/31.
 *
 */
@Service
public class SampleServiceImpl implements ISampleService {

    @Autowired
    private SampleMapper sampleMapper;

    @Override
    public List<SampleItem> findSampleByCategory(String category) {

        List<SampleEntity> sampleEntities = sampleMapper.selectByCategory(category);

        return EDSUtils.convertSampleEnrities2Items(sampleEntities);
    }
}
