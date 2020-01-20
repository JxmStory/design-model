package com.sh.design.proxy.common;

/**
 *  员工（被代理类 静态代理模式中被代理类需要和代理类实现共同的接口）
 *  @author micomo
 *  @date 2020/1/20 14:25
 */
public class Employee implements Person {

    private String name;

    Employee(String name) {
        this.name = name;
    }

    /**
     * 被代理类的方法
     * @author  micomo
     * @date    2020/1/20 14:33
     */
    @Override
    public void work() {
        System.out.println(name + "  work!");
    }

}
