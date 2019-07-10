package org.dimigo.inheritance;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    //부모클래스의 메소드를 자식클래스에서 재정의
    // -> 메소드 오버라이딩(Overriding)
    public void bark(){
        System.out.println("미야옹");
    }//똑같이 쓰고

    public void scratch(){
        System.out.println(name + "할퀸디!");
    }


}
