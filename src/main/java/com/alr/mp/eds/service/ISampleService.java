package com.alr.mp.eds.service;

import com.alr.mp.servants.SampleItem;

import java.util.List;

/**
 * Created by G_dragon on 2017/5/31.
 */
public interface ISampleService {

    List<SampleItem> findSampleByCategory(String category);
}
