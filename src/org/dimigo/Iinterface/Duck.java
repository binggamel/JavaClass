package org.dimigo.Iinterface;

public class Duck implements IAnimal{


    @Override
    public void eat() {
        System.out.println("냠");
    }

    @Override
    public void bark() {
        System.out.println("꽥");
    }
}
