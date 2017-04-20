package com.kuyun.sql.ast;

import com.kuyun.sql.visit.Visitor;

/**
 * Created by xuwuqiang on 2017/4/20.
 */
public class And extends BinaryExp {


    public And(ASTree left, ASTree right) {
        super(left, new Operation("and"), right);
    }

    public And(String left, String right) {
        super(new Term(left), new Operation("and"), new Term(right));
    }

    @Override
    public <R> R accept(Visitor<R> visitor) {
        return visitor.visit(this);
    }
}
