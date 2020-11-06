package com.xzy.study.design.proxy.statics;

/**
 * @author ：created by xzy.
 * @date ：2020/11/6
 */
public class Transaction {
    public void beginTransaction() {
        System.out.println("开启事务 ");
    }

    public void commit() {
        System.out.println("提交事务");
    }
}
