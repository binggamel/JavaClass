package org.dimigo.oop;

public class CalculatorTest {
    public static void main(String[] args) {
     int a = 10 , b = 20 ;
     Calculator c= new Calculator( a , b );
        System.out.println(c);
//인스턴스 메소드는 선언하고 해줘야함.
//     c.powerOn();
        System.out.printf("%d + %d = %d\n",a,b,c.add());
        System.out.printf("%d - %d = %d\n",a,b,c.sub());
        System.out.printf("%d * %d = %d\n",a,b,c.mul());
        System.out.printf("%d / %d = %.1f\n",a,b,c.div());
     c.powerOff();
    }
}
