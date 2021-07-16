package com.itheima.service;

import com.itheima.pojo.Items;

import java.util.List;

/**
 * @Author 郑宗昊
 * @Date 2021/7/15 21:54
 * @Version 1.0
 */
public interface ItemsService {
    List<Items> findAll();

    int save(Items items);
}
