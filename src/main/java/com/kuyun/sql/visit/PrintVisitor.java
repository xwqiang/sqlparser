package com.kuyun.sql.visit;


import com.kuyun.sql.ast.BinaryExp;
import com.kuyun.sql.ast.SingleExp;
import com.kuyun.sql.ast.Term;

/**
 * 输出成字符串
 * Created by xuwuqiang on 2017/4/20.
 */
public class PrintVisitor extends Visitor<String> {

    private static final String LEFTBRACE = "(";
    private static final String RIGHTBRACE = ")";


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
        String op = singleExp.getOperation().toString();
        String result = singleExp.getExpresion().accept(this);
        return brace(op, result);
    }

    @Override
    public String visit(Term term) {
        return " " + term.getTerm() + " ";
    }

    @Override
    public String visit(BinaryExp binaryExpr) throws Exception {
        String left = binaryExpr.getLeftExpression().accept(this);
        String op = binaryExpr.getOperation().toString();
        String right = binaryExpr.getRightExpression().accept(this);
        return brace(left, op, right);
    }
}
