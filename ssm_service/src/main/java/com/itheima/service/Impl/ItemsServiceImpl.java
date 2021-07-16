package com.itheima.service.Impl;

import com.itheima.dao.ItemsDao;
import com.itheima.pojo.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author 郑宗昊
 * @Date 2021/7/15 21:56
 * @Version 1.0
 *
 */
@Transactional //要加上使用事务的注解,不然不生效
@Service
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsDao itemsDao;

    public List<Items> findAll() {
        System.out.println("到了ItemsServiceImpl...");
        return itemsDao.findAll();
    }

    public int save(Items items) {
        System.out.println("到了ItemsServiceImpl...");
        int save = itemsDao.save(items);
        //int a = 1 / 0;
        return save;
    }
}
