package com.xzy.study.design.proxy.dynamic;

/**
 * @author ：created by xzy.
 * @date ：2020/11/6
 */
public interface PersonService {

    /**
     * savePerson
     *
     * @return string
     */
    String savePerson();

    /**
     * updatePerson
     */
    void updatePerson();

    /**
     * deletePerson
     */
    void deletePerson();

}
