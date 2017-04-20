package com.kuyun.sql.visit;


import com.kuyun.sql.ast.ASTree;
import com.kuyun.sql.ast.BinaryExp;
import com.kuyun.sql.ast.SingleExp;

/**
 * 输出成字符串
 * Created by xuwuqiang on 2017/4/20.
 */
public class PrintVisitor implements Visitor<String> {

    String result = "";

    @Override
    public String visit(ASTree term) {
        result = term.toString();
        return result;
    }

    @Override
    public String visit(SingleExp singleExp) {
        String temp = singleExp.getExpresion().accept(this);
        String op = singleExp.getOperation().toString();
        result = "(" + op + temp + ")";
        return result;
    }

    @Override
    public String visit(BinaryExp binaryExpr) {
        binaryExpr.getLeftExpression().accept(this);
        String r = result;
        String op = binaryExpr.getOperation().toString();
        binaryExpr.getRightExpression().accept(this);
        result = "(" + r + op + result + ")";
        return result;
    }

}
