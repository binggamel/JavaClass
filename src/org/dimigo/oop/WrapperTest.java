package org.dimigo.oop;

public class WrapperTest {
    public static void main(String[] args) {
        //Wrapper 클래스 : Primitive Type을 객체화 시켜주는 서비스
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.toBinaryString(10)); //2진수로 바꿔주는것
        System.out.println(Integer.toOctalString(10)); //8진수
        System.out.println(Integer.toHexString(10)); //16진수


        //Boxing
        // 1) 생성자
        Integer i1 = new Integer(100);
        Integer i2 = new Integer("100");

        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));


        // 2) valueOf()
        Integer i3 = Integer.valueOf(100);
        Double d1 = Double.valueOf(3.14);


        //unboxing
        int r1 = i3.intValue();
        double r2 = d1.doubleValue();

        //문자열 -> Primitive Data Type - parseXxx()
        int p1 = Integer.parseInt("200");
        double p2 = Double.parseDouble("3.14");

        System.out.println(args[0]); // "100"
        System.out.println(args[1]); // "200"

        // 100 + 200 = 300
        int p3 = Integer.parseInt(args[0]);
        int p4 = Integer.parseInt(args[1]);

        System.out.println(p3 + p4);

        Integer a = new Integer(1000);
        Integer b = new Integer(2000);
        System.out.println( a + b );

        Integer c = 1000;
        int d = c + 2000; // 언박싱 하지 않아도 사용이 가능 하다

        Integer obj1 = 10;
        Integer obj2 = obj1 + 20;
        Integer result = obj1 + obj2;

    }
}
