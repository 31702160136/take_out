package com.order.take_out.dao;

import com.order.take_out.pojo.bill.DetailedList;

import java.util.List;

public interface DetailedListDao {
    /**
     * 根据BillId查询订单菜品列表，一个订单存在多个菜品
     * @param id
     * @return
     */
    public List<DetailedList> findDetailedListByBillId(int id);

    /**
     * 插入信息
     * @param detailedList
     * @return
     */
    public int insert(DetailedList detailedList);

    /**
     * 更新信息
     * @param detailedList
     * @return
     */
    public int modify(DetailedList detailedList);

    /**
     * 删除信息
     * @param id
     * @return
     */
    public int delete(int id);
}
