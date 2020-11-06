package com.xzy.study.design.proxy.dynamic;

/**
 * jdk 动态代理
 *
 * @author ：created by xzy.
 * @date ：2020/11/6
 */

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class PersonServiceInterceptor implements InvocationHandler {

    /**
     * 目标类
     */
    private Object target;
    /**
     * 增强类
     */
    private MyTransaction myTransaction;


    /**
     * 构造函数注入目标类和增强类
     *
     * @param target        目标类
     * @param myTransaction 增强类
     */
    public PersonServiceInterceptor(Object target, MyTransaction myTransaction) {
        this.target = target;
        this.myTransaction = myTransaction;
    }


    /**
     * 代理类的每一个方法被调用的时候都会调用下边的这个invoke方法
     *
     * @param proxy  目标对象
     * @param method 目标对象调用的方法
     * @param args   目标对象调用的方法所传入的参数
     * @return object 返回调用方法的返回值
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        this.myTransaction.beginTransaction();
        Object returnValue = method.invoke(this.target, args);
        this.myTransaction.commit();
        return returnValue;
    }

}
