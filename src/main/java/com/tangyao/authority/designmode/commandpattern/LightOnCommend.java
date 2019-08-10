package com.tangyao.authority.designmode.commandpattern;

public class LightOnCommend implements ICommend{
    private LightReciver lightReciver;

    public LightOnCommend(LightReciver lightReciver) {
        this.lightReciver = lightReciver;
    }

    @Override
    public void excute() {
        lightReciver.on();
    }

    @Override
    public void undo() {
        lightReciver.off();
    }
}
