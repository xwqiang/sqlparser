package com.kuyun.sql.ast;

import com.kuyun.sql.visit.Visitor;

/**
 * Created by xuwuqiang on 2017/4/20.
 */
public interface ASTree {

    public <R> R accept(Visitor<R> visitor);

}
