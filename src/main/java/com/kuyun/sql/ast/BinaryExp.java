package com.kuyun.sql.ast;

/**
 * 二目运算符
 * Created by xuwuqiang on 2017/4/20.
 */
public class BinaryExp extends ASTree {

    protected ASTree leftExpression;
    protected Operation operation;
    protected ASTree rightExpression;


    public BinaryExp(ASTree left, Operation token, ASTree right) {
        this.leftExpression = left;
        this.operation = token;
        this.rightExpression = right;
    }

    public BinaryExp(String left, String token, String right) {
        this.leftExpression = new Term(left);
        this.operation = new Operation(token);
        this.rightExpression = new Term(right);
    }


    public ASTree getLeftExpression() {
        return leftExpression;
    }

    public void setLeftExpression(ASTree leftExpression) {
        this.leftExpression = leftExpression;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public ASTree getRightExpression() {
        return rightExpression;
    }

    public void setRightExpression(ASTree rightExpression) {
        this.rightExpression = rightExpression;
    }

}
