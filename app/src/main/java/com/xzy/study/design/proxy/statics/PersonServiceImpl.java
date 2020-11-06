package com.xzy.study.design.proxy.statics;

/**
 * @author ：created by xzy.
 * @date ：2020/11/6
 */
public class PersonServiceImpl implements PersonService {

    @Override
    public void savePerson() {
        System.out.println("添加");
    }

    @Override
    public void updatePerson() {
        System.out.println("修改");
    }

    @Override
    public void deletePerson() {
        System.out.println("删除");
    }

}
