package com.tangyao.authority.lambda;

public class Person implements Comparable {
    private String name;
    private  int  age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public  void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
        Person o1 = (Person) o;
        if (this.age - o1.age > 0) {
            return 1;
        } else if (this.age - o1.age == 0) {
            return 0;
        } else {
            return -1;
        }
    }
}
