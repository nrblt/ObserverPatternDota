package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Throne thr=new Throne();

        Character AntiMag=new Character(thr);
        thr.add(AntiMag);
        thr.hit();

//        System.out.println(5/2);
    }
}
