package com.kuyun.sql.ast;

import com.kuyun.sql.visit.Visitor;
import java.lang.reflect.Method;

/**
 * 语法树的抽象类 -- 不允许实例化
 * Created by xuwuqiang on 2017/4/20.
 */
public abstract class ASTree {

    private static final String VISITMETHOD = "visit";

    private static Method findMethod(Object visitor, Class<?> type) {
        if (type == Object.class) {
            return null;
        } else {
            try {
                return visitor.getClass().getMethod(VISITMETHOD, type);
            } catch (NoSuchMethodException e) {
                return findMethod(visitor, type.getSuperclass());
            }
        }
    }

    public final <R> R accept(Visitor<R> visitor) throws Exception {
        Method method = findMethod(visitor, getClass());
        if (method != null) {
            return (R) method.invoke(visitor, this);
        }
        return null;
    }
}
