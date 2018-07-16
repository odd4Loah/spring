package com.how2java.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author lihoo
 * @Title: Product
 * @ProjectName spring
 * @Description: product_entity
 * @date 2018/7/15-10:09
 */

@Component("p")
public class Product {
    private int id;
    private String name="product 1";

    @Autowired
//    @Resource(name = "c")
    private Category category;


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

    public Category getCategory() {
        return category;
    }

//    @Autowired
    public void setCategory(Category category) {
        this.category = category;
    }
}
