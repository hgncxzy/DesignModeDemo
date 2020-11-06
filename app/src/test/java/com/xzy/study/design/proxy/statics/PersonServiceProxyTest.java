package com.xzy.study.design.proxy.statics;

import junit.framework.TestCase;

/**
 * @author ：created by xzy.
 * @date ：2020/11/6
 */
public class PersonServiceProxyTest extends TestCase {

    public void testSavePerson() {
        PersonService personService = new PersonServiceProxy(new PersonServiceImpl(), new Transaction());
        personService.savePerson();
    }

    public void testUpdatePerson() {
    }

    public void testDeletePerson() {
    }
}