package com.kuyun.sql.ast;

import com.kuyun.sql.visit.Visitor;

/**
 * Created by xuwuqiang on 2017/4/20.
 */
public class BinaryExpr implements ASTree {

    protected ASTree left;
    protected Value token;
    protected ASTree right;


    public BinaryExpr(ASTree left, Value token, ASTree right) {
        this.left = left;
        this.token = token;
        this.right = right;
    }

    public ASTree getLeft() {
        return left;
    }

    public void setLeft(ASTree left) {
        this.left = left;
    }

    public Value getToken() {
        return token;
    }

    public void setToken(Value token) {
        this.token = token;
    }

    public ASTree getRight() {
        return right;
    }

    public void setRight(ASTree right) {
        this.right = right;
    }

    @Override
    public <R> R accept(Visitor<R> visitor) {
        return visitor.visit(this);
    }
}
