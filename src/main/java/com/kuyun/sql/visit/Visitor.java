package com.kuyun.sql.visit;


import com.kuyun.sql.ast.BinaryExp;
import com.kuyun.sql.ast.SingleExp;
import com.kuyun.sql.ast.Term;

/**
 * visitor 接口
 * Created by xuwuqiang on 2017/4/20.
 */
public interface Visitor<R> {

    /**
     * 弹幕运算符处理
     */
    R visit(SingleExp singleExp);

    /**
     * 双目运算符处理
     */
    R visit(BinaryExp binaryExpr);

    /**
     * 最小单元处理
     */
    R visit(Term term);
}
