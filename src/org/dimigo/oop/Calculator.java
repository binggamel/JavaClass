package org.dimigo.oop;

public class Calculator {
    //static이 없는 필드 -> 인스턴드 필드 (객체를 new해서 만들때 생성)
   private int num1;
   private int num2;
   private boolean powerFlag;

    public Calculator(){ } //기본 생성자

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

//    public int getNum1() {
//        return num1;
//    }
//
//    public void setNum1(int num1) {
//        this.num1 = num1;
//    }
//
//    public int getNum2() {
//        return num2;
//    }
//
//    public void setNum2(int num2) {
//        this.num2 = num2;
//    }

    public int add(){
        this.powerOn();
        return this.num1 + this.num2;
    }

    public int sub() {
        this.powerOn();
        return this.num1 - this.num2;

    }

    public int mul(){
        this.powerOn();
        return this.num1 * this.num2;
    }

    public double div(){
        this.powerOn();
        return (double)this.num1 / this.num2;
    }

    public void powerOn(){
        if(this.powerFlag == false) {
            System.out.println("전원을 켭니다");
            this.powerFlag = true;
        }

    }

    public void powerOff(){
        if(this.powerFlag) {
            System.out.println("전원을 끕니다");
            this.powerFlag = false;
        }
    }



}
