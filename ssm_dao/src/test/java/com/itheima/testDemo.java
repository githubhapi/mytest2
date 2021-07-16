package com.itheima;

import com.alibaba.druid.pool.DruidDataSource;
import com.itheima.dao.ItemsDao;
import com.itheima.pojo.Items;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @Author 郑宗昊
 * @Date 2021/7/15 20:54
 * @Version 1.0
 */
public class testDemo {
    @Test
    public void TestOne(){


        //1 创建spring的工厂
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-mybatis.xml");

        //2. 问spring的工厂要ItemsDao的代理对象。
        ItemsDao dao = context.getBean(ItemsDao.class);

        //3. 调用方法
        List<Items> all = dao.findAll();

        System.out.println("all=" + all);

    }
}
