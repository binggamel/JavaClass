package org.dimigo.oop2;

public class Car {
    //정적필드
    private static String company;
    //인스턴스 필드
    private String name;
    //static block
    static {
        company = "기아";
        System.out.println("static block 호출");
    }
    public Car(String name){  //private -> 생성자 호출을 막음
        this.name= name;
        System.out.println("생성자 호출");
    }

    public static String getCompany() {
        return company;
    }

    public static void setCompany(String company) {
        Car.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return company + " : " + name;
    }
}
