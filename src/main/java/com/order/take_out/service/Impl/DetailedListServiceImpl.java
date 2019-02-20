package com.order.take_out.service.Impl;

import com.order.take_out.dao.DetailedListDao;
import com.order.take_out.pojo.bill.DetailedList;
import com.order.take_out.service.DetailedListService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @program: take_out
 * @description:
 * @author: Mr.Yang
 * @create: 2019-02-20 16:16
 **/
public class DetailedListServiceImpl implements DetailedListService {
    @Autowired
    DetailedListDao detailedListDao;
    @Override
    public List<DetailedList> getDetailedListByBillIdList(Integer id) {
        if (id!=null){
            try {
                return detailedListDao.findDetailedListByBillId(id);
            }catch (RuntimeException e){
                throw new RuntimeException("查询订单食品清单列表失败!"+e.getMessage());
            }
        }else {
            throw new RuntimeException("信息不齐全,请检查是否有漏写入必填信息!");
        }
    }

    @Override
    public boolean createDetailedList(List<DetailedList> detailedLists) {
        return false;
    }

    @Override
    public boolean modifyDetailedList(DetailedList detailedList) {
        return false;
    }

    @Override
    public boolean deleteDetailedList(Integer id) {
        return false;
    }
}
