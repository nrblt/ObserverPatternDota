package com.company;

public class Character implements IObserver{
    private Throne throne;

    public Character(Throne throne){
        setThrone(throne);
    }

    public void setThrone(Throne throne) {
        this.throne = throne;
    }

    public Throne getThrone() {
        return throne;
    }

    @Override
    public void update(int health) {
        System.out.println("Your throne has " +health +" hp");
    }
}
