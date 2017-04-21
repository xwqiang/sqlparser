package com.kuyun.sql.ast;

/**
 * 最小单元
 * Created by xuwuqiang on 2017/4/20.
 */
public class Term extends ASTree {

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

}
