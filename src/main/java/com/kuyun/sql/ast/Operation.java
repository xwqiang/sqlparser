package com.kuyun.sql.ast;

/**
 * 单词
 * Created by xuwuqiang on 2017/4/20.
 */
public class Operation {

    private String operation;

    public Operation(String operation) {
        this.operation = operation;
    }

    @Override
    public String toString() {
        return " " + this.operation + " ";
    }
}
