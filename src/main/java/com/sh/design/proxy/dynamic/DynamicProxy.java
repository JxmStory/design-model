package com.sh.design.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理
 * @Author: Administrator
 * @Date: 2020/1/17 16:27
 */
public class DynamicProxy<T> implements InvocationHandler {

    T t;

    public DynamicProxy(T t) {
        this.t = t;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("代理执行 " + method.getName() + " 方法");
        Object object = method.invoke(t, args);
        return object;

    }

}
