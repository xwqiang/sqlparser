package com.kuyun.sql.visit;


import com.kuyun.sql.ast.ASTree;
import com.kuyun.sql.ast.BinaryExpr;

/**
 * Created by xuwuqiang on 2017/4/20.
 */
public interface Visitor<R> {
    R visit(ASTree asTree);
    R visit(BinaryExpr binaryExpr);
}
