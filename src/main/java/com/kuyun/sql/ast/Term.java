package com.kuyun.sql.ast;

import com.kuyun.sql.visit.Visitor;

/**
 * 最小单元
 * Created by xuwuqiang on 2017/4/20.
 */
public class Term implements ASTree {

    private String term;

    public Term(String term) {
        this.term = term;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    @Override
    public <R> R accept(Visitor<R> visitor) {
        return visitor.visit(this);
    }
}
