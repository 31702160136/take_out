package com.order.take_out.service.market.impl;

import com.order.take_out.dao.*;
import com.order.take_out.pojo.market.Market;
import com.order.take_out.pojo.market.MarketAdminInfo;
import com.order.take_out.pojo.market.MarketUser;
import com.order.take_out.pojo.market.ServiceInfo;
import com.order.take_out.service.market.SelectMarketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.*;

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
    @Autowired
    MarketAdminInfoDao marketAdminInfoDao;
    @Autowired
    ServiceInfoDao serviceInfoDao;


    /**
     * 查询市场列表
     * @param page 页数
     * @param pageSize 行数
     * @return
     */
    @Override
    public List<Map<String,Object>> getMarketList(Integer page,Integer pageSize) {
        try {
            //页数计算
            Integer page1=(page-1)*pageSize;
            //查询所有市场
            List<Market> markets=marketDao.findAll(page1,pageSize);
            List<Map<String,Object>> maps=new ArrayList<>();
            for (int i=0;i<markets.size();i++){
                Market market=markets.get(i);
                //查询所有市场续费信息
                ServiceInfo  serviceInfo=serviceInfoDao.findServiceInfoByMarketId(market.getId());
                if (serviceInfo!=null){//如果信息不为空则
                    Map<String,Object> map=new LinkedHashMap<>();
                    //写入数据
                    map.put("id",market.getId());
                    map.put("name",market.getName());
                    map.put("address",market.getAddress());
                    map.put("isActivate",market.getIsActivate());
                    //时间戳转换时间
                    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    map.put("creationTime", format.format(serviceInfo.getCreationTime()));
                    if (serviceInfo.getEndTime()!=null){//如果过期时间不为空则时间戳转换时间
                        map.put("endTime",format.format(serviceInfo.getEndTime()));
                    }else {//如果为空则为0
                        map.put("endTime",0);
                    }
                    maps.add(map);
                }
            }
            return maps;
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

    @Override
    public MarketAdminInfo getMarketAdminInfo(Integer marketId) {
        if (marketId!=null){
            try {
                //查询市场
                MarketAdminInfo marketAdminInfo=marketAdminInfoDao.findMarketAdminInfoByMarketId(marketId);
                if (marketAdminInfo!=null){
                    return marketAdminInfo;
                }else {
                    throw new RuntimeException("查询出现未知错误");
                }
            }catch (RuntimeException e){
                throw new RuntimeException("根据marketId查询市场管理员信息失败:"+e.getMessage());
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
