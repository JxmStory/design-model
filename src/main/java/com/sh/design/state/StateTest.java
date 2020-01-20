package com.sh.design.state;


import org.junit.Test;

public class StateTest {
    public static void main(String[] args) {
        String result = Selecter.add.compute("a", "b");
        System.out.println(result);

        result = Selecter.subtract.compute("a", "b");
        System.out.println(result);
    }

    @Test
    public void test() {
//        Selecter selecter = new Selecter();
//        selecter.setState(Selecter.subtract);
//        System.out.println(selecter.compute("a", "b"));
//        selecter.setState(Selecter.add);
//        System.out.println(selecter.compute("a", "b"));

        System.out.println(Judge.getByCode("add").compute("a", "b"));
        System.out.println(Judge.getByCode("subtract").compute("a", "b"));
        System.out.println(Judge.getByCode("add").compute("a", "b"));
        System.out.println(Judge.getByCode("subtract").compute("a", "b"));
    }
}
