package com.kuyun.sql.visit;


import com.kuyun.sql.ast.BinaryExp;
import com.kuyun.sql.ast.SingleExp;
import com.kuyun.sql.ast.Term;

/**
 * 输出成字符串
 * Created by xuwuqiang on 2017/4/20.
 */
public class PrintVisitor implements Visitor<String> {

    private static final String LEFTBRACE = "(";
    private static final String RIGHTBRACE = ")";
    private static final String EMPTY = "";

    private String result = EMPTY;

    private static String brace(String... values) {
        String braceValue = LEFTBRACE;
        for (String value : values) {
            braceValue += value;
        }
        braceValue += RIGHTBRACE;
        return braceValue;
    }

    @Override
    public String visit(SingleExp singleExp) throws Exception {
        String temp = singleExp.getExpresion().accept(this);
        String op = singleExp.getOperation().toString();
        result = brace(op, temp);
        return result;
    }

    @Override
    public String visit(Term term) {
        result = " " + term.getTerm() + " ";
        return result;
    }

    @Override
    public String visit(BinaryExp binaryExpr) throws Exception {
        binaryExpr.getLeftExpression().accept(this);
        String temp = result;
        String op = binaryExpr.getOperation().toString();
        binaryExpr.getRightExpression().accept(this);
        result = brace(temp, op, result);
        return result;
    }
}
