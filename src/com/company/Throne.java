package com.company;

import java.util.ArrayList;
import java.util.List;

public class Throne implements IObservable{
    static int throneHealth=10;
    private List<IObserver>observers = new ArrayList<>();

    @Override
    public void add(IObserver obs) {
        this.observers.add(obs);
    }

    @Override
    public void remove(IObserver obs) {
        this.observers.remove(obs);
    }

    @Override
    public void sendMessage() {
        for(IObserver obs:this.observers){
            obs.update(throneHealth);
        }
    }

    public void hit(){
        throneHealth--;
        sendMessage();
    }
}
