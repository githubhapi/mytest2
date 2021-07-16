package com.itheima.controller;

import com.itheima.pojo.Items;
import com.itheima.pojo.Result;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author 郑宗昊
 * @Date 2021/7/16 15:40
 * @Version 1.0
 */
@Controller
@RequestMapping("/items")
public class ItemsController {
    @Autowired
    private ItemsService itemsService;

    /**
     * 把数据放入model对象汇总,就相当于放入结果集对象中了
     * @param model 要传出的数据
     * @return 页面
     */
    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("查询所有人...");
        List<Items> itemsList = itemsService.findAll();

        for (Items items : itemsList) {
            System.out.println("items="+items);
        }
        //items为key是因为前端的 forEach items="${items}"
        model.addAttribute("items",itemsList);

        return "items";
    }

    /**
     * 添加一条数据,完成之后跳转到查找所有人
     * 再跳到items页面去显示
     * @param items 要添加的人
     */
    @RequestMapping("/save")
    public String save(Items items){
        int save = itemsService.save(items);

        System.out.println("保存行数="+save);
        return "redirect:/items/findAll";
    }
}
