package com.xzy.study.design.proxy.dynamic;

import junit.framework.TestCase;

import java.lang.reflect.Proxy;

/**
 * @author ：created by xzy.
 * @date ：2020/11/6
 */
public class PersonServiceInterceptorTest extends TestCase {

    public void test() {
        Object target = new PersonServiceImpl();
        MyTransaction myTransaction = new MyTransaction();
        PersonServiceInterceptor interceptor = new PersonServiceInterceptor(target, myTransaction);
        PersonService personService = (PersonService) Proxy.newProxyInstance
                (target.getClass().getClassLoader(), target.getClass().getInterfaces(), interceptor);
        String returnValue = personService.savePerson();
        System.out.println(returnValue);
    }
}