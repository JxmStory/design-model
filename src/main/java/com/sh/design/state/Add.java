package com.sh.design.state;

import com.google.common.base.Joiner;

import java.util.Arrays;

public class Add implements Computer {

    Add() {
        System.out.println("-----add------");
    }

    @Override
    public String compute(String num1, String num2) {
        String result = Joiner.on("+")
                .skipNulls()
                .join(Arrays.asList(num1, num2));
        return result;
    }

}
