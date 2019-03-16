package com.order.take_out.controller_api.client_side_market;

import com.order.take_out.service.market.CreateMarketService;
import com.order.take_out.tools_homemade.JsonOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @program: take_out
 * @description:
 * @author: Mr.Yang
 * @create: 2019-02-26 21:02
 **/
@RestController
@RequestMapping("/market_create")
public class addMarketController {

    @Autowired
    CreateMarketService marketService;

    @RequestMapping("/createMarket")
    @ResponseBody
    public Map<String, Object> createMarket(@RequestBody Map<String,Object> map){
        boolean result=marketService.createMarket(map);
        if (result){
            return JsonOut.print("成功",JsonOut.TRUE);
        }else {
            return JsonOut.print("失败",JsonOut.FALSE);
        }
    }
}
