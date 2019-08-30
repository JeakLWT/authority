package com.tangyao.authority.lambda;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Person> personList=new ArrayList<>();
        personList.add(new Person("张三",34));
        personList.add(new Person("李四",20));
        personList.add(new Person("王五",21));
        Collections.sort(personList, (s1, s2) -> s1.compareTo(s2));
        System.out.println(JSON.toJSONString(personList));
    }
}
