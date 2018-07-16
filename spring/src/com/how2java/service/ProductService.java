package com.how2java.service;

import org.springframework.stereotype.Component;

/**
 * @author lihoo
 * @Title: ProductService
 * @ProjectName spring
 * @Description: 业务类
 * @date 2018/7/15-10:54
 */

@Component("s")
public class ProductService {

    public void doSomeService() {
        System.out.println("牛皮");
    }

//    public void doSomeService() {
//
//        System.out.println("牛皮");
//
//
//        String str = "";
//        for(int i=0;i<30000;i++){
//            str = str + i;
//        }
//        System.out.println(str);
//    }
}
