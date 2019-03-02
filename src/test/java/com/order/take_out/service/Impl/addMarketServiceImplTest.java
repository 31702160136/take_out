package com.order.take_out.service.Impl;

import com.order.take_out.service.addMarketService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@SpringBootTest
@RunWith(SpringRunner.class)
public class addMarketServiceImplTest {

    @Autowired
    addMarketService addMarketService;
    @Test
    public void createMarket() {
        boolean b=addMarketService.createMarket("aa","123");
        System.out.println(b);
    }
}