package com.xzy.study.design;


import com.xzy.study.design.proxy.statics.PersonService;
import com.xzy.study.design.proxy.statics.PersonServiceImpl;
import com.xzy.study.design.proxy.statics.PersonServiceProxy;
import com.xzy.study.design.proxy.statics.Transaction;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void proxyTest(){
        PersonService personService = new PersonServiceProxy(new PersonServiceImpl(), new Transaction());
        personService.savePerson();
    }
}