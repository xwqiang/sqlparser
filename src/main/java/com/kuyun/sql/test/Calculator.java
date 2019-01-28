package com.kuyun.sql.test;

import java.util.Stack;

/**
 * Created by xuwuqiang on 2017/4/28.
 */
public class Calculator {

    private String statement;
    private String node;

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.build("3 * 2 * 4 / 6 % 5");
    }

    public void build(String statement) {
        String left = null, right = null;
        Stack stack = new Stack();

        String[] statementArr = statement.split(" ");

        for (int i = 0; i < statementArr.length; i++) {
            if (statementArr[i].equalsIgnoreCase("*")) {
                left = (String) stack.pop();
                String val = statementArr[++i];
                right = new String(val);
                stack.push(new String(left +"==="+ right));
            } else if (statementArr[i].equalsIgnoreCase("/")) {
                left = (String) stack.pop();
                String val = statementArr[++i];
                right = new String(val);
                stack.push(new String(left  +"==="+  right));
            } else if (statementArr[i].equalsIgnoreCase("%")) {
                left = (String) stack.pop();
                String val = (statementArr[++i]);
                right = new String(val);
                stack.push(new String(left  +"==="+  right));
            } else {
                stack.push(new String(String.valueOf(Integer.parseInt(statementArr[i]))));
            }
        }
        this.node = (String) stack.pop();
        System.out.println(node);
    }
}
