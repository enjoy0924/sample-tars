package com.alr.mp.servants.impl;

import com.alr.mp.eds.service.ISampleService;
import com.alr.mp.servants.MallServant;
import com.alr.mp.servants.SampleItem;
import com.alr.mp.utils.SpringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by G_dragon on 2017/6/1.
 *
 */
public class MarketPromotionServantImpl implements MallServant {


    @Override
    public List<SampleItem> getSampleListByCategory(String category) {

        List<SampleItem> sampleEntities = SpringUtils.getBean(ISampleService.class).findSampleByCategory(category);

        return sampleEntities;

    }

    @Override
    public List<SampleItem> getMockSampleListByCategory(String category) {

        List<SampleItem> sampleItems = new ArrayList<>();
        SampleItem sampleItem = new SampleItem();
        sampleItem.setId("XN-SC-0001");
        sampleItem.setTotalFee(14900);
        sampleItem.setDesc("$149.00 for one week");
        sampleItems.add(sampleItem);

        return sampleItems;
    }
}
