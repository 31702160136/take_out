package com.order.take_out.service.Impl;

import com.order.take_out.pojo.market.Market;
import com.order.take_out.service.SelectMarketService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
@SpringBootTest
@RunWith(SpringRunner.class)
public class SelectMarketServiceImplTest {

    @Autowired
    SelectMarketService selectMarketService;
    @Test
    public void getMarketList() {
        List<Market> list=selectMarketService.getMarketList();
        System.out.println(list.toString());
    }

    @Test
    public void getMarket() {
        Market market=selectMarketService.getMarket(1);
        System.out.println(market.toString());
    }

    @Test
    public void getMarketByName() {
        List<Market> list=selectMarketService.getMarketByName("深圳");
        System.out.println(list.toString());
    }
}