package com.kuyun.test;

/**
 * Created by xuwuqiang on 2019/1/28.
 */
public class Client {

    public static void main(String[] args) {
        PrintVisitor printVisitor = new PrintVisitor();
        Parts mouse = new Mouse();
        mouse.accept(printVisitor);
//        printVisitor.visit(mouse);  // parts
    }

}
