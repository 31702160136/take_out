package com.order.take_out.service;


import com.order.take_out.pojo.bill.Bill;

import java.util.List;

public interface BillService {
    /**
     * 获取订单列表
     * @return
     */
    public List<Bill> getBillList();


    /**
     * 获取一条订单信息
     * @param id
     * @return
     */
    public Bill getBill(Integer id);

    /**
     * 根据openid查询所有订单信息
     * @param id openid
     * @return
     */
    public List<Bill> getAllBillByOpenidIdList(Integer id);

    /**
     * 根据merchantId查询所有订单信息
     * @param id merchantId
     * @return
     */
    public List<Bill> getAllBillByMerchantIdList(Integer id);

    /**
     * 获取订单列表,附加关联信息
     * @return
     */
    public List<Bill> getBillListAttachRelateInfoList();

    /**
     * 获取一条订单,附加关联信息
     * @return
     */
    public Bill getBillAttachRelateInfo(Integer id);

    /**
     * 创建订单
     * @param bill
     * @return
     */
    public Boolean createBill(Bill bill);

    /**
     * 修改订单
     * @param bill
     * @return
     */
    public Boolean modifyBill(Bill bill);

    /**
     * 删除订单
     * @param id
     * @return
     */
    public Boolean deleteBill(Integer id);
}