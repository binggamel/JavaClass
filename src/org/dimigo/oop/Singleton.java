package org.dimigo.oop;

public class Singleton {

    private static Singleton instance = new Singleton(); //유일하게 하나만 객체 만듦!

    //new객체로 생성 못함
    private Singleton(){

    }

    public static Singleton getInstance(){

        return instance;
    }

    //Lazy initialzation
    public static Singleton getInstance2(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

}
