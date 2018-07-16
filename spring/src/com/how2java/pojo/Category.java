package com.how2java.pojo;

import org.springframework.stereotype.Component;

/**
 * @author lihoo
 * @Title: com.how2java.pojo.Category
 * @ProjectName spring
 * @Description: pojo_entity
 * @date 2018/7/15-9:44
 */

@Component("c")
public class Category {

    private int id;
    private String name="category 1";

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}