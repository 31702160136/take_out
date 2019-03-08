package com.order.take_out.service.Impl;

import com.order.take_out.service.market.CreateMarketService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CreateMarketServiceImplTest {
    @Autowired
    CreateMarketService createMarketService;
    @Test
    public void createMarket() {
        boolean b=createMarketService.createMarket("ss","cvgdf");
        System.out.println(b);
    }
}