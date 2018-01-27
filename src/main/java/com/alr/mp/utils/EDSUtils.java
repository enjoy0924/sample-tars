package com.alr.mp.utils;

import com.alr.mp.eds.entity.SampleEntity;
import com.alr.mp.servants.SampleItem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by G_dragon on 2017/5/31.
 *
 */
public class EDSUtils {



    public static List<SampleItem> convertSampleEnrities2Items(List<SampleEntity> sampleEntities) {

        if(null == sampleEntities || sampleEntities.isEmpty())
            return Collections.EMPTY_LIST;

        List<SampleItem> sampleItems = new ArrayList<>();
        for(SampleEntity sampleEntity : sampleEntities){
            SampleItem sampleItem = new SampleItem();
            sampleItem.setDesc(sampleEntity.getDetail());
            sampleItem.setTotalFee(sampleEntity.getCostFee());
            sampleItem.setId(sampleEntity.getId());

            sampleItems.add(sampleItem);
        }

        return sampleItems;
    }
}
