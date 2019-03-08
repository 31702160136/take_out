package com.order.take_out.service.market.Impl;

import com.order.take_out.pojo.market.MarketAdminInfo;
import com.order.take_out.service.market.ModifyMarketService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@SpringBootTest
@RunWith(SpringRunner.class)
public class ModifyMarketServiceImplTest {

    @Autowired
    ModifyMarketService modifyMarketService;
    @Test
    public void modifyMarket() {
    }

    @Test
    public void modifyMarketAdminInfo() {
        MarketAdminInfo marketAdminInfo=new MarketAdminInfo();
        marketAdminInfo.setId(11);
        marketAdminInfo.setPhone("11s");
        modifyMarketService.modifyMarketAdminInfo(marketAdminInfo);
    }
}