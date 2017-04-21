package com.kuyun.sql.ast;

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

}
