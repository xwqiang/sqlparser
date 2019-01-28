package com.kuyun.test;

/**
 * Created by xuwuqiang on 2019/1/28.
 */
public class Mouse implements Parts {

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
