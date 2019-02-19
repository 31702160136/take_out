package com.order.take_out.service.Impl;

import com.order.take_out.dao.CategoryDao;
import com.order.take_out.pojo.menu.Category;
import com.order.take_out.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @program: take_out
 * @description:
 * @author: Mr.Yang
 * @create: 2019-02-19 18:04
 **/
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryDao categoryDao;
    @Override
    public List<Category> getCategoryList() {
        return categoryDao.findAll();
    }

    @Override
    public List<Category> getdCategoryByMerchantIdList(Integer id) {
        if (id!=null){
            try {
                return categoryDao.findCategoryByMerchantId(id);
            }catch (RuntimeException e){
                throw new RuntimeException("查询商家菜单列表失败!"+e.getMessage());
            }
        }else {
            throw new RuntimeException("信息不齐全,请检查是否有漏写入必填信息!");
        }
    }

    @Override
    public boolean createCategory(Category category) {
        if (!category.getName().equals("")&&category.getName()!=null&&
                category.getMerchantId()!=null){
//            写入创建时间与更新时间
            category.setCreationTime(new Date());
            category.setModificationTime(new Date());
            if (category.getIndex()==null){
//                默认排序权重比
                category.setIndex(0);
            }
            try {
                //创建菜单
                int result=categoryDao.insert(category);
                if (result>0){
                    return true;
                }else {
                    throw new RuntimeException("创建菜单失败!,result："+result);
                }
            }catch (RuntimeException e){
                throw new RuntimeException("创建菜单列表失败!"+e.getMessage());
            }
        }else {
            throw new RuntimeException("信息不齐全,请检查是否有漏写入必填信息!");
        }
    }

    @Override
    public boolean modifyCategory(Category category) {
        if (category.getId()!=null){
            category.setModificationTime(new Date());
            try {
                //修改菜单
                int result=categoryDao.modify(category);
                if (result>0){
                    return true;
                }else {
                    throw new RuntimeException("修改菜单列表失败!,result："+result);
                }
            }catch (RuntimeException e){
                throw new RuntimeException("修改菜单列表失败!"+e.getMessage());
            }
        }else {
            throw new RuntimeException("信息不齐全,请检查是否有漏写入必填信息!");
        }
    }

    @Override
    public boolean deleteCategory(Integer id) {
        if (id!=null){
            try {
                //删除菜单
                int result=categoryDao.delete(id);
                if (result>0){
                    return true;
                }else {
                    throw new RuntimeException("删除菜单列表失败!,result："+result);
                }
            }catch (RuntimeException e){
                throw new RuntimeException("删除菜单列表失败!"+e.getMessage());
            }
        }else {
            throw new RuntimeException("信息不齐全,请检查是否有漏写入必填信息!");
        }
    }
}
