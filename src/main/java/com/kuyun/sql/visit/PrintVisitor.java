package com.kuyun.sql.visit;


import com.kuyun.sql.ast.ASTree;
import com.kuyun.sql.ast.BinaryExpr;

/**
 * Created by xuwuqiang on 2017/4/20.
 */
public class PrintVisitor implements Visitor<String> {

    String result = "";

    @Override
    public String visit(ASTree asTree) {
        result = asTree.toString();
        return result;
    }

    @Override
    public String visit(BinaryExpr binaryExpr) {
        binaryExpr.getLeft().accept(this);
        String r = result;
        String op = binaryExpr.getToken().toString();
        binaryExpr.getRight().accept(this);
        result = "(" + r + op + result + ")";
        return result;
    }

}
