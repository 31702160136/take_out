package com.order.take_out.service;

import com.order.take_out.pojo.bill.DetailedList;

import java.util.List;

public interface DetailedListService {
    /**
     * 根据BillId查询订单菜品列表，一个订单存在多个菜品
     * @param id
     * @return
     */
    public List<DetailedList> getDetailedListByBillIdList(Integer id);

    /**
     * 插入信息
     * @param detailedLists
     * @return
     */
    public boolean createDetailedList(List<DetailedList> detailedLists);

    /**
     * 更新信息
     * @param detailedList
     * @return
     */
    public boolean modifyDetailedList(DetailedList detailedList);

    /**
     * 删除信息
     * @param id
     * @return
     */
    public boolean deleteDetailedList(Integer id);
}
