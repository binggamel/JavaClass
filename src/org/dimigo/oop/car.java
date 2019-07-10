package org.dimigo.oop;

//import java.lang.System;  //java.lang.은 유일하게 import문 없이 사
//import java.lang.String;

public class car {


    public car() { //constructor - 반환타임 없음!
    }

    private String company;
    private int price;
    private float fuelEfficiency;
    private String color;
    private String type;

    public void forward() {
        System.out.println("전진합니다~");
    }


    public void backward() {
        System.out.println("후진합니다~");
    }


    public boolean stop() {
        System.out.println("정지합니다~");
        return true;
    }

    public void turnRight(int angle) {
        System.out.println(angle+"도 우회전합니다~");
    }


    public void turnLeft(int angle) {
        System.out.println(angle+"도 좌회전합니다~");

    }

}