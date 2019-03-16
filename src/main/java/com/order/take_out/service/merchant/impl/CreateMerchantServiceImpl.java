package com.order.take_out.service.merchant.impl;

import com.order.take_out.dao.MerchantDao;
import com.order.take_out.pojo.merchant.Merchant;
import com.order.take_out.service.merchant.CreateMerchantService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * @program: take_out
 * @description: 创建店铺
 * @author: Mr.Yang
 * @create: 2019-03-09 14:50
 **/
public class CreateMerchantServiceImpl implements CreateMerchantService {

    @Autowired
    MerchantDao merchantDao;
    @Override
    public Boolean createMerchant(String username, String password,Integer marketId) {
        if (marketId!=null){
            Merchant merchant=new Merchant();
            merchant.setName("");
            merchant.setAddress("");
            merchant.setIsDoBusiness(0);
            merchant.setMarketId(marketId);
            merchant.setCreationTime(new Date());
            merchant.setModificationTime(new Date());
        }

        return null;
    }
}
