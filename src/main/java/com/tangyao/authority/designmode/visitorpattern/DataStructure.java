package com.tangyao.authority.designmode.visitorpattern;

import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DataStructure {

    private List<Person> list = Collections.synchronizedList(new ArrayList<>());


    public void attach(Person person) {
        list.add(person);
    }

    public void unAttach(Person person) {
        if (!CollectionUtils.isEmpty(list)) {
            list.remove(person);
        }
    }

    public void doAction(Action action) {
        for (Person person : list) {
            person.accept(action);

        }
    }

}
