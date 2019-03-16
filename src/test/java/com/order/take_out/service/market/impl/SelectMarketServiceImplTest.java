package com.order.take_out.service.market.impl;

import com.order.take_out.pojo.market.MarketAdminInfo;
import com.order.take_out.service.market.SelectMarketService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@SpringBootTest
@RunWith(SpringRunner.class)
public class SelectMarketServiceImplTest {
    @Autowired
    SelectMarketService selectMarketService;
    @Test
    public void getMarketAdminInfo() {
        MarketAdminInfo marketAdminInfo=selectMarketService.getMarketAdminInfo(39);
        System.out.println(marketAdminInfo.toString());
    }
}