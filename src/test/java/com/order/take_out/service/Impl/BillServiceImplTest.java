package com.order.take_out.service.Impl;

import com.order.take_out.pojo.bill.Bill;
import com.order.take_out.service.BillService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BillServiceImplTest {

    @Autowired
    BillService billService;
    @Test
    public void getBillList() {
        List<Bill> list=new ArrayList<Bill>();
        list=billService.getBillList();
        System.out.println(list);
    }

    @Test
    public void getBill() {
        Bill bill=new Bill();
        bill=billService.getBill(2);
        System.out.println(bill);
    }

    @Test
    public void getBillListAttachRelateInfo() {
        List<Bill> list=new ArrayList<Bill>();
        list=billService.getBillListAttachRelateInfoList();
        System.out.println(list);
    }

    @Test
    public void getBillAttachRelateInfo() {
        Bill bill=new Bill();
        bill=billService.getBillAttachRelateInfo(1);
        System.out.println(bill);
    }

    @Test
    public void createBill() {
        Bill bill=new Bill();
        bill.setPrice(12.2);
        bill.setIsPay(1);
        bill.setUserOpenidId(1);
        bill.setMerchantId(1);
        boolean bool=billService.createBill(bill);
        System.out.println(bool);
        System.out.println(bill.getId());
    }

    @Test
    public void modifyBill() {
        Bill bill=new Bill();
        bill.setId(1);
        bill.setPrice(99.21);
        bill.setIsPay(1);
        bill.setUserOpenidId(1);
        bill.setMerchantId(1);
        boolean bool=billService.modifyBill(bill);
        System.out.println(bool);
    }

    @Test
    public void deleteBill() {
        boolean bool=billService.deleteBill(3);
        System.out.println(bool);
    }

    @Test
    public void getAllBillByOpenidId() {
        List<Bill> list=new ArrayList<Bill>();
        list=billService.getAllBillByOpenidIdList(1);
        System.out.println(list);
    }

    @Test
    public void getAllBillByMerchantId() {
        List<Bill> list=new ArrayList<Bill>();
        list=billService.getAllBillByMerchantIdList(1);
        System.out.println(list);
    }
}