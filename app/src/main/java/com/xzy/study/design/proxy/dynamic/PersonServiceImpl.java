package com.xzy.study.design.proxy.dynamic;

/**
 * @author ：created by xzy.
 * @date ：2020/11/6
 */
public class PersonServiceImpl implements PersonService {

    @Override
    public String savePerson() {
        System.out.println("添加");
        return "保存成功！";
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
