package com.order.take_out.controller_api.client_side_market;

import com.order.take_out.pojo.market.Market;
import com.order.take_out.service.market.SelectMarketService;
import com.order.take_out.tools_homemade.JsonOut;
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

    @RequestMapping("/getMarketLists")
    @ResponseBody
    public Map<String,Object> getMarketList(Integer page,Integer pageSize){
        List<Map<String,Object>> list=selectMarketService.getMarketList(page,pageSize);
        return JsonOut.print(list,JsonOut.TRUE);
    }

    @RequestMapping("/getMarket")
    @ResponseBody
    public Map<String,Object> getMarket(Integer id) {
        Market market=selectMarketService.getMarket(id);
        return JsonOut.print(market,JsonOut.TRUE);
    }

    @RequestMapping("/getMarketByName")
    @ResponseBody
    public Map<String,Object> getMarketByName(String name){
        List<Market> list=selectMarketService.getMarketByName(name);
        return JsonOut.print(list,JsonOut.TRUE);
    }

    @RequestMapping("/getDetailedInfo")
    @ResponseBody
    public Map<String,Object> getDetailedInfo(Integer id){
        System.out.println(id);
        Map<String,Object> map=selectMarketService.getDetailedInfo(id);
        return JsonOut.print(map,JsonOut.TRUE);
    }
}
