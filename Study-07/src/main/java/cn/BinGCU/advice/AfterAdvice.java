package cn.BinGCU.advice;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class AfterAdvice implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("In AfterAdvice：施工完毕，开车运走");
    }
}
