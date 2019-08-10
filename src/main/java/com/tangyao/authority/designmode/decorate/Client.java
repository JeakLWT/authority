package com.tangyao.authority.designmode.decorate;

public class Client {
    public static void main(String[] args) {
        ShortBlack shortBlack = new ShortBlack();
        shortBlack.cost();
        System.out.println("费用---"+shortBlack.cost());
        System.out.println("描述---"+shortBlack.getDesc());

        Milk milk = new Milk(shortBlack);
        double cost = milk.cost();
        final String desc = milk.getDesc();

        System.out.println(cost+"---"+desc);

    }
}
