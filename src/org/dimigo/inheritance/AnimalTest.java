package org.dimigo.inheritance;

public class AnimalTest {
    public static void main(String[] args) {

        Animal[] animals = {
                new Animal("동물"),
                new Dog("멍멍"),
                new Cat("야옹이"),
                new Tiger("호돌이"),
        };

        for(Animal a : animals){
            System.out.println(a);
            a.eat(); //Animal.eat()
            a.sleep();  //Animal.sleep()
            a.bark();   //Cat.bark()
        }

        Animal dog = new Dog("멍멍이");
        dog.eat();
        dog.sleep();
        //dog.wag();
        ((Dog) dog).wag();


        Animal cat = new Cat("야옹이");
        ((Cat) cat).scratch();

        System.out.println(dog instanceof Dog);
        System.out.println(cat instanceof Cat);
        System.out.println(dog instanceof Cat);
        System.out.println(cat instanceof Object);



//        Animal a = new Animal("동물"); //up캐스팅을 해야하는 이유 -> 배열처리를 할 수 있다.
//        System.out.println(a);
//        a.bark(); //Animal의 bark 멍멍
//        a.eat();
//        a.sleep();
//
//        Animal d = new Dog("멍멍");
//        System.out.println(d);
////        d.wag(); //오류남. Animal에는 wag가 없기 때문에
//        d.bark(); //Animal의 bark
//
//
//        Animal c = new Cat("야옹이");
//        System.out.println(c);
//        c.bark(); //야옹 -> 오버라이
////        c.scratch();
//
//
//        Animal t = new Tiger("호돌이");
//        System.out.println(t);
//        t.bark(); //Tiger의 bark
////        t.hunt();


    }
}
