package com.xzy.study.design.proxy.statics;

/**
 * 静态代理模式
 * @author ：created by xzy.
 * @date ：2020/11/6
 */
public class PersonServiceProxy implements PersonService {

    /**
     * 目标类
     */
    private PersonService personService;


    /**
     * 增强类
     */
    private Transaction transaction;


    /**
     * 利用构造函数将目标类和增强类注入
     *
     * @param personService 目标类
     * @param transaction   增强类
     */
    public PersonServiceProxy(PersonService personService, Transaction transaction) {
        this.personService = personService;
        this.transaction = transaction;
    }

    @Override
    public void savePerson() {
        transaction.beginTransaction();
        personService.savePerson();
        transaction.commit();
    }

    @Override
    public void updatePerson() {
        transaction.beginTransaction();
        personService.updatePerson();
        transaction.commit();
    }

    @Override
    public void deletePerson() {
        transaction.beginTransaction();
        personService.deletePerson();
        transaction.commit();
    }

}
