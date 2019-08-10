package com.tangyao.authority.designmode.commandpattern;

public class LightOffCommend implements ICommend{
    private LightReciver reciver;

    public LightOffCommend(LightReciver reciver) {
        this.reciver = reciver;
    }

    @Override
    public void excute() {
        reciver.off();
    }

    @Override
    public void undo() {
        reciver.on();
    }
}
