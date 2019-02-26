package com.order.take_out.service.Impl;

import com.order.take_out.pojo.merchant.Merchant;
import com.order.take_out.service.MarketService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MarketServiceImplTest {

    @Autowired
    MarketService marketService;
    @Test
    public void getMarketList() {
    }

    @Test
    public void getMerchantList() {
        List<Merchant> list=marketService.getMarketOfMerchantList(1);
        System.out.println(list);
    }

    @Test
    public void getMarket() {
    }

    @Test
    public void getMarketByName() {
    }

    @Test
    public void createMarket() {
    }

    @Test
    public void modifyMarket() {
    }

    @Test
    public void deleteMarket() {
    }
}