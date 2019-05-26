package com.yyzy.zmy.utils;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspactDemo {

    @Pointcut("execution(* com.yyzy.zmy.service.UserService.getUsers())")
    private void test2(){

    }
    @Around(value = "test2()")
    public Object  around(ProceedingJoinPoint pt) throws Throwable {
        System.out.println("开始执行："+System.currentTimeMillis());
        Object proceed = pt.proceed();
        System.out.println("执行结束："+System.currentTimeMillis());
        return proceed;
    }
}
