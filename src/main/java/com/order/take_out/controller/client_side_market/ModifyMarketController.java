package com.order.take_out.controller.client_side_market;

import com.order.take_out.pojo.market.Market;
import com.order.take_out.pojo.market.MarketAdminInfo;
import com.order.take_out.pojo.market.ServiceInfo;
import com.order.take_out.service.market.CreateMarketService;
import com.order.take_out.service.market.ModifyMarketService;
import com.order.take_out.tools_homemade.JsonOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @program: take_out
 * @description:
 * @author: Mr.Yang
 * @create: 2019-03-04 19:53
 **/
@RestController
@RequestMapping("market_modify")
public class ModifyMarketController {
    @Autowired
    ModifyMarketService modifyMarketService;

    @RequestMapping("/modifyMarket")
    @ResponseBody
    public Map<String, Object> modifyMarket(Market market){
        boolean result=modifyMarketService.modifyMarket(market);
        return JsonOut.print("成功");
    }

    @RequestMapping("/modifyMarketAdminInfo")
    @ResponseBody
    public Map<String, Object> modifyMarketAdminInfo(MarketAdminInfo marketAdminInfo) {
        boolean result=modifyMarketService.modifyMarketAdminInfo(marketAdminInfo);
        return JsonOut.print("成功");
    }

    @RequestMapping("/modifyServiceInfo")
    @ResponseBody
    public Map<String, Object> modifyServiceInfo(ServiceInfo serviceInfo) {
        boolean result=modifyMarketService.modifyServiceInfo(serviceInfo);
        return JsonOut.print("成功");
    }
}
