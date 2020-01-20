package com.sh.design.proxy.dynamic;

/**
 * 员工
 * @Author: Administrator
 * @Date: 2020/1/17 15:30
 */
public class Employee implements Person {

    private String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public void work() {
        System.out.println(name + "  work!");
    }

}
