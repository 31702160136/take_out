package com.order.take_out.service.Impl;

import com.order.take_out.tools_homemade.RandomCoding;
import com.order.take_out.dao.BillDao;
import com.order.take_out.pojo.bill.Bill;
import com.order.take_out.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 **/
@Service
public class BillServiceImpl implements BillService {
    @Autowired
    private BillDao billDao;

    /**
     * 查询订单列表
     * @return
     */
    @Override
    public List<Bill> getBillList() {
        return billDao.findAll();
    }

    /**
     * 查询一条订单信息
     * @param id
     * @return
     */
    @Override
    public Bill getBill(Integer id) {
        if (id!=null){
            try {
                return billDao.findOne(id);
            }catch (RuntimeException e){
                throw new RuntimeException("查询订单失败!"+e.getMessage());
            }
        }else {
            throw new RuntimeException("信息不齐全,请检查是否有漏写入必填信息!");
        }
    }

    /**
     * 根据openid查询所有订单信息
     * @param id openid
     * @return
     */
    public List<Bill> getAllBillByOpenidIdList(Integer id){
        if (id!=null){
            try {
                return billDao.findAllBillByOpenidId(id);
            }catch (RuntimeException e){
                throw new RuntimeException("查询用户订单失败!"+e.getMessage());
            }
        }else {
            throw new RuntimeException("信息不齐全,请检查是否有漏写入必填信息!");
        }
    }

    /**
     * 根据merchantId查询所有订单信息
     * @param id merchantId
     * @return
     */
    public List<Bill> getAllBillByMerchantIdList(Integer id){
        if (id!=null){
            try {
                return billDao.findAllBillByMerchantId(id);
            }catch (RuntimeException e){
                throw new RuntimeException("查询商店订单失败!"+e.getMessage());
            }
        }else {
            throw new RuntimeException("信息不齐全,请检查是否有漏写入必填信息!");
        }
    }

    /**
     * 查询订单列表，附加关联信息
     * @return
     */
    @Override
    public List<Bill> getBillListAttachRelateInfoList() {
        return billDao.findAllAttachRelateInfo();
    }

    /**
     * 查询一条订单信息，附加关联信息
     * @param id
     * @return
     */
    @Override
    public Bill getBillAttachRelateInfo(Integer id) {
        if (id!=null){
            try {
                return billDao.findOneAttachRelateInfo(id);
            }catch (RuntimeException e){
                throw new RuntimeException("查询订单失败!"+e.getMessage());
            }
        }else {
            throw new RuntimeException("信息不齐全,请检查是否有漏写入必填信息!");
        }
    }

    /**
     * 创建订单
     * @param bill
     * @return
     */
    @Transactional
    @Override
    public Boolean createBill(Bill bill) {
        if (bill.getPrice()!=null&&bill.getUserOpenidId()!=null&&bill.getMerchantId()!=null){
            bill.setNumber(RandomCoding.CreateNumber());
            bill.setCreationTime(new Date());
            bill.setModificationTime(new Date());
            if (bill.getDiscounts()==null){
                bill.setDiscounts(bill.getPrice());
            }
            try {
//                创建订单
                int result=billDao.insert(bill);
                if (result>0){
                    return true;
                }else {
                    throw new RuntimeException("创建订单失败!,result："+result);
                }
            }catch (RuntimeException e){
                throw new RuntimeException("创建订单失败!"+e.getMessage());
            }
        }else {
            throw new RuntimeException("信息不齐全,请检查是否有漏写入必填信息!");
        }
    }

    /**
     * 修改订单
     * @param bill
     * @return
     */
    @Transactional
    @Override
    public Boolean modifyBill(Bill bill) {
        if (bill.getId()!=null){
            bill.setModificationTime(new Date());
            try {
//                修改订单信息
                int id=billDao.modify(bill);
                if (id>0){
                    return true;
                }else {
                    throw new RuntimeException("修改订单失败!");
                }
            }catch (RuntimeException e){
                throw new RuntimeException("修改订单失败!"+e.getMessage());
            }
        }else {
            throw new RuntimeException("信息不齐全,请检查是否有漏写入必填信息!");
        }
    }

    /**
     * 删除订单
     * @param id
     * @return
     */
    @Transactional
    @Override
    public Boolean deleteBill(Integer id) {
        if (id!=null){
            try {
//                删除订单信息
                int effectedNum=billDao.delete(id);
                if (effectedNum>0){
                    return true;
                }else {
                    throw new RuntimeException("删除订单失败!");
                }
            }catch (RuntimeException e){
                throw new RuntimeException("删除订单失败!"+e.getMessage());
            }
        }else {
            throw new RuntimeException("信息不齐全,请检查是否有漏写入必填信息!");
        }
    }
}
