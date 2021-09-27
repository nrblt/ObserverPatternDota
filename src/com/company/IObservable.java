package com.company;

public interface IObservable {
    void add(IObserver obs);
    void remove(IObserver obs);
    void sendMessage();
}
