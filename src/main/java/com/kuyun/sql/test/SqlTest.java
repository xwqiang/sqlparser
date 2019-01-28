package com.kuyun.sql.test;

import com.kuyun.sql.ast.ASTree;
import com.kuyun.sql.ast.BinaryExp;
import com.kuyun.sql.ast.Operation;
import com.kuyun.sql.ast.Term;
import com.kuyun.sql.visit.PrintVisitor;
import java.util.Arrays;
import java.util.Stack;

/**
 * Created by xuwuqiang on 2017/4/28.
 */
public class SqlTest {

    PrintVisitor printVisitor = new PrintVisitor();
    Stack<ASTree> stack = new Stack();
    Stack<Operation> operationStack = new Stack();
    Stack<ASTree> valueStack = new Stack();
    String sql = "a=1 and ( b   = 3 or\n 1 =  1)";

    public void print() throws Exception {
        while (!stack.isEmpty()) {
            ASTree asTree = stack.pop();
            String s = asTree.accept(printVisitor);
            System.out.println("s:" + s);
        }
    }
    public static void main(String[] args) throws Exception {
        SqlTest sqlTest = new SqlTest();
        sqlTest.build();
        sqlTest.print();
    }

    public void build() throws Exception {

        String[] statementArr = sql.split("\\b+");

        System.out.println(Arrays.toString(statementArr));
        for (int i = 0; i < statementArr.length; i++) {

            if (statementArr[i].equalsIgnoreCase("=")) {
                ASTree left = stack.pop();
                System.out.println("pop term : " + left.accept(printVisitor));
                Operation operation = new Operation(statementArr[i]);
                ASTree right = new Term(statementArr[++i]);
                ASTree asTree = new BinaryExp(left, operation, right);
                stack.push(asTree);
            } else {
                System.out.println("push term : " + statementArr[i]);
                stack.push(new Term(statementArr[i]));
            }
        }


    }

}
