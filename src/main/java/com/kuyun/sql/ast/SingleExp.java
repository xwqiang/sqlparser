package com.kuyun.sql.ast;

/**
 * 一目运算符
 * Created by xuwuqiang on 2017/4/20.
 */
public class SingleExp extends ASTree {

    protected Operation operation;
    protected ASTree expresion;


    public SingleExp(Operation operation, ASTree expresion) {
        this.operation = operation;
        this.expresion = expresion;
    }

    public SingleExp(String operation, ASTree expresion) {
        this.operation = new Operation(operation);
        this.expresion = expresion;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public ASTree getExpresion() {
        return expresion;
    }

    public void setExpresion(ASTree expresion) {
        this.expresion = expresion;
    }

}
