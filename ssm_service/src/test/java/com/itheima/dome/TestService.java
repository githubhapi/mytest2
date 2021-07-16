package com.itheima.dome;

import com.itheima.pojo.Items;
import com.itheima.service.ItemsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * @Author 郑宗昊
 * @Date 2021/7/15 23:29
 * @Version 1.0
 */
public class TestService {
    @Test
    public void testFindAll(){

        //1 建工厂
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-service.xml");

        //2. 问工厂要对象
        ItemsService is = context.getBean(ItemsService.class);

        //3. 调用方法
        System.out.println(is.findAll());

    }

    @Test
    public void testSave(){
        //1 建工厂
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-service.xml");

        //2. 问工厂要对象
        ItemsService is = context.getBean(ItemsService.class);

        Items items = new Items();
        items.setCreatetime(new Date());
        items.setName("我是你爹");
        items.setDetail("你妈死了");
        items.setPic("a.jpg");
        items.setPrice(900.9F);

        int save = is.save(items);
        System.out.println("执行行数="+save);

    }
}
