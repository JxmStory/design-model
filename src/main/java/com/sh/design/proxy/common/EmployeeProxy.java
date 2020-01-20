package com.sh.design.proxy.common;

/**
 *  员工代理 （代理类 静态代理模式中被代理类需要和代理类实现共同的接口）
 *  @author micomo
 *  @date 2020/1/20 14:24
 */
public class EmployeeProxy implements Person {

    /**
     *  代理类中需要引入被代理类的对象
     */
    private Employee employee;

    EmployeeProxy(Person person) {
        if (person instanceof Employee) {
            this.employee = (Employee) person;
        }
    }

    @Override
    public void work() {
        /* 代理类对被代理类方法进行增强 */
        System.out.println("Proxy work!");
        /* 由被代理类对象执行方法 */
        employee.work();
    }

}
