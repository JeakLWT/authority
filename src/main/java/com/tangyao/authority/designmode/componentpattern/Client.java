package com.tangyao.authority.designmode.componentpattern;

public class Client {
    public static void main(String[] args) {
        University university = new University("清华大学","中国顶尖大学");
        Organization computerCollege = new College("计算机学院", "清华大学最厉害学院");
        Organization architectureCollege = new College("建筑学院", "清华大学男生最多的学院");
        Organization comDepartment = new Department("计算机专业", "IT人才.........");
        Organization elecDepartment = new Department("信息工程专业", "电子元器件.....");

        Organization waterManager= new Department("给排水工程","水利研究....");

        Organization  constructionDepartment = new Department("土木工程", "房屋设计.....");
        computerCollege.add(elecDepartment);
        computerCollege.add(comDepartment);
        architectureCollege.add(waterManager);
        architectureCollege.add(constructionDepartment);
        university.add(computerCollege);
        university.add(architectureCollege);
        Integer integer = Integer.valueOf(200);
        Integer integer1 = Integer.valueOf(200);
        System.out.println(integer==integer1);


        university.print();
    }
}
