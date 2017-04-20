package com.kuyun.sql.query;

import com.kuyun.sql.ast.ASTree;
import com.kuyun.sql.ast.BinaryExpr;
import com.kuyun.sql.ast.Value;
import com.kuyun.sql.visit.PrintVisitor;
import com.kuyun.sql.visit.Visitor;

/**
 * Created by xuwuqiang on 2017/4/20.
 */
public class Main {

    public static void main(String[] args) {
        BinaryExpr binaryExpr = new BinaryExpr(new Value("a"), new Value("and"), new Value("c"));
        ASTree asTree = new BinaryExpr(binaryExpr, new Value("or"), new Value("c"));

        Visitor<String> visitor = new PrintVisitor();
        String sql = asTree.accept(visitor);
        System.out.println(sql);
    }
}
