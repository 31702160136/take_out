package com.order.take_out.service.Impl;

import com.order.take_out.dao.MarketDao;
import com.order.take_out.dao.MerchantDao;
import com.order.take_out.pojo.market.Market;
import com.order.take_out.pojo.merchant.Merchant;
import com.order.take_out.service.MarketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @program: take_out
 * @description:
 * @author: Mr.Yang
 * @create: 2019-02-26 21:21
 **/
@Service
public class MarketServiceImpl implements MarketService {

    @Autowired
    MarketDao marketDao;
    @Autowired
    MerchantDao merchantDao;

    @Override
    public List<Market> getMarketList() {
        List<Market> result=marketDao.findAll();
        return result;
    }

    @Override
    public List<Merchant> getMarketOfMerchantList(Integer id) {
        List<Merchant> result=merchantDao.findMerchantByMarketId(id);
        return result;
    }

    @Override
    public Market getMarket(Integer id) {
        if (id!=null){
            try {
                return marketDao.findOne(id);
            }catch (RuntimeException e){
                throw new RuntimeException("查询市场失败"+e.getMessage());
            }
        }else {
            throw new RuntimeException("信息不齐全,请检查是否有漏写入必填信息!");
        }
    }

    @Override
    public List<Market> getMarketByName(String name) {
        if (name!=null){
            try {
                return marketDao.findAllByName(name);
            }catch (RuntimeException e){
                throw new RuntimeException("查询市场列表失败"+e.getMessage());
            }
        }else {
            throw new RuntimeException("信息不齐全,请检查是否有漏写入必填信息!");
        }
    }

    @Override
    public Boolean createMarket(Market market) {
        return null;
    }

    @Override
    public Boolean modifyMarket(Market market) {
        return null;
    }

    @Override
    public Boolean deleteMarket(Integer id) {
        return null;
    }
}
