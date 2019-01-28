package com.kuyun.test;

/**
 * Created by xuwuqiang on 2019/1/28.
 */
public class Keybord implements Parts {

    public void accept(Visitor visitor) {
        visitor.visit(this);

    }

    public void print() {
        System.out.println("computor");
    }
}
