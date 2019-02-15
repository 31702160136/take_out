package com.order.take_out.dao;

import com.order.take_out.pojo.bill.Bill;

import java.util.List;

/**
 *
 */
public interface BillDao {
    /**
     * 查询订单列表
     * @return
     */
    public List<Bill> findAll();
    /**
     * 根据订单id查询一条订单信息
     * @param id
     * @return
     */
    public Bill findOne(int id);

    /**
     * 根据openid查询所有订单信息
     * @param id openid
     * @return
     */
    public List<Bill> findAllBillByOpenidId(int id);

    /**
     * 根据merchantId查询所有订单信息
     * @param id merchantId
     * @return
     */
    public List<Bill> findAllBillByMerchantId(int id);

    /**
     * 根据number查询一条订单信息
     * @param number
     * @return
     */
    public Bill findBillByBillNunber(String number);

    /**
     * 查询订单列表,附带关联信息
     * @return
     */
    public List<Bill> findAllAttachRelateInfo();

    /**
     * 查询一条订单信息,附带关联信息
     * @return
     */
    public Bill findOneAttachRelateInfo(int id);

    /**
     * 插入信息
     * @return
     */
    public int insert(Bill bill);

    /**
     * 更新信息
     * @param bill
     * @return
     */
    public int modify(Bill bill);

    /**
     * 删除信息
     * @param id
     * @return
     */
    public int delete(int id);
}
