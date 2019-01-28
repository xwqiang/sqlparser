package com.kuyun.test;

/**
 * Created by xuwuqiang on 2019/1/28.
 */
public class PrintVisitor implements Visitor {

    @Override
    public void visit(Parts f) {
        System.out.println("- Parts" + f);
    }

    @Override
    public void visit(Mouse f) {
        System.out.println("- mouse " + f);
    }

    @Override
    public void visit(Keybord f) {
        System.out.println("- Keybord " + f);
        f.print();
    }
}
