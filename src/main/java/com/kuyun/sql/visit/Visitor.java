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
     * 单目运算符处理
     */
    R visit(SingleExp singleExp) throws Exception;

    /**
     * 双目运算符处理
     */
    R visit(BinaryExp binaryExpr) throws Exception;

    /**
     * 最小单元处理
     */
    R visit(Term term);

}
