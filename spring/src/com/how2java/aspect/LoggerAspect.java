package com.how2java.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author lihoo
 * @Title: LoggerAspect
 * @ProjectName spring
 * @Description: 准备日志切面 LoggerAspect
 * @date 2018/7/15-11:11
 */

@Aspect
@Component
public class LoggerAspect {

    @Around(value = "execution(* com.how2java.service.ProductService.*(..))")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("start log:" + joinPoint.getSignature().getName());
        Object object = joinPoint.proceed();
        System.out.println("end log:" + joinPoint.getSignature().getName());
        return object;
    }

//    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
//        System.out.println("start log:" + joinPoint.getSignature().getName());
//        //运行核心业务类之前的时间
//        long startTime = System.currentTimeMillis();
//        Object object = joinPoint.proceed();     //运行核心业务类就是这句代码，为什么我也不知道
//        System.out.println("end log:" + joinPoint.getSignature().getName());
//        //运行核心业务类之后的时间
//        long endTime = System.currentTimeMillis();
//        //总运行时间
//        long Time = endTime - startTime;
//        System.out.println(Time);
//        return object;
//    }
}
