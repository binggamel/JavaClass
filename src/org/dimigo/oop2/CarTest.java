package org.dimigo.oop2;

public class CarTest {
    public static void main(String[] args) {
        Car[] cars = {
                new Car("제네시스"),
                new Car("그랜저"),
                new Car("아반떼")
        };

        Car.setCompany("현대");
//        cars[0].setCompany("현대");

        for(Car a  : cars){
            System.out.println(a );
        }
        System.out.println(Integer.parseInt("100"));
        System.out.println(Math.toRadians(30));
    }
}
