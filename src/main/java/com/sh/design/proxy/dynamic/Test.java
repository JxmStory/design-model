package com.sh.design.proxy.dynamic;

import java.lang.reflect.Proxy;

/**
 * 测试
 * @Author: Administrator
 * @Date: 2020/1/17 15:39
 */
public class Test {

    public static void main(String[] args) {

        Person emp = new Employee("Shh");

        DynamicProxy proxy = new DynamicProxy<Person>(emp);

        //创建一个代理对象empProxy来代理emp，代理对象的每个执行方法都会替换执行Invocation中的invoke方法
        Person empProxy = (Person) Proxy.newProxyInstance(Person.class.getClassLoader(),
                new Class<?>[]{Person.class},
                proxy);

        //代理执行方法
        empProxy.work();

        ClassLoader classLoader = Person.class.getClassLoader();
        Class<?>[] interfaces = new Class<?>[]{Person.class};
        Person person = (Person) Proxy.newProxyInstance(classLoader, interfaces, proxy);
        person.work();

    }
}
