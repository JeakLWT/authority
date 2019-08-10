package com.tangyao.authority.designmode.commandpattern;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        LightReciver lightReciver=new LightReciver();
        LightCommentCotroller lightCommentCotroller = new LightCommentCotroller();
        lightCommentCotroller.setLightOnCommend(0,new LightOnCommend(lightReciver),new LightOffCommend(lightReciver));
        lightCommentCotroller.action(0);
        lightCommentCotroller.cancled();
        lightCommentCotroller.unAction(0);
        lightCommentCotroller.cancled();
    }
}
