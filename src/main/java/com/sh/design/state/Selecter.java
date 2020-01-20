package com.sh.design.state;

public class Selecter {

    public static final Computer add = new Add();
    public static final Computer subtract = new Subtract();

    private Computer state = add;

    public void setState(Computer state) {
        this.state = state;
    }

    public String compute(String num1, String num2){
        return state.compute(num1, num2);
    }
}
