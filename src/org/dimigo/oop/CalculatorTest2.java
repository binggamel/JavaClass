package org.dimigo.oop;

public class CalculatorTest2 {
    public static void main(String[] args) {
        System.out.println(Calculator2.PI);

        Calculator2 c = new Calculator2();

     int a = 10 , b = 20 ;

//     Calculator c= new Calculator( a , b ); //static -> 객체 필요 없음!!
//        System.out.println(c);
//인스턴스 메소드는 선언하고 해줘야함.
//     c.powerOn();
        System.out.printf("%d + %d = %d\n",a,b,Calculator2.add(a,b, c));
        System.out.printf("%d - %d = %d\n",a,b,Calculator2.sub(a,b, c));
        System.out.printf("%d * %d = %d\n",a,b,Calculator2.mul(a,b, c));
        System.out.printf("%d / %d = %.1f\n",a,b,Calculator2.div(a,b, c));
//     c.powerOff();
    }
}
