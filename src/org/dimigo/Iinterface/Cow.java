package org.dimigo.Iinterface;

public class Cow implements IAnimal {
    @Override
    public void eat() {
        System.out.println("uhmm");
    }

    @Override
    public void bark() {
        System.out.println("음매");
    }
}
