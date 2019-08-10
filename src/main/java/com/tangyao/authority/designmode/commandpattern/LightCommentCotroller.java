package com.tangyao.authority.designmode.commandpattern;

public class LightCommentCotroller {
    ICommend LightOnCommend[];
    ICommend LightOffCommend[];

    ICommend undoCommend;

    public LightCommentCotroller() {
        //LightOnCommend = new LightOnCommend[]; 会报错，ArrayStoreException 父类能向下兼容，子类不能向上兼容
        LightOnCommend = new ICommend[5];
        LightOffCommend = new ICommend[5];
        for (int i = 0; i <5 ; i++) {
            LightOnCommend[i]=new NoCommend();
            LightOffCommend[i]=new NoCommend();
        }
    }

    public void setLightOnCommend(int no,ICommend lightOnCommend,ICommend lightOffCommend){
        LightOnCommend[no]=lightOnCommend;
        LightOffCommend[no]=lightOffCommend;
    }


    public void action(int no){
        LightOnCommend[no].excute();
        undoCommend= LightOffCommend[no];
    }

    public void unAction(int no){
        LightOffCommend[no].excute();
        undoCommend= LightOnCommend[no];
    };

    public void cancled(){
        undoCommend.excute();
    }

}
