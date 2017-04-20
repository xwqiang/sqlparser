package com.kuyun.sql.ast;

import com.kuyun.sql.visit.Visitor;

/**
 * 语法树接口
 * Created by xuwuqiang on 2017/4/20.
 */
public interface ASTree {

    <R> R accept(Visitor<R> visitor);

}
