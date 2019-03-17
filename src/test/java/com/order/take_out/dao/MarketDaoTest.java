package com.order.take_out.dao;

import com.order.take_out.pojo.market.Market;
import com.order.take_out.pojo.market.MarketUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.Assert.*;
@SpringBootTest
@RunWith(SpringRunner.class)
public class MarketDaoTest {
    @Autowired
    MarketUserDao marketUserDao;

    @Test
    public void testMarket(){
        MarketUser marketUser=new MarketUser();
        marketUser.setUsername("66666");
        marketUser.setMarketId(95);
        marketUser.setModificationTime(new Date());
        int res=marketUserDao.modify(marketUser);
        System.out.println(marketUser.getId());
    }

}