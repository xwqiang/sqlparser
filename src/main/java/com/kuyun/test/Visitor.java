package com.kuyun.test;

/**
 * Created by xuwuqiang on 2019/1/28.
 */
public interface Visitor {

    void visit(Parts f);

    void visit(Mouse f);

    void visit(Keybord f);
}
