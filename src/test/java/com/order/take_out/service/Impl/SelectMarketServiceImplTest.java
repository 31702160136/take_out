package com.order.take_out.service.Impl;

import com.order.take_out.pojo.market.Market;
import com.order.take_out.service.market.SelectMarketService;
import org.apache.commons.collections.map.HashedMap;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SelectMarketServiceImplTest {

    @Autowired
    SelectMarketService selectMarketService;

    @Test
    public void getMarketList() {
        List<Map<String,Object>> list = selectMarketService.getMarketList(1,10);
        System.out.println(list.toString());
    }

    @Test
    public void getMarket() {
        Market market = selectMarketService.getMarket(1);
        System.out.println(market.toString());
    }

    @Test
    public void getMarketByName() {
        List<Market> list = selectMarketService.getMarketByName("深圳");
        System.out.println(list.toString());
    }


}