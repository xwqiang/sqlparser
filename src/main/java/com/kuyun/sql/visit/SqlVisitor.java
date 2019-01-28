package com.kuyun.sql.visit;


import com.kuyun.sql.ast.ASTree;
import com.kuyun.sql.ast.BinaryExp;
import com.kuyun.sql.ast.SingleExp;
import com.kuyun.sql.ast.Term;

/**
 * 关键字识别
 * Created by xuwuqiang on 2017/4/20.
 */
public class SqlVisitor extends Visitor<Boolean> {



    @Override
    public Boolean visit(SingleExp singleExp) throws Exception {
        String op = singleExp.getOperation().toString();
        if (op.equalsIgnoreCase("not")) {
            return true;
        }
        return false;
    }

    @Override
    public Boolean visit(Term term) {
        return false;
    }

    @Override
    public Boolean visit(BinaryExp binaryExpr) throws Exception {
        String op = binaryExpr.getOperation().toString();
        if (!op.equalsIgnoreCase("not")) {
            return true;
        }
        return false;
    }
}
