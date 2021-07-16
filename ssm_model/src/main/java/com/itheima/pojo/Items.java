package com.itheima.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @Author 郑宗昊
 * @Date 2021/7/15 20:17
 * @Version 1.0
 */
@Data
public class Items {

    private Integer id;
    private String name;
    private Float price;
    private String pic;
    private Date createtime;
    private String detail;
}
