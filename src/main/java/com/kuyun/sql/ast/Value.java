package com.kuyun.sql.ast;

import com.kuyun.sql.visit.Visitor;

/**
 * Created by xuwuqiang on 2017/4/20.
 */
public class Value implements ASTree {

    private String value;

    public Value(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return " " + this.value + " ";
    }

    @Override
    public <R> R accept(Visitor<R> visitor) {
        return visitor.visit(this);
    }
}
