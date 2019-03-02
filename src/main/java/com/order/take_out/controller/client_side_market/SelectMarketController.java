package com.order.take_out.controller.client_side_market;

import com.order.take_out.pojo.market.Market;
import com.order.take_out.pojo.merchant.Merchant;
import com.order.take_out.service.MarketService;
import com.order.take_out.service.SelectMarketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * @program: take_out
 * @description:
 * @author: Mr.Yang
 * @create: 2019-02-26 21:14
 **/
@RestController
@RequestMapping("market_select")
public class SelectMarketController {
    @Autowired
    SelectMarketService selectMarketService;

    @RequestMapping("/getMarketList")
    @ResponseBody
    public Map<String,Object> getMarketList(){
        List<Market> list=selectMarketService.getMarketList();
        Map<String,Object> map=new LinkedHashMap<>();
        map.put("success",true);
        map.put("code",200);
        map.put("data",list);
        return map;
    }

    @RequestMapping("/getMarket")
    @ResponseBody
    public Map<String,Object> getMarket(Integer id) {
        Market market=selectMarketService.getMarket(id);
        Map<String,Object> map=new LinkedHashMap<>();
        map.put("success",true);
        map.put("code",200);
        map.put("data",market);
        return map;
    }

    @RequestMapping("/getMarketByName")
    @ResponseBody
    public Map<String,Object> getMarketByName(String name){
        List<Market> list=selectMarketService.getMarketByName(name);
        Map<String,Object> map=new LinkedHashMap<>();
        map.put("success",true);
        map.put("code",200);
        map.put("data",list);
        return map;
    }
}
