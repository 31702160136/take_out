package com.order.take_out.dao;

import com.order.take_out.pojo.client.UserOpenid;

import java.util.List;

public interface UserOpenidDao {
    /**
     * 查询所有顾客
     * @return
     */
    public List<UserOpenid> findAll();

    /**
     * 查询顾客
     * @return
     */
    public UserOpenid findOne(int id);

    /**
     * 插入信息
     * @param userOpenid
     * @return
     */
    public int insert(UserOpenid userOpenid);

    /**
     * 更新信息
     * @param userOpenid
     * @return
     */
    public int modify(UserOpenid userOpenid);

    /**
     * 删除信息
     * @param id
     * @return
     */
    public int delete(int id);
}
