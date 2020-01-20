package com.sh.design.proxy.common;

/**
 * 测试
 * @Author: Administrator
 * @Date: 2020/1/17 15:39
 */
public class Test {

    public static void main(String[] args) {

        Person emp = new Employee("Shh");

        emp.work();

        Person proxy = new EmployeeProxy(emp);

        proxy.work();

    }
}
