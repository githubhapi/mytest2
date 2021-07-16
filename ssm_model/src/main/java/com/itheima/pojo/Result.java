package com.itheima.pojo;

import lombok.Data;

import java.util.List;

/**
 * @Author 郑宗昊
 * @Date 2021/7/16 15:45
 * @Version 1.0
 */
@Data
public class Result {
    private Items items;

    private boolean flag;
    private String massage;


    private List<Items> itemsList;

    public Result(boolean flag, String massage) {
        this.flag = flag;
        this.massage = massage;
    }

    public Result(boolean flag, String massage, List<Items> itemsList) {
        this.flag = flag;
        this.massage = massage;
        this.itemsList = itemsList;
    }
}
