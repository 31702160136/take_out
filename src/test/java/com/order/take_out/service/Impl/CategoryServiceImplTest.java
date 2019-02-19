package com.order.take_out.service.Impl;

import com.order.take_out.pojo.menu.Category;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
@SpringBootTest
@RunWith(SpringRunner.class)
public class CategoryServiceImplTest {
    @Autowired
    CategoryServiceImpl categoryService;

    @Test
    public void getCategoryList() {
        List<Category> list=new ArrayList<Category>();
        list=categoryService.getCategoryList();
        System.out.println(list.toString());
    }

    @Test
    public void getdCategoryByMerchantIdList() {
        List<Category> list=new ArrayList<Category>();
        list=categoryService.getdCategoryByMerchantIdList(1);
        System.out.println(list.toString());
    }

    @Test
    public void createCategory() {
        Category category=new Category();
        category.setName("东北菜");
        category.setMerchantId(1);
        boolean result=categoryService.createCategory(category);
        System.out.println(result+",id: "+category.getId());
    }

    @Test
    public void modifyCategory() {
    }

    @Test
    public void deleteCategory() {
    }
}