package org.dimigo.oop;

public class SinggletonTest {
    public static void main(String[] args) {
//        Singleton s = new Singleton() //안됨
        System.out.println(Singleton.getInstance2());
        System.out.println(Singleton.getInstance2());
        System.out.println(Singleton.getInstance2());
    }
}
