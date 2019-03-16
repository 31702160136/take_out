package com.order.take_out.service.merchant;

/**
 * @program: take_out
 * @description: 创建店铺
 * @author: Mr.Yang
 * @create: 2019-03-09 14:47
 **/
public interface CreateMerchantService {

    public Boolean createMerchant(String username,String password,Integer marketId);
}
