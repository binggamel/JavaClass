package org.dimigo.Iinterface;

public class AnimalTest {
    public static void main(String[] args) {
        IAnimal[] animals = {

                new Duck(),
                new Cow(),

        };

        IAnimal.welcome();

        System.out.println("====== 평온한 동물 농장 =====");
        for(IAnimal a : animals){
         a.eat();
        }


        System.out.println("===== 늑대가 나타났다 =====");
        for(IAnimal a : animals){
            a.bark();
        }



    }
}
