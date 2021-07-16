package com.itheima.dao;

import com.itheima.pojo.Items;

import java.util.List;

/**
 * @Author 郑宗昊
 * @Date 2021/7/15 20:42
 * @Version 1.0
 */
public interface ItemsDao {
    /**
     * 能用Items就是因为在内聚的情况下,同一个模块中
     * @return 结果
     */
    List<Items> findAll();

    int save(Items items);
}
