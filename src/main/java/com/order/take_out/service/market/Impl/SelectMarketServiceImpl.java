package com.order.take_out.service.market.Impl;

import com.order.take_out.dao.MarketDao;
import com.order.take_out.dao.MarketPasswordDao;
import com.order.take_out.dao.MarketUserDao;
import com.order.take_out.pojo.market.Market;
import com.order.take_out.pojo.market.MarketUser;
import com.order.take_out.service.market.SelectMarketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: take_out
 * @description:
 * @author: Mr.Yang
 * @create: 2019-03-01 22:06
 **/
@Service
public class SelectMarketServiceImpl implements SelectMarketService {
    @Autowired
    MarketDao marketDao;
    @Autowired
    MarketUserDao marketUserDao;
    @Autowired
    MarketPasswordDao marketPasswordDao;

    @Override
    public List<Market> getMarketList() {
        try {
            //查询市场
            List<Market> result=marketDao.findAll();
            return result;
        }catch (RuntimeException e){
            throw new RuntimeException("查询所有市场失败"+e.getMessage());
        }
    }

    @Override
    public Market getMarket(Integer id) {
        if (id!=null){
            try {
                //查询市场
                return marketDao.findOne(id);
            }catch (RuntimeException e){
                throw new RuntimeException("根据id查询市场失败"+e.getMessage());
            }
        }else {
            throw new RuntimeException("信息不齐全,请检查是否有漏写入必填信息!");
        }
    }

    @Override
    public List<Market> getMarketByName(String name) {
        if (name!=null){
            try {
                //查询市场
                return marketDao.findAllByName(name);
            }catch (RuntimeException e){
                throw new RuntimeException("根据name查询市场列表失败"+e.getMessage());
            }
        }else {
            throw new RuntimeException("信息不齐全,请检查是否有漏写入必填信息!");
        }
    }

    @Override
    public MarketUser getMarketUser(Integer marketId) {
        if (marketId!=null){
            try {
                //查询市场
                MarketUser marketUser=marketUserDao.findMarketUserByMarketId(marketId);
                if (marketUser!=null){
                    return marketUser;
                }else {
                    throw new RuntimeException("查询出现未知错误");
                }
            }catch (RuntimeException e){
                throw new RuntimeException("根据marketId查询市场列表失败"+e.getMessage());
            }
        }else {
            throw new RuntimeException("信息不齐全,请检查是否有漏写入必填信息!");
        }
    }

//    @Override
//    public Market getMarketPassword(Integer id) {
//        if (id!=null){
//            try {
//                //查询市场
//                return marketDao.findOne(id);
//            }catch (RuntimeException e){
//                throw new RuntimeException("根据id查询市场失败"+e.getMessage());
//            }
//        }else {
//            throw new RuntimeException("信息不齐全,请检查是否有漏写入必填信息!");
//        }
//    }
}
