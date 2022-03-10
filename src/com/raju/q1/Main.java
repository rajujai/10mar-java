package com.raju.q1;

abstract class Bird{
    public abstract void fly();
}

class Parrot extends Bird{
    @Override
    public void fly() {
        System.out.println("I am Flying");
    }

    public void sing(){
        System.out.println("I am Singing");
    }
}


public class Main {
    public static void main(String[] args) {
        Bird b1 = new Parrot();
        b1.fly();
        Parrot p = (Parrot) b1;
        p.sing();
    }
}
