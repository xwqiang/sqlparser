package com.kuyun.sql.query;

import com.kuyun.sql.ast.ASTree;
import com.kuyun.sql.ast.And;
import com.kuyun.sql.ast.BinaryExp;
import com.kuyun.sql.ast.Operation;
import com.kuyun.sql.ast.SingleExp;
import com.kuyun.sql.ast.Term;
import com.kuyun.sql.visit.PrintVisitor;
import com.kuyun.sql.visit.Visitor;

/**
 * Created by xuwuqiang on 2017/4/20.
 */
public class Main {

    public static void main(String[] args) {
        BinaryExp equalExp = new BinaryExp(new BinaryExp("a", "=", "1"), new Operation("or"), new SingleExp(new Operation("not"),new Term("single")));
        ASTree and = new And("aaa", "bbb");
        ASTree asTree = new BinaryExp(equalExp, new Operation("and"), and);

        Visitor<String> visitor = new PrintVisitor();
        String sql = asTree.accept(visitor);
        System.out.println(sql);
    }
}
